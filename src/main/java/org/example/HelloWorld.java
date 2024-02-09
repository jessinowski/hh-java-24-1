package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java is cool!");

        int a = 6;
        int b = 2;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);

        double c = 8.23;
        double d = 6.54569;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c > d);
        System.out.println(c < d);
        System.out.println(c == d);

        float e = 5.68455F;
        float f = 9.5646F;
        System.out.println(e + f);
        System.out.println(e - f);
        System.out.println(e * f);
        System.out.println(e / f);
        System.out.println(e > f);
        System.out.println(e < f);
        System.out.println(e == f);

    }

    @Override
    public String toString() {
        return "super.toString()";
    }
}
