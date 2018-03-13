/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.entites.Administrateur;
import com.entites.Vol;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana
 */
public class AdministrateurActionTest {
    
    public AdministrateurActionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of afficherAdmionistrateur method, of class AdministrateurAction.
     */

    @Test
    public void testChargerVol() throws Exception {
        System.out.println("chargerVol");
        int size  = 40;
        ArrayList<Vol> result = AdministrateurAction.chargerVol();
        Vol v1 = new Vol("AC317","Air Canada","YYC","Calgary","Arivee","A50","2018-03-11","8.30");
        Vol v2 = new Vol("DL3679","Delta Air Lines","JFK","New York","Depart","A50","2018-03-11","7.00");
        Vol v3 = new Vol("AC403","Air Canada","YYZ","Toronto","Depart","A49","2018-03-12","8.05");
        assertEquals(size, result.size());
        assertTrue(result.get(0).equals(v1));
        assertTrue(result.get(20).equals(v2));
        assertTrue(result.get(39).equals(v3));
    }
    
}
