package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() throws Exception {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() throws Exception {
        int[] input = new int[] {13, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 4, 5, 13};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() throws Exception {
        int[] input = new int[] {81, 50, 55};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {50, 55, 81};
        assertThat(result, is(expect));
    }
}