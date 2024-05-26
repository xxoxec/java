package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열
        int[][] arr = new int[][]{ // 이부분 생략가능, 1차원과 동일
                {1,2,3}, // 헹
                {4,5,6}, // 열
                {7,8,9}
        }; // 행2, 열3

        // 중첩for문, 첫번째 for문은 행, 두번째 for문은 열
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경
        }
    }
}
