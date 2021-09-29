package before_after;

import com.java2novice.junit.samples.MyEvenOdd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BeforeAndAfterAnnotationsUnitTest {

    private List<String> list;

    @Before
    public void init() {
        System.out.println("startup");
        list = new ArrayList<>(Arrays.asList("test1" , "test2"));
    }

    @Test
    public void whenCheckingListSize_thenSizeEqualsToInit() {
        System.out.println("executing test");
        assertEquals(2 , list.size());

        list.add("another test");
    }

    @Test
    public void whenCheckingListSizeAgain_thenSizeEqualsToInit() {
        System.out.println("executing another test");
        assertEquals(2 , list.size());

        list.add("yet another test");
    }


    @After
    public void teardown() {
        System.out.println("teardown");
        list.clear();
    }

}


