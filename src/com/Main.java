package com;

public class Main {
    public static void main(String[] args) {
        FloydTriangle fT = new FloydTriangle();
        fT.floydTriangle();

        ZeroOneTriangle zeroOneTriangle = new ZeroOneTriangle();
        zeroOneTriangle.zeroOneTriangle();

        ButterflyPattern butterflyPattern = new ButterflyPattern();
        butterflyPattern.butterflyPattern();

        RhombusPattern rhombusPattern = new RhombusPattern();
        rhombusPattern.rhombusPattern();

        NumberPyramid numberPyramid = new NumberPyramid();
        numberPyramid.numberPyramid();

//        iterative approach
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci_series(7);
        System.out.println(" ");

//        recursive approach
        int n = 7;
        for(int i = 0; i < n; i++){
            System.out.printf(fibonacci.fibonacci_series_recursively(i) + " ");
        }
    }
}
