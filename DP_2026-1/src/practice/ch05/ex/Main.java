package practice.ch05.ex;

public class Main extends Thread {
    public static void main(String[] args) {
     //스레드를 2개 만듬
        Thread a = new Main("Thread-A");
        Thread b = new Main("Thread-B");
        Thread c = new Main("Thread-C");

        a.start(); //t1 스레드 실행
        b.start(); //t2 스레드 실행
        c.start(); //t3 스레드 실행
    }

    @Override
    public void run() {
        Singleton s = Singleton.getInstance();//싱글톤 인스턴스를 얻음
        System.out.println(getName() + ": " + s);//인스턴스의 참조값을 출력 
    } 

    public Main(String name)
    {
        super(name);//Thread 클래스의 생성자에 이름을 전달하여 스레드 이름 설정

    }
}