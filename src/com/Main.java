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
    }
}
