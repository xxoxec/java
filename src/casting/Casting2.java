package casting;

public class Casting2 {

    public static void main(String[] args) {
        // 큰 범위 -> 작은 범위, 명시적 형변환
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; 컴파일 오류 발생
        intValue = (int) doubleValue;
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue);
        // 형변환 후 자체의 타입이 변경되거나 그 안의 값이 변경 되는 것은 아님, 그대로 유지
        // 자바에서 변수의 값을 변경하는 방법은 = 대입 연산자만 가능, 그 외에는 불가능
    }
}