package chapter_5;

public class ArrayEx6 {
    //최댓값과 최솟값
    public static void main(String[] args) {
        int[] num = new int[] {42, 50, 33, 2, 52};
        int maxNum = num[0];
        int minNum = num[0];

        for (int i = 1; i<num.length; i++){
             if(maxNum < num[i]) maxNum = num[i];
             else if(minNum > num[i]) minNum = num[i];
       }
       System.out.println(maxNum +", "+ minNum);
       System.out.println((int)(Math.random()*10));
       int[] fff = new int[10];
       System.out.println(fff.length);
       for (int i = 0; i < fff.length; i++) {
        System.out.println(i);
       }
    }
}
