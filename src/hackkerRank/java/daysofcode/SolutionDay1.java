package hackkerRank.java.daysofcode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDay1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int inputI;
        double inputD;
        String inputS;

        inputI = scan.nextInt();
        inputD = scan.nextDouble();
        scan.nextLine();
        inputS = scan.nextLine();

        int outputInt;
        double outputDouble;
        String outputString;

        outputInt = i + inputI;
        outputDouble = d + inputD;
        outputString = s + inputS;

        System.out.println(outputInt);
        System.out.println(outputDouble);
        System.out.println(outputString);

        scan.close();
    }
}
