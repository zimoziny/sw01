package practice.ch02.delegation;

//클라이언트가 원하는 인터페이스. target interface <=추상클래스
public interface Print {
    public abstract void printWeak();
    public abstract void printStrong();
}
