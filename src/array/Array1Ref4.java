package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90,  80, 70, 60, 50}; // 한줄로 축약가능
        /* 두줄로 나누눈 건 불가능
        int[] students;
        students = {90,  80, 70, 60, 50};
         */


        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}