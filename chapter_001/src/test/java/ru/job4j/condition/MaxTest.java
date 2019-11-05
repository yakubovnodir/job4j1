package test.java.ru.job4j.condition;

import main.java.ru.job4j.condition.Max;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void Check_calculation_max_function_2() {
        int result = Max.max(-1, -2);
        assertThat(result, is(-1));
    }

    @Test
    public void Check_calculation_max_function_3() {
        int result = Max.max(-1, 0);
        assertThat(result, is(0));
    }

    @Test
    public void Check_calculation_max_function_4() {
        int result = Max.max(-1, 3);
        assertThat(result, is(3));
    }
}