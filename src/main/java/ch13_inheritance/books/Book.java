package ch13_inheritance.books;
/*
    1. private title / author (자료형 명시 안했음)
    2. 생성자는 AllArgsConstructor
    3. Setter / Getter
    4. shoInfo() 메서드를 call1() 타입으로 정의해야 한다.

    예시

    제목 : 어쩌고
    저자 : 저쩌고

    EBook 클래스에서
    EBook 클래스는 Book을 상속받도록 처리
    자식 고유의 필드로 private double fileSize / String format

    예시

    제목 : 어쩌고
    저자 : 저쩌고
    파일 크기 : 어쩌고저쩌고 MB
    파일 형식 : PDF / EPUB ...

    BookMain에서
    Book 클래스의 인스턴스 생성
    Getter를 활용해
    이 책의 제목은 자바의 정석입니다.
    이 책의 저자는 남궁성 입니다.
    book.showInfo()를 호출해
    제목 : 자바의 정석
    저자 : 남궁성

    EBook 클래스의 인스턴스 생성
    스프링 입문 / 이강준 / 5.2 / EPUB 으로 생성하고
    그 다음 setter 활용해 파일 형식을 PDF로 변환
    getter를 활용해
    이 전자책의 포맷은 PDF입니다. 를 출력

    eBook1.shoInfo(); 를 실행ㄹ해
    제목 : 스프링 입문
    저자 : 이강준
    파일 크기 : 5.2MB
    파일 형식 : PDF 를 출력
 */
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void showInfo() {
        System.out.println("이 책의 이름은: " + title);
        System.out.println("저자: " + getAuthor() + " 입니다. ");
    }
}
