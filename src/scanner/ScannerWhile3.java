package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요 (0 입력시 종료) : ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            sum += number; // sum = sum + number
        }
        System.out.println("입력한 모든 정수의 합은 : " + sum);
    }
}
