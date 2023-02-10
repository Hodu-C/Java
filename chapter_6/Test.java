package chapter_6;

public class Test {
    public static void main(String[] args) {
        MyMath t = new MyMath();
        t.add(2, 3);
    }
}

class MyMath {
    int add(int x, int y){ 
        x = subtract(x, y);
        return x + y; }
    int subtract(int x, int y){ return x - y; }
    int multiply(int x, int y){ return x * y; }
    double divide(double x, double y){ return x / y;}


}