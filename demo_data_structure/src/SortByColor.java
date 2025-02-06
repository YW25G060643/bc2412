import java.util.Comparator;

// Sort: RED -> BLUE -> YELLOW
public class SortByColor implements Comparator<Ball> {
  @Override
  public int compare(Ball b1, Ball b2) {
    // b1 (-1), b2 (1)
    if (b1.getColor() == Ball.Color.RED)
      return -1;
    if (b2.getColor() == Ball.Color.RED)
      return 1;
    if (b1.getColor() == Ball.Color.BLUE)
      return -1;
    return 1;
  }
}