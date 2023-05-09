package me.somefood.guava.guava_set;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuavaSetTest {

    @Test
    @DisplayName("set union 테스트")
    void whenCalculatingUnionOfSets_thenCorrect() {
        Set<Character> first = ImmutableSet.of('a', 'b', 'c');
        Set<Character> second = ImmutableSet.of('b', 'c', 'd');

        Set<Character> union = Sets.union(first, second);
        assertThat(union).containsExactlyInAnyOrder('a', 'b', 'c', 'd');
    }

    @Test
    @DisplayName("카타시안 곱집합")
    void whenCalculatingCartesianProductOfSets_thenCorrect() {
        Set<Character> first = ImmutableSet.of('a', 'b');
        Set<Character> second = ImmutableSet.of('c', 'd');
        Set<List<Character>> result =
                Sets.cartesianProduct(ImmutableList.of(first, second));

        Function<List<Character>, String> func = input -> Joiner.on(" ").join(input);

        Iterable<String> joined = Iterables.transform(result, func);
        assertThat(joined).containsExactlyInAnyOrder("a c", "a d", "b c", "b d");
    }

    @Test
    @DisplayName("교집합 구하기")
    void whenCalculatingSetIntersection_thenCorrect() {
        Set<Character> first = ImmutableSet.of('a', 'b', 'c');
        Set<Character> second = ImmutableSet.of('b', 'c', 'd');

        Set<Character> intersection = Sets.intersection(first, second);
        assertThat(intersection).containsExactlyInAnyOrder('b', 'c');
    }

    @Test
    @DisplayName("교집합 외 집합 구하기 - 대칭차집합 구하기")
    void whenCalculatingSetSymmetricDifference_thenCorrect() {
        Set<Character> first = ImmutableSet.of('a', 'b', 'c');
        Set<Character> second = ImmutableSet.of('b', 'c', 'd');

        Set<Character> intersection = Sets.symmetricDifference(first, second);
        assertThat(intersection).containsExactlyInAnyOrder('a', 'd');
    }

    @Test
    @DisplayName("멱집합 구하기")
    void whenCalculatingPowerSet_thenCorrect() {
        Set<Character> chars = ImmutableSet.of('a', 'b');

        Set<Set<Character>> result = Sets.powerSet(chars);

        System.out.println(result);

        Set<Character> empty = ImmutableSet.<Character>builder().build();
        Set<Character> a = ImmutableSet.of('a');
        Set<Character> b = ImmutableSet.of('b');
        Set<Character> aB = ImmutableSet.of('a', 'b');

        assertThat(result).contains(empty, a, b, aB);
    }

    @Test
    @DisplayName("연속 집합 구하기")
    public void whenCreatingRangeOfIntegersSet_thenCreated() {
        int start = 10;
        int end = 30;
        ContiguousSet<Integer> set = ContiguousSet.create(
                Range.closed(start, end), DiscreteDomain.integers());

        System.out.println(set);

        assertEquals(21, set.size());
        assertEquals(10, set.first().intValue());
        assertEquals(30, set.last().intValue());
    }

    @Test
    public void whenInsertDuplicatesInMultiSet_thenInserted() {
        Multiset<String> names = HashMultiset.create();
        names.add("John");
        names.add("Adam", 3);
        names.add("John");

        System.out.println(names);

        assertEquals(2, names.count("John"));
        names.remove("John");
        assertEquals(1, names.count("John"));

        assertEquals(3, names.count("Adam"));
        names.remove("Adam", 2);
        assertEquals(1, names.count("Adam"));
    }

    @Test
    public void whenGetTopOcurringElementsWithMultiSet_thenCorrect() {
        Multiset<String> names = HashMultiset.create();
        names.add("John");
        names.add("Adam", 5);
        names.add("Jane");
        names.add("Tom", 2);

        System.out.println(names);

        Set<String> sorted = Multisets.copyHighestCountFirst(names).elementSet();
        List<String> sortedAsList = Lists.newArrayList(sorted);
        assertEquals("Adam", sortedAsList.get(0));
        assertEquals("Tom", sortedAsList.get(1));
    }
}
