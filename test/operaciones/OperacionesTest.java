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
    @Test
    public void testIsPar() {
        System.out.println("isPar true");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int a = 8;
        boolean result = instance.isPar(a);
        //(3)
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    @Test
    public void testIsParFalse() {
        System.out.println("isPar false");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int a = 7;
        boolean result = instance.isPar(a);
        //(3)
        boolean expResult = false;
        assertEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsParNegativos() {
        System.out.println("isPar negativos");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int a = -2;
        boolean result = instance.isPar(a);
    }

    /**
     * Test of extraerPositivos method, of class Operaciones.
     */
    @Test
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int[] nums = {1, -4, 6, 8, -10};
        int[] result = instance.extraerPositivos(nums);
        //(3)
        int[] expResult = {1, 6, 8};
        assertArrayEquals(expResult, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExtraerPositivosNull() {
        System.out.println("extraerPositivos null");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int[] nums = null;
        int[] result = instance.extraerPositivos(nums);
    }
    
    @Test
    public void testExtraerPositivosVacio() {
        System.out.println("extraerPositivos vacio");
        //(1)
        Operaciones instance = new Operaciones();
        //(2)
        int[] nums = {};
        int[] result = instance.extraerPositivos(nums);
        //(3)
        int[] expResult = {};
        assertArrayEquals(expResult, result);
    }

}
