import java.math.BigDecimal;

public class square2 implements shape2 {
    private double length;

    public square2(double length){
        this.length = length;
    }

    @Override
    public double area(){
        return BigDecimal.valueOf(this.length)
    }
}
