public class DemoSwitchExpression {
    public static void main(String[] args) {
        //switch + Lambda
    }

    public static char getColorValue(Color color){
        return switch (color){
            case RED -> 'r';
            case YELLOW -> 'y';
            case BLUE -> 'b';
        };
    }
    
    public static String getColorValue2(Color color){
      return switch (color){
          case RED -> {
            yield "Red";
          }
          case YELLOW -> {
            yield "Yellow";
          }
          case BLUE -> {
            yield "Blue";
          }
       };
    }

    public static enum Color{
        RED, YELLOW, BLUE, ;
    }
}
