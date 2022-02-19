package test.login;

import org.junit.Test;

import static org.junit.Assert.*;

public class Login_PageTest {

    @Test
    public void passwordcheck() {

        String Password;
        Password = "admin";
        assertEquals("admin",Password);


    }
    @Test
    public void passwordcheck1() {

        String Password;
        Password = "admin";
        assertEquals("root",Password);


    }
    @Test
    public void passwordcheck2() {

        String Password;
        Password = "admin";
        assertEquals("",Password);


    }
}