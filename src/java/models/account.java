/*
Program: .java      Last Date of this revision: ,2020

Purpose:

Author: Gur Dhanoa
 */
package models;

import java.io.Serializable;

public class account implements Serializable {

    public String username;
    private String password;

    public account() {
        

    }

    public account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



}

