package practice.ch02.delegation;


    //어댑터
    //자바에서는 다중상속이 불가능함(부모가 둘 이상은 허용이 안됨)
public class PrintBannerAdapter02 extends Print  {
    private Banner banner; //위임하는 객체

    public PrintBannerAdapter02(String text) {
        this.banner = new Banner(text); //위임하는 객체 생성
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); //위임하는 객체의 메소드 호출
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); //위임하는 객체의 메소드 호출
    }

    public String getYourName(){
        return "홍길동";
    }
    
}
