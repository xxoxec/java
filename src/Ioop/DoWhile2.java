package Ioop;

public class DoWhile2 {

    public static void main(String[] args) {

//        조건에 상관없이 무조건 한번은 코드 실행, 최소 한번은 코드 블럭 실행시 사용
        int i =10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);

    }
}
