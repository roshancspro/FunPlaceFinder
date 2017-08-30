/*
  This utility class is written to handle all cases of
  OTP generation and OTP verification by user

  Author: Roshan Kumar
  Date: 8/30/2017
  Company: Mad Developer

 */

package com.finder.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class OTPGenerator {

    private static final int RANDOM_GENERATOR_LIMIT = 9;

    public static void main(String args[]){
        System.out.println("First code in Android");
        System.out.println(generateOTP(6));
        System.out.println(generateOTP(6));
        System.out.println(generateOTP(5));
        System.out.println(generateOTP(4));
        System.out.println(generateOTP(6));

    }


    /**
     * This method will generate the random OTP Number of length passed as parameter
     * @param length
     */
    public static String generateOTP(int length){
        StringBuilder otp = new StringBuilder();
        int count = 0;
        Random random = new Random();

        while(count++ < length){
            otp.append(random.nextInt(RANDOM_GENERATOR_LIMIT));
        }

        return otp.toString();

    }
}
