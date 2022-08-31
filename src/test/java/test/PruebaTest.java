package test;

import junit.framework.TestCase;
import org.junit.Test;


/*
 * Estas pruebas son solamente pruebas
 * para probar las implementaciones
 */
public class PruebaTest extends TestCase {
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
        int expResult = 5;
        int result =  a>b ? b : a ;
        assertEquals(expResult, result);
    }


}
