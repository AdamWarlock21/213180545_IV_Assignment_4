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
public class WithdrawalIT {
    private Withdrawal draw;
    
    public WithdrawalIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        draw = new Withdrawal();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setAmount method, of class Withdrawal.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amnt = 0.0;
        Withdrawal instance = new Withdrawal();
        instance.setAmount(amnt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Withdrawal.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Withdrawal instance = new Withdrawal();
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class Withdrawal.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Withdrawal instance = new Withdrawal();
        String expResult = "";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transactionType method, of class Withdrawal.
     */
    @Test
    public void testTransactionType() {
        System.out.println("transactionType");
        Withdrawal instance = new Withdrawal();
        String expResult = "";
        String result = instance.transactionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
