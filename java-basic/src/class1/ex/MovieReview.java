package class1.ex;

public class MovieReview {
    private String title;
    private String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public void printInfo() {
        System.out.println("타이틀: " + title + " 리뷰 내용: " + review);
    }
}
