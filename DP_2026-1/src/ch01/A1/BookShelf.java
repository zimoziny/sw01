package ch01.A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> { //아이터레이터 명세서 가져오기
    private List<Book> books; //책을 담는 리스트 선언 (외부 접근 불가능)

    public BookShelf(int initialsize) { //생성자, 책꽂이의 초기 크기를 받아서 책 리스트 생성
        this.books = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) { //책 리스트에서 index 위치의 책을 반환하는 메소드
        return books.get(index);
    }

    public void appendBook(Book book) { //책 리스트 맨끝에 책을 추가하는 메소드
        books.add(book);
    }

    public int getLength() { //책 리스트의 크기를 반환하는 메소드
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
