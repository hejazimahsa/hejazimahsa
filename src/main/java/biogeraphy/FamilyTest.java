package biogeraphy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    private int age;
    private String name;
    private String family;
    private String job;


    @Before
   public void init(){
        age =17;
        name="mina";
        family="tavakoli";
        job="dentist";
    }

    @Test
    public void allTest(){
      Families families  =new Families();

        assertEquals(17 , families.getAge(age));
        assertEquals( "minatavakoli" ,families.getNameFamily(name, family));
        assertEquals("dentist" , families.getJob(job));
    }


    @After
    public void finish (){
        System.out.println(age+ name+family+job);
    }

}
