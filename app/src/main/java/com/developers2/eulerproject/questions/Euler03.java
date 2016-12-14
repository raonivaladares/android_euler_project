package com.developers2.eulerproject.questions;

import android.util.Log;

public abstract class Euler03 {
    private static String problemEnunciation = "The prime factors of 13195 are 5, 7, 13 and 29.\n" +
            "\n" +
            "What is the largest prime factor of the number 600851475143 ?";

    public static String solution() {

        int number = 12;
        for(int count = number; count > 1; count--) {
            if(isPrime(count) && number % count == 0) {
                Log.d("TAG", "prime factor: " + count);
            }
        }
        return "0";
    }

    private static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }

        for(int count = 3; count * count <= n; count += 2) {
            if(n % count == 0)
                return false;
        }
        return true;
    }

    public static String getProblemEnunciation() {
        return problemEnunciation;
    }
}
