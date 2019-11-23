package main.java.ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when11() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when10() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(10);
        assertThat(rsl, is(false));
    }
}