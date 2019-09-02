package main;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / (i);
        }




    }
}

}
