package chapter_2;

public class StringEx{
    public static void main(String[] args) {
        //문자의 연산
        //연산 순서(왼->오)에 따라 연산 인식
        //연산에서 한 쪽이 문자열이면 다른 한 쪽을 문자열로 변환하여 연산

        String name = "Ja"+"va" ;
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7+ " "); //정수 + 문자열 = "7"
        System.out.println(" " + 7); //문자열 + 정수 = " 7"
        System.out.println(7 + ""); //정수 + 문자열 = "7"
        System.out.println("" + 7); //문자열 + 정수 = "7"
        System.out.println(7+7+""); //(정수+정수)+문자열 = "14"
        System.out.println(""+7+7); //(문자열+정수)+정수 = "77"

    }
}