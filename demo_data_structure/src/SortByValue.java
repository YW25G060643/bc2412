import java.util.Comparator;

public class SortByValue implements Comparator<Ball> {
  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getValue() > b2.getValue() ? -1 : 1;
  }
}