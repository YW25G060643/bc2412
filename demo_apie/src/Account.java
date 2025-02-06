public abstract class Account {
    private currency currency;
    private double balance;//1000 -> 1,000

    public Account(currency currency, double balance){
        this.currency = currency;
        this.balance = balance;
    }

    public currency getCurrency(){
        return this.currency;
    }
    public double getBalance(){
        return this.balance;
    }

    public String getBalanceDesc(){
        return this.currency.name() + this.balance;// HKD1,000
    }
}
