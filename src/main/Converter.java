package main;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double celsius = 0.0;
        DecimalFormat obj = new DecimalFormat("#.######");
        celsius = (fahrenheit - 32) / 1.8;
        System.out.println(obj.format(celsius));
    }
    }

