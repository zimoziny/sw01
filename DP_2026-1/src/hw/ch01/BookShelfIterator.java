package hw.ch01;

import java.util.Iterator; //jdk에서 제공하는 Iterator 인터페이스, 제너릭
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> { //책을 하나씩 꺼내오는.
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf; //자기가 돌아다닐 책꽂이를 저장하는 필드
        this.index = 0;
    }

    @Override //위에서 물려받은 메서드
    public boolean hasNext() { //다음에 꺼낼 책이 있는지 확인하는 메서드
        if (index < bookShelf.getLength()) {
            return true; //꺼낼 책이 있다면 true를 반환한다.
        } else {
            return false;  //꺼낼 책이 없다면 false를 반환한다.
        }
    }

    
    @Override
    public Book next() { //다음 책을 반환하는 메서드
        if (!hasNext()) {
            throw new NoSuchElementException(); //더 이상 꺼낼 책이 없을 때 예외를 던진다.
        }
        Book book = bookShelf.getBookAt(index); //반복자가 책꽂이에 접근
        index++;
        return book;
    }
}
