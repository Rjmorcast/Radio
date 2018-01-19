/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Rodrigo
 */
public class RadioTest {
    
    public RadioTest() {
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
     * Test of onOff method, of class Radio.
     */
//    @Test
//    public void testOnOff() {
//        System.out.println("onOff");
//        Radio instance = new Radio();
//        instance.onOff();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of Switch method, of class Radio.
     */
    @Test
    public void testSwitch() {
        System.out.println("Switch");
        Radio instance = new Radio();
        float expResult = (float) 87.9;
        float result = instance.Switch();
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("Switch no hizo el cambio correctamente");
        }
        expResult = (float) 530;
        result = instance.Switch();
        assertEquals(expResult, result, 0.1);
        if (!(expResult == result)){
            fail("Switch no hizo el cambio correctamente");
        } 
        
        
    }

    /**
     * Test of siguiente method, of class Radio.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        float estacion = (float) 107.9;
        Radio instance = new Radio();
        instance.Switch();
        float expResult = (float) 87.9;
        float result = instance.siguiente(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método siguiente fallo al llegar a la última estación");
        }
        estacion = (float) 88.9;
        expResult = (float) 89.1;
        result = instance.siguiente(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método siguiente fallo al cambiar de estación");
        }
        instance.Switch();
        estacion = (float) 1610;
        expResult = (float) 530;
        result = instance.siguiente(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método siguiente fallo al llegar a la última estación");
        }
        estacion = (float) 560;
        expResult = (float) 570;
        result = instance.siguiente(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método siguiente fallo al cambiar de estación");
        }
    }

    /**
     * Test of anterior method, of class Radio.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        float estacion = (float) 87.9;
        Radio instance = new Radio();
        instance.Switch();
        float expResult = (float) 107.9;
        float result = instance.anterior(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método anterior fallo al llegar a la primera estación estación");
        }
        estacion = (float) 89.1;
        expResult = (float) 88.9;
        result = instance.anterior(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método anterior fallo al cambiar de estación FM");
        }
        instance.Switch();
        estacion = (float) 530;
        expResult = (float) 1610;
        result = instance.anterior(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método anterior fallo al llegar a la última estación");
        }
        estacion = (float) 560;
        expResult = (float) 550;
        result = instance.anterior(estacion);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("el método anterior fallo al cambiar de estación");
        }
    
    }

    /**
     * Test of guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float estacion = (float) 89.9;
        int boton = 1;
        Radio instance = new Radio();
        instance.Switch();
        instance.guardar(estacion, boton);
        // TODO review the generated test code and remove the default call to fail.
        float expResult = instance.seleccionar(1);
        if (!(expResult >= 89.9)){
            fail("No se guardo correctamente");
        }
    }

    /**
     * Test of seleccionar method, of class Radio.
     */
    @Test
    public void testSeleccionar() {
        System.out.println("seleccionar");
        int boton = 3;
        Radio instance = new Radio();
        float expResult = 550;
        float result = instance.seleccionar(boton);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (!(expResult == result)){
            fail("The test case is a prototype.");
        } 
        
    }
    
}
