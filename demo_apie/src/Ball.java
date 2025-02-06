public class Ball {
    private Color color;
    public int number;
  
    public Ball(Color color) {
      this.color = color;
    }
  
    public int getNumber() {
      return this.number;
    }
  
    public Color getColor() {
      return this.color;
    }
  
    public static void main(String[] args) {
      Ball b1 = new Ball(Color.RED);
      Ball b2 = new Ball(Color.RED);
      System.out.println(b1.getColor() == Color.RED); // true
    }
  }