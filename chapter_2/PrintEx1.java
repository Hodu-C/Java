package chapter_2;

public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';


        int finger = 10;
        long big = 100_000_000_000L; //큰 수는 '_' 를 통해 구분자 사용 가능
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; //처음 숫자0이 들어가면 8진수의 리터럴 값으로 인식
        int hexNum = 0x10; //0x 는 16진수의 리터럴 값으로 인식
        int binNum = 0b10; //0b 는 2진수의 리터럴 값으로 인식

        System.out.printf("b=%d%n", b); //한줄 내려쓰기는 \n으로도 가능하지만 플랫폼마다 다를수 있기에 %n
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, c-0); // int 강제형변환이 오류가 남 왜지??? Character.getNumericValue(), Integer.parseInt(), String.ValueOf(), 0빼기
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#X%n", hex); //#은 접두사 16진수는 0x, 8진수는 0
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

    }
}
