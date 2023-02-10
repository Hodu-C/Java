package chapter_6;

class Tv {
    //멤버 변수
    String color;
    boolean power;
    int channel;
    
    //기능(메서드)
    void power() { power = !power; }
    void channelUp() { 
        channel++;
        System.out.println("채널이 증가합니다. "+ channel);
    }
    void channelDown() { 
        channel--; 
        System.out.println("채널이 감소합니다. "+channel);
    }
}

public class TvTest {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = 1;
            System.out.println("tvArr["+i+"] = "+tvArr[i].channel);
        }
        
    }
}

