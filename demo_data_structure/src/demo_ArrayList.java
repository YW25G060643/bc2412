import java.util.ArrayList;
import java.util.List;

public class demo_ArrayList {
  public static void main(String[] args) {
      //Many String = String[]

      //Array: fixed length
      String[] ss = new String[3];
      String[] sss = new String[]{"2", "3", "s"};
      //sss is an address of a array, sss[0]

      //ArrayList: variable length
      //underlying data structor -> array
      ArrayList<String> strings = new ArrayList<>();
      strings.add("strings");
      strings.add("chars");
      strings.add("booleans");
      System.out.println(strings.size());
      System.out.println(strings.get(2));
      System.out.println(strings.remove(0));
      System.out.println(strings.size());
      //book()
      ArrayList<Book> books = new ArrayList<>();
      books.add(new Book("aaa"));
      books.add(new Book("bbb"));
      books.remove(0);
      System.out.println(books.size());
      books.add(new Book("nnn"));
      books.remove(new Book("bbb"));//after @Override equals() in book.class
      //arraylist.remove(Object obj) -> book.equals()
      //generics design ensure the type must contains equals()
      System.out.println(books.size());
      //require @Override equals()
      System.out.println(books.contains(new Book("aaa")));
      System.out.println(books.indexOf(new Book("aaa")));
      books.clear();
      System.out.println(books.add(new Book("abcd")));//true
      System.out.println(books.isEmpty());//false

      //search for loop
      //for-each support ArrayList
      boolean found = false;
      String bookName = "";
      for(Book book : books){
        if (book.getName().contains("abcd")) {
            found = true;
            bookName =book.getName();
            break;
        }
      }
        System.out.println(bookName + " is available");
  }

}
