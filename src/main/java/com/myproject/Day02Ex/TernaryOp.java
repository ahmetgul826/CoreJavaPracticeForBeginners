package com.myproject.Day02Ex;

public class TernaryOp {
    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18) {
            status = "Adult";
        } else {
            status = "Minor";
        }
        String result = age >= 18 ? "Adult" : "Minor";
        System.out.println(result);
    }
}
