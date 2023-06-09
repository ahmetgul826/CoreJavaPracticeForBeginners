package com.myproject.Homework;

public class Homework2 {

        public static void main(String[] args) {
            int n = 100; // The initial value of n
            boolean even = false;

            while (n > 1){

                if (n%2==0){
                    even = true;
                }else {
                    even = false;
                }
                if (even){
                    n = n / 2;
                    System.out.print(n+" ");
                }else{
                    n = n*3+1;
                    System.out.print(n+" ");
                }

            }

        }

}

