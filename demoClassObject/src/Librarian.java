public class Librarian {
    private String name;
    private Library library;

    //librarian -> library
    //library -> librarian
    public Librarian(Library library){
        this.library = library;
    }
    //add
    //removeByItem
    public void add(book book){
        book[] books = new book[this.library.size() + 1];
        for(int i = 0; i < this.library.size(); i++){
            
        }
    }
}
