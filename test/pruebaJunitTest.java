/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vesprada
 */
public class pruebaJunitTest {
    
    public pruebaJunitTest() {
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
     * Test of getSuma method, of class pruebaJunit.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        int a = 0;
        int b = 0;
        pruebaJunit instance = new pruebaJunit();
        int expResult = 0;
        int result = instance.getSuma(a, b);
        assertEquals("testMetdoSuma:",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getResta method, of class pruebaJunit.
     */
    @Test
    public void testGetResta() {
        System.out.println("getResta");
        int a = 2;
        int b = 0;
        pruebaJunit instance = new pruebaJunit();
        int expResult = 2;
        int result = instance.getResta(a, b);
        assertEquals("testMetdoResta:",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInc method, of class pruebaJunit.
     */
    @Test
    public void testGetInc() {
        System.out.println("getInc");
        int a = 0;
        pruebaJunit instance = new pruebaJunit();
        int expResult = 1;
        int result = instance.getInc(a);
        assertEquals("testMetdoGetInc:",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDec method, of class pruebaJunit.
     */
    @Test
    public void testGetDec() {
        System.out.println("getDec");
        int a = 2;
        pruebaJunit instance = new pruebaJunit();
        int expResult = 1;
        int result = instance.getDec(a);
        assertEquals("testMetdoGetDec:",expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
