//generic design -> reduce number of class
public class GeneralPrinter<T> {//<T> presents 
    private T value;

    public GeneralPrinter(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public String print() {
        return ("String") + this.value.toString();
    }

    public static void main(String[] args) {
        GeneralPrinter<Integer>printer = new GeneralPrinter<>(Integer.valueOf(3));
        GeneralPrinter<Integer>printer2 = new GeneralPrinter<>(Integer.valueOf(3));
        Object obj = new Book("abc");
        if (obj instanceof Integer) {
            Integer integer = (Integer) obj;

        }
    }
}
