package MovieReview;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview rvw1 = new MovieReview();
        rvw1.title = "인셉션";
        rvw1.review = "재밌네";

        MovieReview rvw2 = new MovieReview();
        rvw2.review = "안봄";
        rvw2.title = "덩케르크";

        MovieReview[] rvwArr = new MovieReview[] {rvw1, rvw2};

        for (MovieReview s : rvwArr) {
            System.out.printf("영화 제목 : %s, 영화 후기 : %s\n", s.title, s.review);
        }

    }
}
