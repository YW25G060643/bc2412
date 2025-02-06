import java.time.LocalDate;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class StockPriceTracker {
  // code here: Design your PQ, so that it always poll the highest price first.
  private final Queue<Double> maxPricePQ = new PriorityQueue<>();

  private final Map<LocalDate, Double> tradeRecords = new HashMap<>();
  private final Deque<LocalDate> tradeDates = new LinkedList<>();

  public void addRecord(LocalDate date, double price) {
    // code here ...
    // 1. Add the trade record to the hashMap
    // 2. Add the price to PQ
    // 3. Add the trade date to Deque
    System.out.println("Recorded: " + date + " -> $" + price);
  }

  public double getLatestPrice() {
    // code here ...
    // Tips: use tradeDates & tradeRecords
    return -1.0;
  }

  public double getHighestPrice() {
    // code here ...
    // Tips: use maxPricePQ
    return -1.0;
  }

  public static void main(String[] args) {
    StockPriceTracker tracker = new StockPriceTracker();
    // Assume we put the records in order of trade date
    tracker.addRecord(LocalDate.of(2024, 1, 1), 100.50);
    tracker.addRecord(LocalDate.of(2024, 1, 2), 200.75);
    tracker.addRecord(LocalDate.of(2024, 1, 3), 150.25);
    tracker.addRecord(LocalDate.of(2024, 1, 4), 199.99);
    System.out.println("Latest price: $" + tracker.getLatestPrice()); // Output: 150.25
    System.out.println("Highest price: $" + tracker.getHighestPrice()); // Output: 200.75
  }

}
