package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder
public class calculatorPreClassTest {
    private int x;

    @Test
    void testSum(){
        this.x += calculator.sum2(1, 2);
        assertEquals(3, this.x);
    }
    @Test
    @Order(2)
    void testSum2(){
        this.x += calculator.sum2(1, 2);
        assertEquals(6, this.x);
    }
    
    public static void main(String[] args) {
      calculatorPreClassTest testObject = new calculatorPreClassTest();
      testObject.testSum();
      testObject.testSum2();
  }
}
