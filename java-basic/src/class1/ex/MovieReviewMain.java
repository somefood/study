package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movieReview = new MovieReview("타이타닉", "오우");
        movieReview.printInfo();

        MovieReview movieReview2 = new MovieReview("아바타", "아비터");
        movieReview2.printInfo();
    }
}
