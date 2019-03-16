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
public class TransactionIT {
    private Transaction trans;
    
    public TransactionIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        trans = new Transaction() {
            @Override
            public String execute() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String transactionType() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setAccountNumber method, of class Transaction.
     */
    @Test
    public void testSetAccountNumber() {
        System.out.println("setAccountNumber");
        int accNo = 0;
        Transaction instance = new TransactionImpl();
        instance.setAccountNumber(accNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountNumber method, of class Transaction.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        Transaction instance = new TransactionImpl();
        int expResult = 0;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class Transaction.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Transaction instance = new TransactionImpl();
        String expResult = "";
        String result = instance.execute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transactionType method, of class Transaction.
     */
    @Test
    public void testTransactionType() {
        System.out.println("transactionType");
        Transaction instance = new TransactionImpl();
        String expResult = "";
        String result = instance.transactionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TransactionImpl extends Transaction {

        public String execute() {
            return "";
        }

        public String transactionType() {
            return "";
        }
    }
    
}
