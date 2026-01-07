package lesson82;

//本の情報を管理するクラス
class BookReview {
    private String title; //本のタイトル
    private String review; // 本のレビュー
    
    public BookReview(String title, String review) {
        this.title = title;
        this.review = review;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getReview() {
        return review;
    }
}
