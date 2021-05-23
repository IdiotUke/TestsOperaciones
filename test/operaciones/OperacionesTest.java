/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author manu
 */
public class OperacionesTest {

    public OperacionesTest() {
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
     * Test of rango method, of class Operaciones.
     */
    @Test
    public void testRango() {
        System.out.println("rango");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int a = 6;
        int b = 9;
        int[] result = instance.rango(a, b);
        //(3)
        int[] expResult = {6, 7, 8, 9};
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testRangoInverso() {
        System.out.println("rango inverso");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int a = 9;
        int b = 6;
        int[] result = instance.rango(a, b);
        //(3)
        int[] expResult = {6, 7, 8, 9};
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of sumRango method, of class Operaciones.
     */
    @Test
    public void testSumRango() {
        System.out.println("sumRango");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int a = 6;
        int b = 9;
        int result = instance.sumRango(a, b);
        //(3)
        int expResult = 30;
        assertEquals(expResult, result);
    }

    @Test
    public void testSumRangoInverso() {
        System.out.println("sumRango inverso");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int a = 9;
        int b = 6;
        int result = instance.sumRango(a, b);
        //(3)
        int expResult = 30;
        assertEquals(expResult, result);
    }

    /**
     * Test of isPar method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testIsPar() {
        System.out.println("isPar");
        int a = 0;
        Operaciones instance = new Operaciones();
        boolean expResult = false;
        boolean result = instance.isPar(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        int[] nums = null;
        Operaciones instance = new Operaciones();
        int[] expResult = null;
        int[] result = instance.extraerPositivos(nums);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
