package com.bootcamp.demo;

import org.junit.jupiter.api.Test;

public class HamcrestTest {
    @Test
    void testBasic(){
        assertThat(calculator.sum(1, 2), is(3));
    }
}
