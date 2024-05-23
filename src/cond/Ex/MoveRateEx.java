package cond.Ex;

public class MoveRateEx {

    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'인셉션'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'해리포터'를 추천합니다.");
        }
    }
}
