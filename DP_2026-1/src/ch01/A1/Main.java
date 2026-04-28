package ch01.A1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4); //BookShelf 라는 책꽂이 객체 생성
        bookShelf.appendBook(new Book("Around the World in 80 Days")); //책을 집어넣기
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator(); //타입이 Iterator인 it 이름을 가진 객체 생성
        while (it.hasNext()) { 
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
