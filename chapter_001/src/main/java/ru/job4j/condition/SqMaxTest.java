package main.java.ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
   // Добавьте еще три теста на выборки (5,4, 2, 1) (1,5, 2, 3) (1,4, 5, 2) соответственно


    @Test
    public void whenSqMax() {
        SqMax check = new SqMax();
        int result = check.max(1,4, 2, 5);
        assertThat(result, is(5));
        //
    }

    @Test
    public void whenSqMax1() {
        SqMax check = new SqMax();
        int result = check.max(5,4, 2, 1);
        assertThat(result, is(5));
        //
    }

    @Test
    public void whenSqMax2() {
        SqMax check = new SqMax();
        int result = check.max(1,5, 2, 3);
        assertThat(result, is(5));
        //
    }

    @Test
    public void whenSqMax3() {
        SqMax check = new SqMax();
        int result = check.max(1,4, 5, 2);
        assertThat(result, is(5));
        //
    }
}