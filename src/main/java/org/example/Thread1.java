package org.example;

public class Multithreading implements Runnable {

    private final double[][] c;
    private double[][] a;
    private double[][] b;
    private final int row;

    public Multithreading(double[][] c, double[][] a, double[][] b, int row) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.row = row;
    }

    @Override
    public void run() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] += a[i][j] * b[i][j];
            }
        }
    }
}