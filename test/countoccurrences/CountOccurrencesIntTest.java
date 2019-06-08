/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countoccurrences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Isa
 */
public class CountOccurrencesIntTest 
{
    
    public CountOccurrencesIntTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CountOccurrences method, of class CountOccurrencesInt.
     */
    @Test
    public void testCountOccurrences() {
        System.out.println("CountOccurrences");
        int arr[] = { 7,7,5,5,5,2,3};
        String exp[] = { "7:2", "5:3", "2", "3"};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //CountOccurrences instance = new countOccurrences();
        List<String> expResult = Arrays.stream(exp).collect(Collectors.toList());
        //List<String> result = instance.countOccurrences(list);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
