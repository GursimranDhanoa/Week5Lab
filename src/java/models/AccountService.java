/*
Program: .java      Last Date of this revision: ,2020

Purpose:

Author: Gur Dhanoa
*/


package models;

import java.io.Serializable;
import java.util.*;
public class AccountService implements Serializable {
    
    public final String ABE = "abe";
    private final String BARB = "barb";
    private final String PASSWORD = "password";
    
    public AccountService(){
        
    }
    
    public account login (String username, String password){
        if ((username.equals(ABE) || username.equals(BARB)) && password.equals(PASSWORD)) {
            return new account(username, null);
        }
        return null;
    }

   
   

}

/* Sample Output



*/