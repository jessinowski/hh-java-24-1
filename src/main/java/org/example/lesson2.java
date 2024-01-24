package org.example;

public class lesson2 {
    public static void main(String[] args) {

        //Question 1
        System.out.println(add(2, 5));

        //Question 3.1
        int firstNumber = 5;
        int secondNumber = 9;

        if (firstNumber > secondNumber) {
            subtract(firstNumber, secondNumber);
        } else {
            add(firstNumber, secondNumber);
        }

        //Question 2.4
        System.out.println(makePositive(-5.2));
        System.out.println(makePositive(-8));

        //Question 3.2
        System.out.println(checkEven(23));

        //Question 3.3
        System.out.println(isPalindrome("Anna"));
    }

    // Question 1
    public static int add(int a, int b) {
        return a + b;
    }

    // Question 2.2
    public static double add(double a, double b) {
        return a + b;
    }

    // Question 2.3
    public static int subtract(int a, int b) {
        return a - b;
    }

    //Question 2.4
    public static double makePositive(double a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }
    // oder

    public static int makePositive(int a) {
        return a >= 0 ? a : a * -1;
    }

    //Question 3.2
    public static int checkEven(int a) {
        if (a % 2 == 0) {
            return a;
        }
        return a * 2;
    }

    //Question 3.3
    public static boolean isPalindrome(String text) {
        String lowCaseText = text.toLowerCase();
        // erzeuge neues StringBuilder Objekt und übergebe lowCaseText
        StringBuilder newText = new StringBuilder(lowCaseText);
        // mit .reverse() Text umdrehen
        StringBuilder reversedText = newText.reverse();
        // reversedText mit lowCaseText vergleichen
        return (reversedText.toString()).equals(lowCaseText);
    }
}
