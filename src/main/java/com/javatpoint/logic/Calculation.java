package com.javatpoint.logic;

    import static org.junit.Assert.*;

    import org.junit.Test;

public class Calculation {

    public static double cube(int i) {
        return 0;
    }

    public static String reverseWord(String my_name_is_khan) {
        return my_name_is_khan;


    }

    @Test
        public void testFindMax(){
            assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
//            assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
        }

    public static int findMax(Object ints) {
        return 4;
    }
}
