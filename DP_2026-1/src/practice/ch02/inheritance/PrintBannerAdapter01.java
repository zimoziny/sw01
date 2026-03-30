package practice.ch02.inheritance;


//어댑터 클래스. Banner의 기능을 Print 인터페이스로 변환한다.
public class PrintBannerAdapter01 extends Banner implements Print {
    // (1) 인자가 없는 생성자는 자동으로 만들어짐
    // (2) 생성자는 상속되지 않는다.
  
    public PrintBannerAdapter01(String text) {
        super(text); //부모 생성자
    } //생성자

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }   
}
