package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] movieReviews = {
                new MovieReview("타이타닉", "오우"),
                new MovieReview("아바타", "아비터")
        };

        for (MovieReview movieReview : movieReviews) {
            movieReview.printInfo();
        }
    }
}
