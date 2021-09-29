package com.java2novice.junit.samples;



import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyEvenOddTest {


    @Test
    public void testEvenOddNumber(){
        MyEvenOdd meo = new MyEvenOdd();
        assertEquals(true, meo.isEvenNumber(9));
    }

}
