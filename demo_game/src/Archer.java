import java.util.ArrayList;

public class Archer extends Hero{
    //
    public Archer(int id, Role role, int level){
        super(level, role, level);
    }
    public static void Born(){
        ArrayList<Hero> archers = new ArrayList<>();
        archers.add( new Archer(archers.indexOf(), Role.ARCHER, 1));
        ;
    }
}
