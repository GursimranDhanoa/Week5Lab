/*
Program: .java      Last Date of this revision: ,2020

Purpose:

Author: Gur Dhanoa
 */
package models;

import java.io.Serializable;

public class account implements Serializable {

    private String username;
    private String password;

    public account() {
        username = "";
        password = "";

    }

    public account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

