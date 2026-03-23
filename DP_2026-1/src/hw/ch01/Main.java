package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20231114 이름: 이다은 \n");
        
        BookShelf bookShelf = new BookShelf(15);

        // 책을 책꽂이에 추가한다
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Python Programming"));
        bookShelf.appendBook(new Book("C++ Programming"));
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        //방법 1: 책꽂이에 클라이언트가 직접 접근해서 책을 꺼내오는 방법
        System.out.println("Book in the bookshelf:");
        for (int i = 0; i < bookShelf.getLength(); i++) {
            System.out.println ("- "+bookShelf.getBookAt(i).getName());
        }

        //방법 2: Iterator를 사용하는 방법
        System.out.println("\nBooks in the bookshelf (using Iterator):");
        Iterator<Book> it = bookShelf.iterator();
            while (it.hasNext()) {
                   System.out.println("- " + it.next().getName());
            }

        System.out.println("\n");
        //방법 3:책꽂이에 반복자를 만들어서 책을 꺼내오는 방법 (for-each문)
        //형식: for (타입 변수명 : 컬렉션) { ... }
        for (Book b: bookShelf) { //bookShelf는 Iterable 인터페이스를 구현했기 때문에 for-each문에서 사용할 수 있다.
            System.out.println(b.getName());
        }
        System.out.println(); 

        System.out.println("\n장르 필터 Iterator를 적절히 구현해서 ‘소설’ 장르에 해당하는 책의 정보만 출력:");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-20s %-6s %-8s %s%n", "제목", "장르", "출판년도", "가격");
        System.out.println("----------------------------------------------------");
        Iterator<Book> genreIt = bookShelf.iteratorByGenre("소설");
        while (genreIt.hasNext()) {
            Book b = genreIt.next();
            System.out.printf("%-20s %-6s %-8d %.0f원%n",
                    b.getName(), b.getGenre(), b.getYear(), b.getPrice());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("\n출판연도 역순 Iterator 를 적절히 구현해서 ‘소설’ 장르에 해당하는 책의 정보만 출력 : ");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-20s %-6s %-8s %s%n", "제목", "장르", "출판연도", "가격");
        System.out.println("----------------------------------------------------");
        Iterator<Book> yearGenreIt = bookShelf.iteratorByYear();
        while (yearGenreIt.hasNext()) {
            Book b = yearGenreIt.next();
            if ("소설".equals(b.getGenre())) {
                System.out.printf("%-20s %-6s %-8d %.0f원%n",
                        b.getName(), b.getGenre(), b.getYear(), b.getPrice());
            }
        }
        System.out.println("----------------------------------------------------");
    }
}
