package practice.ch06.framework;

// Product 인터페이스를 구현한 클래스는 clone() 메소드를 제공함
public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createCopy() {
    Product p = null;
    try {
        p = (Product)clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
    return p;
}
}
