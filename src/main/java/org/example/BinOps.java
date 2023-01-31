package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int out = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(out);
    }

    public String mult(String a, String b) {
        int out = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(out);
    }
}
