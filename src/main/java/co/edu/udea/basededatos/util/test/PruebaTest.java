package co.edu.udea.basededatos.util.test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/*
 * Estas pruebas son solamente pruebas
 * para probar las implementaciones
 */
public class PruebaTest {
    @Test
    public void testNumeroMayor() {
        int a = 5;
        int b = 3;
        int expResult = 5;
        int result = a>b ? a : b ;
        assertEquals(expResult, result);
    }


    @Test
    public void testNumeroMenor1() {
        int a = 5;
        int b = 7;
        int expResult = 7;
        int result =  a>b ? b : a ;
        assertEquals(expResult, result);
    }


}
