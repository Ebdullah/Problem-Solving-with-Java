package com;

public class NumberPyramid {
    public void numberPyramid () {
        int n = 5;
        //first half
        for (int i = 1; i <= n; i ++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
