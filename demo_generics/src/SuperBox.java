public class SuperBox <T extends Animal, U extends Hero, V extends Weapon>{
    //without generics
    //
    private T Animal;
    private U Hero;
    private V Weapon;

    public void SetAnimal(T Animal){
        this.Animal = Animal;
    }
    
    public void SetHero(U Hero){
      this.Hero = Hero;
    }
    
    public void SetWeapon(V Weapon){
      this.Weapon = Weapon;
    }

    public int totalAttack(){
        return this.Animal.run() + this.Hero.attack() + this.Weapon.onTopAttack();
    }
    public static void main(String[] args) {
        //
        SuperBox<Animal, Hero, Weapon> s1 = new SuperBox<>();
        s1.SetAnimal(new Tiger());
        s1.SetHero(new Mage());
        s1.SetWeapon(new Bow());
        System.out.println(s1.totalAttack());
        s1.SetAnimal(new Panda());
        System.out.println(s1.totalAttack());
        s1.SetWeapon(new Sword());
        System.out.println(s1.totalAttack());
    }
}
