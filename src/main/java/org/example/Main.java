package org.example;

public class Main {
    public static void main(String[] args) {
        String a1 = "1010"; //10
        String a2 = "0010"; //2
        BinOps bin = new BinOps();
        System.out.println(bin.mult(a1,a2)); //20
        System.out.println(bin.sum(a1,a2));  //12

    }
}