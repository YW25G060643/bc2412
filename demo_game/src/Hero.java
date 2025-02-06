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
    private int id;
    private int level;
    private int hp;
    private int maxHp;
    private int mp;
    private int maxMp;
    private int pa;//Physical Attack
    private int pd;//Physical Defense
    private int ma;//Magical Attack
    private int md;//Magical Defense
    private int ag;//Agility
    private int cc;//Critical Damage Chance
    private int cd;//Critical Damage
    private Role role;

    public Hero(int id, Role role, int level){
        this.id = id;
        this.role = role;
        this.level = level;
    }

    public void setLevel(){
        this.level = 1;
    }
    public int getLevel(){
        return this.level;
    }
    
    public void setHp(){
        this.hp = hp;
    }
    public int getHp(){
        return this.hp;
    }
    
    public void setMp(){
        this.mp = mp;
    }
    public int getMp(){
        return this.mp;
    }
    
    public void setPa(){
        this.pa = pa;
    }
    public int getPa(){
        return this.pa;
    }
    
    public void setPd(){
        this.pd = pd;
    }
    public int getPd(){
        return this.pd;
    }
    
    public void setMa(){
        this.ma = ma;
    }
    public int getMa(){
        return this.ma;
    }
    
    public void setMd(){
        this.md = md;
    }
    public int getMd(){
        return this.md;
    }
    
    public void setAg(){
        this.ag = ag;
    }
    public int getAg(){
        return this.ag;
    }
    
    public void setCc(){
        this.cc = cc;
    }
    public int getCc(){
        return this.cc;
    }
    
    public void setCd(){
        this.cd = cd;
    }
    public int getCd(){
        return this.cd;
    }
    
    public void setid(){
        this.id = id;
    }
    public int getid(){
        return this.id;
    }
    
    public void setRole(){
        this.role = role;
    }
    public Role getRole(){
        return this.role;
    }
    
}
