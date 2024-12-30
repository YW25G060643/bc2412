public class Library {
    /*a library has many books
    a book has attributes, title & authors
    the library has functions:
      1)add a book, return void
      2)removeByTitle, return Book
      3)searchByTitle, return Book[]
    librarian(add/remove), library(search), book
    */
    private String title;
    private String author;

    public Library( String title, String author){
        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }
    
    public static int[] libraries = new int[101];
    public static final String[] TITLE = new String[101];
    public static final String[] AUTHOR = new String[101];

    public void addABook(){
        for(int i = 0; i < libraries.length; i++){
            if (libraries[i] != 1) {
                libraries[i] = 1;
                TITLE[i] = title;
                AUTHOR[i] = author;
            }
        }
    } 

    public String removeByTitle(){
        for(int i = 0; i < libraries.length; i++){
            
        }
      return null;
    }

    public String searchByTitle(){

      return null;
    }
}
