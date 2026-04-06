package practice.ch04;
import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;
import practice.ch04.framework.Product;




public class Main {
    public static void main(String[] args) {
        //(1)idcard팩토리를 만들어서 id카드를 만든다.
        //IDCard c = new IDCard("이다은");
        //c.use();

        //(2)공장을 통해서  IDCard를 만들어보자
        IDCardFactory f = new IDCardFactory();
        
        // 여러 개의 카드 생성
        Product c1 = f.create("이다은");
        c1.use();
        
        Product c2 = f.create("김철수");
        c2.use();
        
        Product c3 = f.create("박영희");
        c3.use();
        
        // 해시맵 대응표 출력
        f.printDatabase();
        
        // 특정 시리얼 번호로 오너 조회 테스트
        System.out.println("시리얼 번호 100의 오너: " + f.getOwner(100));
        System.out.println("시리얼 번호 101의 오너: " + f.getOwner(101));
        System.out.println("시리얼 번호 102의 오너: " + f.getOwner(102));
    }
}
