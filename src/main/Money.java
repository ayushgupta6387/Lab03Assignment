package main;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        String convert = Double.toString(money);
        int index = convert.indexOf('.');
        String m = convert.substring(0, index);
        String n = convert.substring(index + 1, convert.length());
        System.out.println(m + "Rupees and " + n + "Paise");
    }

    }

