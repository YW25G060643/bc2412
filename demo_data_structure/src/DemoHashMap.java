import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMap {

  public static class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (!(obj instanceof Book))
        return false;
      Book book = (Book) obj;
      return Objects.equals(this.id, book.getId())
          && Objects.equals(this.name, book.getName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
      return "Book[" //
          + "id=" + this.id //
          + ",name=" + this.name //
          + "]";
    }
  }

  public static void main(String[] args) {
    // key and value
    HashMap<String, Integer> fruitMap = new HashMap<>();
    // Put an entry to Map
    // Key -> Apple
    fruitMap.put("Apple", 1);
    fruitMap.put("Apple", 3);
    // If the key is same, the entry will be replaced.
    System.out.println(fruitMap); // {Apple=3}
    System.out.println(fruitMap.size()); // 1, entry count
    fruitMap.put("APPLE", 3);
    System.out.println(fruitMap); // {Apple=3, APPLE=3}
    System.out.println(fruitMap.size()); // 2, entry count

    // According to String.class equals(), "Apple" and "APPLE" are not equals

    for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    for (String key : fruitMap.keySet()) {
      System.out.println(key);
    }

    for (Integer value : fruitMap.values()) {
      System.out.println(value);
    }

    // get value by key
    System.out.println(fruitMap.get("APPLE")); // 3
    System.out.println(fruitMap.get("Apple")); // 3

    // contains()
    System.out.println(fruitMap.containsKey("APPLE")); // true

    // Find the entry of "Apple", and then + 1 to the integer.
    if (fruitMap.containsKey("Apple")) {
      fruitMap.put("Apple", fruitMap.get("Apple") + 1);
    }

    Integer value = fruitMap.get("Apple");
    if (value != null) {
      fruitMap.put("Apple", value + 1);
    }
    System.out.println(fruitMap.get("Apple")); // 5

    // Can we put null value to the entry?
    fruitMap.put("ABC", null);
    System.out.println(fruitMap.size()); // 3

    // Can we put null key to the entry?
    fruitMap.put(null, 999);
    fruitMap.put(null, 1000);
    System.out.println(fruitMap); // {null=1000, Apple=5, ABC=null, APPLE=3}
    System.out.println(fruitMap.size()); // 4

    System.out.println(fruitMap.containsValue(1000)); // true

    System.out.println(fruitMap.isEmpty()); // false
    System.out.println(fruitMap.getOrDefault("Orange", 0)); // 0
    System.out.println(fruitMap.getOrDefault("Apple", 0)); // 5

    Integer removedEntryValue = fruitMap.remove("APPLE");
    System.out.println(removedEntryValue); // 3

    fruitMap.put("Cherry", fruitMap.getOrDefault("Cherry", 0) + 1);

    fruitMap.clear();
    System.out.println(fruitMap.size()); // 0, entry count
    System.out.println(fruitMap.isEmpty()); // true

    //
    HashMap<Integer, Book> bookMap = new HashMap<>();
    // create books and put books into map.
    // 1 ABC
    // 2 IJK
    // 3 DEF
    Book b1 = new Book(1, "ABC");
    Book b2 = new Book(2, "IJK");
    Book b3 = new Book(3, "DEF");
    // print Map size
    bookMap.put(b1.getId(), b1);
    bookMap.put(b2.getId(), b2);
    bookMap.put(b3.getId(), b3);
    System.out.println(bookMap.size());

    // Store the book count
    HashMap<Book, Integer> bookMap2 = new HashMap<>();
    // 1 ABC
    // 2 IJK
    // 3 DEF
    // 3 DEF
    Book b4 = new Book(1, "ABC");
    Book b5 = new Book(2, "IJK");
    Book b6 = new Book(3, "DEF");
    Book b7 = new Book(3, "DEF");
    bookMap2.put(b4, bookMap2.getOrDefault(b4, 0) + 1);
    bookMap2.put(b5, bookMap2.getOrDefault(b5, 0) + 1);
    bookMap2.put(b6, bookMap2.getOrDefault(b6, 0) + 1);
    bookMap2.put(b7, bookMap2.getOrDefault(b7, 0) + 1);
    System.out.println(bookMap2.size()); // 3
    System.out.println(bookMap2); // 3

    System.out.println(bookMap2.get(new Book(3, "DEF"))); // 2

  }
}