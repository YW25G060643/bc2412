public enum currency {
    //scenario for enum
    //values finite
    //not likely to have a new value
    HKD("HK Dollar", 1), CNY("Renminbi", 2), USD("US Dollar", 3), ;

    //private
    private final String DESC;
    private final int VALUE;
    //carry more than one attribute
    private currency(String DESC, int VALUE){
        this.DESC = DESC;
        this.VALUE = VALUE;
    }
    public String getDESC(){
        return this.DESC;
    }
    public int getVALUE(){
        return this.VALUE;
    }



    public static String getDESCription(currency currency){
        // switch (currency) {
        //     case HKD:
        //         return "HK Dollar";
        //     case CNY:
        //         return "Renminbi";
        //     case USD:
        //         return "US Dollar";
        //     default:
        //         return null;
        // }
        if (currency == currency.HKD) {
            return "HK Dollar";
        }
        else if (currency == currency.CNY) {
            return "Renminbi";
        }
        else if (currency == currency.USD) {
            return "US Dollar";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(currency.getDESCription(currency.USD));
        System.out.println(currency.CNY.getDESC());
        System.out.println(currency.CNY.getVALUE());
        currency hkd = currency.HKD;
        System.out.println(hkd.getDESC());
    }//cannot create enum by yourself
}
