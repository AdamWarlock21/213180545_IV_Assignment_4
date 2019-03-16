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
public class BalanceInquiryIT {
    private BalanceInquiry balInq;
    
    public BalanceInquiryIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        balInq = new BalanceInquiry();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of execute method, of class BalanceInquiry.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        BalanceInquiry instance = new BalanceInquiry();
        String expResult = "";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transactionType method, of class BalanceInquiry.
     */
    @Test
    public void testTransactionType() {
        System.out.println("transactionType");
        BalanceInquiry instance = new BalanceInquiry();
        String expResult = "";
        String result = instance.transactionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
