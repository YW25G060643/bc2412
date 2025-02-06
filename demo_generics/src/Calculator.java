public class Calculator<T> extends Number{//byte short integer long float double
    //if we achieve the same purpose without generics
    //ByteCalculator.class
    //ShortCalculator.class
    //IntegerCalculator.class
    //LongCalculator.class
    //FloatCalculator.class
    //DoubleCalculator.class
    //NumberCalculator.class
    private T x;
    private T y;

    public Calculator(T x, T y){
      this.x = x;
      this.y = y;
    }
    public Number sum(){
        if (this.x instanceof Byte && this.y instanceof Byte) {
            return (byte) this.x + (byte) this.y;//byte + byte -> int -> intenger
        }else if (this.x instanceof Float && this.y instanceof Float) {
          
        }else if (this.x instanceof Short && this.y instanceof Short) {
          
        }else if (this.x instanceof Integer && this.y instanceof Integer) {
          
        }else if (this.x instanceof Long && this.y instanceof Long) {
          
        }else if (this.x instanceof Double && this.y instanceof Double) {
          
        }
    }

    public static void main(String[] args) {
        calculator<Byte> calculator = new calculator<>(Byte.valueOf("10"), Byte.valueOf("20"));
        calculator<Number> calculator2 = new calculator<>(Byte.valueOf("10"), Byte.valueOf("20"));
        //private number x;
        //private number y;
    }
}
