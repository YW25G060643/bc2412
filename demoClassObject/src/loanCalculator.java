import java.math.BigDecimal;

public class loanCalculator {
    private double principle;//本金
    private double annulInterestRate;//年利率
    private int numOfYears;

    //constructor
    //totalInterestAfterYears()

    public loanCalculator(double principle, double annulInterestRate, int numOfYears){
        this.principle = principle;
        this.annulInterestRate = annulInterestRate;
        this.numOfYears = numOfYears;
    }

    public double totalInterestAfterYears(){
      //principle * ((1 + annulInterestRate / 100) ^ numOfYears) - principle
      return BigDecimal.valueOf(this.principle)
      .multiply(BigDecimal.valueOf(
        Math.pow(1 + this.annulInterestRate / 100.0 , this.numOfYears)))
        .subtract(BigDecimal.valueOf(principle))
      .doubleValue();
    }
    
    public static double totalInterestAfterYears(double principle,
        double annualInterestRate, int numOfYears) {
      return BigDecimal.valueOf(principle) //
          .multiply(BigDecimal
              .valueOf(Math.pow(1 + annualInterestRate / 100.0, numOfYears)))
          .subtract(BigDecimal.valueOf(principle)) //
          .doubleValue();
    }

    public static void main(String[] args) {
      loanCalculator lc = new loanCalculator(10000, 2.0, 2);
      System.out.println(lc.totalInterestAfterYears());//404.0
    }

}
