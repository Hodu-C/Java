package chapter_2;

public class VarEx2 {
    public static void main(String[] args) {
        //빈 변수를 이용한 x, y 값 바꾸기 연습
        int x = 3;
        int y = 10;
        int tmp = 0;
        
        System.out.println("x: "+x+" y: "+y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: "+x+" y: "+y);
    }   
}
