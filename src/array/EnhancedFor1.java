package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int numbar = numbers[i];
            System.out.println(numbar);
        }

        // 향상된 for문, for-each문, iter단축키
        // :의 오른쪽 numbers와 같이 탐색할 배열
        // :의 왼쪽 number와 같이 반복할 떄 마다 찾은 값을 저장 할 변수 선언
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요시
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }
    }
}