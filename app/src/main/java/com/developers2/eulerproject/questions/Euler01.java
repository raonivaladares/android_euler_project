package com.developers2.eulerproject.questions;

public abstract class Euler01 {
    private static String problemEnunciation = "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.\n" +
            "\n" +
            "Find the sum of all the multiples of 3 or 5 below 1000.";

    public static String solution() {
        int sum = 0;
        for(int count = 1; count < 1000; count++) {
            if(count % 3 == 0 || count % 5 == 0) {
                sum += count;
            }
        }
        return String.valueOf(sum);
    }

    public static String getProblemEnunciation() {
        return problemEnunciation;
    }
}
