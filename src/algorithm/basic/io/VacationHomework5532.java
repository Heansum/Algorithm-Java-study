package algorithm.basic.io;

import java.util.Scanner;

public class VacationHomework5532 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dayLength = scan.nextInt();
        int koreanHomeworkPage = scan.nextInt();
        int mathHomeworkPage = scan.nextInt();
        int canKoreanDo = scan.nextInt();
        int canMathDo = scan.nextInt();

        int a = 1;
        int b = 1;
        while(koreanHomeworkPage > canKoreanDo * a)
            a++;
        while(mathHomeworkPage > canMathDo * b)
            b++;

        if (a > b)
            dayLength = dayLength - a;
        else if (a < b)
            dayLength = dayLength - b;
        else
            dayLength = dayLength - a;

        System.out.print(dayLength);
    }
}
