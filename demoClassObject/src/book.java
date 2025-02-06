public class book {
    private String bookTitle;
    private String bookAuthor;
    public book(String bookTitle, String bookAuthor){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }
    public String getBookAuthor(){
        return this.bookAuthor;
    }
}
