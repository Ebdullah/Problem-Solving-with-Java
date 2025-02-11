package com;

public class RhombusPattern {
    public void rhombusPattern () {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
