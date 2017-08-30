package com.finder.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Roshan on 30/08/17.
 */
public class OTPGeneratorTest {
    @Test
    /**
     * Scenario 1: Testing Generate OTP method generate string of length
     * passed as parameter
     */

    public void generateOTP() throws Exception {
        String abc = "";
        abc = OTPGenerator.generateOTP(6);
        assertTrue(abc.length()==6);
    }

}