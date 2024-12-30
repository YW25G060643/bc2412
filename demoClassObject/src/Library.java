public class Library {
    /*a library has many books
    a book has attributes, title & authors
    the library has functions:
      1)add a book, return void
      2)removeByTitle, return Book
      3)searchByTitle, return Book[]
    */
    private String attributes;
    private String title;
    private String author;

    public Library(String attributes,  String title, String author){
        this.attributes = attributes;
        this.author = author;
        this.title = title;
    }
    
    private static Library[] libraries = new Library[101];

    public static addABook(){

    } 

    public static void main(String[] args) {
        System.out.println(libraries);
    }
}
