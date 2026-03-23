package practice.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String genre;   // 필터링할 장르
    private int index;

    public GenreFilterIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        // 장르가 일치하는 책을 찾을 때까지 index를 전진
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre() != null && book.getGenre().equals(genre)) {
                return true;  // 찾으면 index를 그 위치에 멈추고 true
            }
            index++;  // 장르 불일치 → 건너뛰기
        }
        return false;  // 끝까지 못 찾으면 false
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;  // 다음 호출을 위해 한 칸 전진
        return book;
    }
}