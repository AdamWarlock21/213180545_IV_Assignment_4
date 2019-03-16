/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**
 *
 * @author BooBoo
 */
public interface Transact {
    int Transaction(int accNo);
    
    public void setAccountNumber(int accNo);
    
    int getAccountNumber();
    
}
