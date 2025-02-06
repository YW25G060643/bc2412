public class savingAccount extends Account{
    //
    public savingAccount(currency currency){
        super(currency, 0.0d);
    }

    public static void main(String[] args) {
        Account savingAccount = new savingAccount(currency.HKD);
    }
}
