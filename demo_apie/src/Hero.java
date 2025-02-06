public abstract class Hero {
    /*HP & MP
    LEVEL
    attackPower
    */
    /*method:
     * presentation: isAlive
     * Action: levelUp: + maxHP, + maxMP, + Attackpower
     */
    /*hero is parent class
     * child class: archer, mage, warrior
     */
    /*attackPower
     * weapon
     */
    private int level;
    private int hp;
    private int mp;
    private int attackPower;

    public Hero(int level, int hp, int mp, int attackPower){
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.attackPower = attackPower;
    }
    public int getLevel(){
        return this.level;
    }
    public int getHp(){
        return this.hp;
    }
    public int getMp(){
        return this.mp;
    }
    public int getAttackPower(){
        return this.attackPower;
    }
}
