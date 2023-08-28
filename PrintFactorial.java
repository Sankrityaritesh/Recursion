package com.ritesh;

public class PrintFactorial {
    public static int calfactoriaL(int n) {
        if (n == 1 || n==0) {
            return 1;
        }
        int factnum1 = calfactoriaL(n - 1);
        int factn = n * factnum1;
        return factn;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calfactoriaL(n);
        System.out.println(ans);
    }
}
