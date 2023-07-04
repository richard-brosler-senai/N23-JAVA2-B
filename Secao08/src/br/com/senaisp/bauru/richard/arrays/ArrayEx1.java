package br.com.senaisp.bauru.richard.arrays;

public class ArrayEx1 {

    public static void main(String args[]) {
        int[] score = new int[9];
        byte[] values = {1,1,1,1,1,1,1,1,1,1};//10 - 1
        long[] primeNum = new long[20];
        int[][] even=new int[5][2];
        even[0][0] = 1;
        even[0][1] = 2;
        even[1][0] = 3;
        //...
        even[4][1] = 10;
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

    }

}
