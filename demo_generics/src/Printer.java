public class Printer {
    private int x;

    public Printer(Integer x){
        this.x = x;
    }
    public String print(){
        return " this is " + this.x;
    }

    public static <T extends Shape> double totalArea2(T[] shapes){
        
    }
    public static void main(String[] args) {
        Printer p1 = new Printer(10);
        System.out.println(p1.print());
        //what if double? long? BigDecimal?
        //another solution: Generics
        GeneralPrinter<Long>LongPrinter = new GeneralPrinter<>(10L);
        GeneralPrinter<Book>BookPrinter = new GeneralPrinter<>(new Book("ABC"));
        System.out.println(BookPrinter.print());
    }
}
