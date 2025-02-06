package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//mvn compile: compile main code
//mvn testCompile: "mvn compile" + compile test code
//mvn this: "mvn testCompile" + run all test cases
//mvn package: "mvn test" + package jar
//mvn install: "mvn package" + install jar to m2
public class calculatorTest {
    //unit test = requires a framework to compare the actual & 
    //Defination of pass
    @Test
    void TestSum() {
        //tc1: 1 + 2 = 3
        Assertions.assertEquals(3, calculator.sum(1, 2));
        Assertions.assertEquals(2, calculator.sum(-1, 3));
        Assertions.assertEquals(0, calculator.sum(0, 0));
        //if actual result != expected result, maven throw error
        //so that you cannot pass through the "test" cycle}
    }

    @Test
    void TestSum2(){
        
    }

    public static void main(Strings[] args) {
        calculatorTest ct = new calculatorTest();
        ct.TestSum();
    }
}
