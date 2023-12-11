package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.printf("제목: %s , 저자: %s , 페이지 :%d%n", title, author, page);
    }
}
