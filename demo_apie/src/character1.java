public class character1 extends level{
  //hp(health) & mp(magic)
  //level -> increase max hp & mp
  //method:
  //presentation: isAlive
  //action: levelUp
  private int hp;
  private int mp;
  public character1(int level, int hp, int mp){
      super(level);
      this.hp = hp;
      this.mp = mp;
  }
  public String isAlive(){
      if (hp > 0) {
        return "isAlive";
      }else{
        return "isDead";
      }
  }
}