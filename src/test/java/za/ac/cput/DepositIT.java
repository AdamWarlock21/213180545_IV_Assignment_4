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
public class DepositIT {
    private Deposit dep;
    
    public DepositIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dep = new Deposit();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setAmount method, of class Deposit.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amnt = 0.0;
        Deposit instance = new Deposit();
        instance.setAmount(amnt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Deposit.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Deposit instance = new Deposit();
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class Deposit.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Deposit instance = new Deposit();
        String expResult = "";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transactionType method, of class Deposit.
     */
    @Test
    public void testTransactionType() {
        System.out.println("transactionType");
        Deposit instance = new Deposit();
        String expResult = "";
        String result = instance.transactionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
