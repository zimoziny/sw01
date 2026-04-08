package practice.ch05;

public class Singleton {
    //(3) Singleton 객체를 미리 하나 만들어서 STATIC 변수에 저장한다.
    private static Singleton singleton = new Singleton();//클래스 로드 시 실행됨


    //(1) 생성자를 private으로 선언하여 외부에서 인스턴스 생성을 막음
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
    }   

    //(2) Singlrton 객체를 얻어가는 static메소드를 정의한다.
    public static Singleton getInstance() {
        return singleton;
    }



    
}
