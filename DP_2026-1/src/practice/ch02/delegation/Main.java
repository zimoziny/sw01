package practice.ch02.delegation;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBannerAdapter02("Hello World");
        p.printWeak();
        p.printStrong();
        ((PrintBannerAdapter02)p).getYourName(); //형변환, 타입캐스팅
    }
    
}
