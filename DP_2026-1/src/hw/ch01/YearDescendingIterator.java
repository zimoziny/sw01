package hw.ch01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearDescendingIterator implements Iterator<Book> {
    private Book[] sorted; // 연도 내림차순으로 정렬된 배열
    private int index;

    public YearDescendingIterator(BookShelf bookShelf) {
        // 책꽂이의 책들을 새 배열로 복사
        int length = bookShelf.getLength();
        this.sorted = new Book[length];
        for (int i = 0; i < length; i++) {
            sorted[i] = bookShelf.getBookAt(i);
        }
        // year 기준 내림차순 정렬 (큰 값이 앞으로)
        Arrays.sort(sorted, (a, b) -> b.getYear() - a.getYear());
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sorted.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sorted[index++];
    }
}