package com.example.wubeast.calculator_v2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void div_isCorrect() throws Exception {

        assertEquals(1, 2 / 2);
    }
    @Test
    public void mult_isCorrect() throws Exception {
        assertEquals(4, 2 * 2);
    }
    @Test
    public void minus_isCorrect() throws Exception {
        assertEquals(2, 4 - 2);
    }
  //should write more tests
}