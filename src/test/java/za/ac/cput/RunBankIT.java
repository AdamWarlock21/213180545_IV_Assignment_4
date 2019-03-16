/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BooBoo
 */
public class RunBankIT {
    private RunBank rBank;
    
    public RunBankIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        rBank = new RunBank();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class RunBank.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RunBank.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
