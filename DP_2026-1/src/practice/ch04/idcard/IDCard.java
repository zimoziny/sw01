package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.toString() + "을 사용합니다.");
    }

    @Override
    //이 객체의 문자열이 필요할 때 자동으로 호출되는 메소드
    //object클래스의 toString()메소드를 오버라이드한 것
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
