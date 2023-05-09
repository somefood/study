package me.somefood.guava.guava_list;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuavaListTest {

    @Test
    @DisplayName("리스트 만들고 역으로 바꾸기")
    void whenReverseList_thenReversed() {
        List<String> names = Lists.newArrayList("John", "Adam", "Jane");

        List<String> reversed = Lists.reverse(names);
        assertThat(reversed).contains("Jane", "Adam", "John");
    }

    @Test
    @DisplayName("String을 Character형 리스트로 변환")
    void whenCreateCharacterListFromString_thenCreated() {
        List<Character> chars = Lists.charactersOf("John");

        assertEquals(4, chars.size());
        assertThat(chars).contains('J', 'o', 'h', 'n');
    }

    @Test
    @DisplayName("리스트를 파티셔닝해서 이중 리스트로 변환")
    void whenPartitionList_thenPartitioned() {
        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom", "Viki", "Tyler");

        List<List<String>> result = Lists.partition(names, 2);

        System.out.println(result);

        assertEquals(3, result.size());
        assertThat(result.get(0)).contains("John", "Jane");
        assertThat(result.get(1)).contains("Adam", "Tom");
        assertThat(result.get(2)).contains("Viki", "Tyler");
    }

    @Test
    @DisplayName("리스트에서 중복 제거")
    void whenRemoveDuplicateFromList_thenRemoved() {
        List<Character> chars = Lists.newArrayList('h', 'e', 'l', 'l', 'o');
        assertEquals(5, chars.size());

        List<Character> result = ImmutableSet.copyOf(chars).asList();
        System.out.println(result);
        assertThat(result).contains('h', 'e', 'l', 'o');
    }

    @Test
    @DisplayName("Null인 요소 제거하기")
    void whenRemoveNullFromList_thenRemoved() {
        List<String> names = Lists.newArrayList("John", null, "Adam", null, "Jane");
        Iterables.removeIf(names, Predicates.isNull());

        assertEquals(3, names.size());
        assertThat(names).contains("John", "Adam", "Jane");
    }

    @Test
    @DisplayName("카피해서 불변리스트 만들어주기")
    void whenCreateImmutableList_thenCreated() {
        List<String> names = Lists.newArrayList("John", "Adam", "Jane");

        names.add("Tom");
        assertEquals(4, names.size());

        ImmutableList<String> immutable = ImmutableList.copyOf(names);
        assertThat(immutable).contains("John", "Adam", "Jane", "Tom");
    }
}
