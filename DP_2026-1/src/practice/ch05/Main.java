package practice.ch05;

public class Main {
    public static void main(String[] args) {
        //Singleton s1 = new Singleton(); // 컴파일 에러: 생성자가 private이므로 외부에서 인스턴스 생성 불가
        Singleton s2 = Singleton.getInstance(); // getInstance() 메소드를 통해 Singleton 객체를 얻어옴
        Singleton s3 = Singleton.getInstance(); // getInstance() 메소드를 통해 또 다른 Singleton 객체를 얻어옴
        

        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);    

        if(s2 == s3) { //s2와 s3가 같은 객체를 참조하는지 비교
            System.out.println("s2와 s3는 같은 Singleton 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 객체입니다.");
        }

        Singleton2 s4 = Singleton2.INSTANCE; // enum의 상수 INSTANCE를 통해 Singleton2 객체를 얻어옴
        s4.hello();
        
    }

}   