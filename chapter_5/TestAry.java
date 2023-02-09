package chapter_5;

import java.util.Arrays;

public class TestAry {
    public static void main(String[] args) {
        int count = 0;
        int[] score;
        score = new int[5]; //[0,1,2,3,4] index는 0 ~ [i]-1
        int[] score1 = new int[5]; //배열의 길이는 0 or 양의 정수. 음의 정수 입력 시 NegativeArraySizeException
        int[] score2 = new int[]{50, 60, 70, 80, 90}; //선언, 생성, 초기화
        char[] score3 = {'a','b','c','d','e'};
        System.out.println(score[0]); //int 타입 배열을 생성하면 int의 default(0)으로 초기화

        //배열의 인덱스 범위를 벗어난 값 사용시 ArrayIndexOutOfBoundsException 에러 발생
        for (int i = 0; i< score.length; i++){
            score[i] += i;
            System.out.println(score[i]);
        }
        for (int s : score1) {
            s = 100+3*count;
            System.out.println(s);
            count += 1;
        }
        System.out.println(Arrays.toString(score2));
        System.out.println(Arrays.toString(score3));
        System.out.println(score3);

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[10];
        System.out.println(arr1);
        System.out.println(arr2);
        arr1 = arr2;
        System.out.println(arr1);
        System.out.println(arr2);

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);


    
    }
}
