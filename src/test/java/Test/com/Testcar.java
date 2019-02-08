/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.com;

import com.itexps.Car;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roma2
 */
public class Testcar {
    Car car;
    
    public Testcar() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCar() {
         car.setMake("Kia");
         car.setModel("Five");
         car.setPrice(35000);
         assertEquals("Kia", car.getMake());
         assertEquals("Five", car.getModel());
         assertEquals(35000, car.getPrice());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        car=new Car();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
