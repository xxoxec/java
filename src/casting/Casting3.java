package casting;

public class Casting3 {

    public static void main(String[] args) {
        // 오버플로우 발생 시 처음 부터 다시 시작, 오버플로우 발생 시 변수의 타입을 변경해서 문제 해결
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L ; // int 최고값 + 1(초과), 오버플로우
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
    }
}
