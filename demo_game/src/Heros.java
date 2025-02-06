public class Heros {
    private static final [] ARC_TAB;
    private static final [] WAR_TAB;
    private static final [] MAG_TAB;
    
    static{
        ARC_TAB = new int[]{1,2,3,4,5,6,7,8,9,10};
        WAR_TAB = new int[]{1,2,3,4,5,6,7,8,9,10};
        MAG_TAB = new int[]{1,2,3,4,5,6,7,8,9,10};
    }

    public static int getMaxHp(Role role, int level){
        switch (role) {
          case ARCHER:
            return ARC_TAB[level - 1];
          case WARRIOR:
            return WAR_TAB[level - 1];
          case MAGE:
            return MAG_TAB[level - 1];
          default:
            break;
        }
        return -1;
    }
}
