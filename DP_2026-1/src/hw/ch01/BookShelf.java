package practice.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
//public class BookShelf {
    private Book[] books;//여러권 -> 배열
    private int last = 0;

    public BookShelf(int maxsize) { //책꽂이의 최대 크기 설정
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) { //INDEX를 사용하여 책을 꺼내온다
        return books[index];
    }

    public void appendBook(Book book) { //책을 책꽂이에 추가한다
        this.books[last] = book;
        last++;
    }

    public int getLength() { //책꽂이에 꽂혀있는 책의 수를 반환한다
        return last;
    }

   
    @Override
    public Iterator<Book> iterator() {
         return new BookShelfIterator(this); //인자를 현재 책꽂이 자신으로 넘겨준다
    }

    public Iterator<Book> iteratorByGenre(String genre) {
        return new GenreFilterIterator(this, genre);
    }

    public Iterator<Book> iteratorByYear() {
        return new YearDescendingIterator(this);
    }
}
