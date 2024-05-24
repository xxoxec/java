package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hello\n"); //print("\n) == println()
        System.out.print("java\n");

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 입력한 String 가져옴
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt(); // 입력한 int 가져옴
        System.out.println("입력한 정수:" + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble(); // 입력한 double 가져옴
        System.out.println("입력한 실수: " + doubleValue);
    }
}
