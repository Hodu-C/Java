package chapter_2;

public class PrintEx2 {
    public static void main(String[] args) {
        //실수 출력 지시자 연습
        float f1 = .30f; //실수형의 default는 double이므로 f 접미사를 사용하여 float 값인걸 알려줘야함.
        float f2 = 2e1f; //e는 지수를 의미 1e1f = 20.00000
        float f3 = 345.123456789f;
        double d1 = 345.123456789;
        String s = "kordswfa";

        System.out.printf("f1= %f, %e, %g%n", f1,f1,f1); 
        //실수 출력 지시자에는 f,e,g 가 있음. %f를 주로 사용, e는 지수표현, g는 값을 간략하게 표현
        System.out.printf("%010.10f%n", f2); //전체 자리수와 소숫점 자릿수를 설정할 수 있음.
        System.out.printf("f3 = %f%n", f3); //float는 약 7자리까지 정밀도를 가지기에 345.1234까지만 정확함
        System.out.printf("l1 = %f%n", d1); //float는 소수점 아래 6자리까지만 출력하기에 7번째자리에서 반올림됨.
        System.out.printf("%.5s%n", s); //문자열에서 .5라 함은 왼쪽부터 5자리만 출력
        

    }
}
