public record Book(String name, double price) {
  //private String author
  public static final double PI = 3.14;

  public void print(){
      System.out.println(name + price);
  }
    public static void main(String[] args) {
        Book b1 = new Book("ABC", 10.5);
        System.out.println(b1.name);
        System.out.println(b1.price());
        System.out.println(new Book("ABC", 10.5).equals(b1));
        System.out.println(new Book("ABC", 10.5).hashCode());
        System.out.println(b1);
        b1.print();

        //All-arg constructor ONLY
        //renamed getter
        //no setter
        //support equals() and hashCode()
        //support toString()
        //support static variable/method
        //support custom method
        //do not support custom attritube
        //do not support custom contructor
    }
}
