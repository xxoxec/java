package casting;

public class Casting1 {

    public static void main(String[] args) {
        // 작은 범위 -> 큰 범위 직접 변환 안해도됨, 자동 형변환, 묵시적 형변환
        int intValue = 10;
        long longValue;
        double doubleBValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleBValue = intValue; // int -> double
        System.out.println("doubleBValue = " + doubleBValue);

        doubleBValue = 20000000000L; // long -> double
        System.out.println("doubleBValue2 = " + doubleBValue);
    }
}
