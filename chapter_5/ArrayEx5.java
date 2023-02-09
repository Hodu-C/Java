package chapter_5;

public class ArrayEx5 {
    public static void main(String[] args) {
        //배열의 총합과 평균
        int[] score = new int[] {100, 75, 40, 60, 88};
        int sum = 0;
        float avg = 0f;

        for (int i : score) {
            sum += i;
        }
        avg = sum / (float)score.length;

        System.out.println(sum);
        System.out.println(avg);


    }
}
