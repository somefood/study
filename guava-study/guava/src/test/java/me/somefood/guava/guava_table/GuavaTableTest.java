package me.somefood.guava.guava_table;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class GuavaTableTest {

    @Test
    void givenTable_whenGet_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTAble = HashBasedTable.create();

        universityCourseSeatTAble.put("Mumbai", "Chemical", 120);
        universityCourseSeatTAble.put("Mumbai", "IT", 60);
        universityCourseSeatTAble.put("Harvard", "Electrical", 60);
        universityCourseSeatTAble.put("Harvard", "IT", 120);

        int seatCount = universityCourseSeatTAble.get("Mumbai", "IT");
        Integer seatCountForNoEntry = universityCourseSeatTAble.get("Oxford", "IT");

        assertThat(seatCount).isEqualTo(60);
        assertThat(seatCountForNoEntry).isEqualTo(null);
    }

    @Test
    void givenTable_whenContains_returnsSuccessfully() {
        HashBasedTable<String, String, Integer> universityCourseSeatTable = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        System.out.println(universityCourseSeatTable);

        boolean entryIsPresent = universityCourseSeatTable.contains("Mumbai", "IT");
        boolean courseIsPresent = universityCourseSeatTable.containsColumn("IT");
        boolean universityIsPresent = universityCourseSeatTable.containsRow("Mumbai");
        boolean seatCountIsPresent = universityCourseSeatTable.containsValue(60);

        assertThat(entryIsPresent).isEqualTo(true);
        assertThat(courseIsPresent).isEqualTo(true);
        assertThat(universityIsPresent).isEqualTo(true);
        assertThat(seatCountIsPresent).isEqualTo(true);
    }

    @Test
    void givenTable_whenRemove_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);

        int seatCount = universityCourseSeatTable.remove("Mumbai", "IT");

        assertThat(seatCount).isEqualTo(60);
        assertThat(universityCourseSeatTable.remove("Mumbai", "IT")).isEqualTo(null);
    }

    @Test
    void givenTable_whenColumn_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        Map<String, Integer> universitySeatMap = universityCourseSeatTable.column("IT");

        System.out.println(universitySeatMap);

        assertThat(universitySeatMap).hasSize(2);
        assertThat(universitySeatMap.get("Mumbai")).isEqualTo(60);
        assertThat(universitySeatMap.get("Harvard")).isEqualTo(120);
    }

    @Test
    void givenTable_whenColumnMap_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        Map<String, Map<String, Integer>> courseKeyUniversitySeatMap
                = universityCourseSeatTable.columnMap();

        System.out.println(courseKeyUniversitySeatMap);

        assertThat(courseKeyUniversitySeatMap).hasSize(3);
        assertThat(courseKeyUniversitySeatMap.get("IT")).hasSize(2);
        assertThat(courseKeyUniversitySeatMap.get("Electrical")).hasSize(1);
        assertThat(courseKeyUniversitySeatMap.get("Chemical")).hasSize(1);
    }

    @Test
    void givenTable_whenRow_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable
                = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        Map<String, Integer> courseSeatMap
                = universityCourseSeatTable.row("Mumbai");

        System.out.println(courseSeatMap);

        assertThat(courseSeatMap).hasSize(2);
        assertThat(courseSeatMap.get("IT")).isEqualTo(60);
        assertThat(courseSeatMap.get("Chemical")).isEqualTo(120);
    }

    @Test
    void givenTable_whenRowKeySet_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable
                = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        Set<String> universitySet = universityCourseSeatTable.rowKeySet();
        System.out.println(universitySet);

        assertThat(universitySet).hasSize(2);
    }

    @Test
    void givenTable_whenColKeySet_returnsSuccessfully() {
        Table<String, String, Integer> universityCourseSeatTable
                = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        Set<String> courseSet = universityCourseSeatTable.columnKeySet();

        System.out.println(courseSet);

        assertThat(courseSet).hasSize(3);
    }
}
