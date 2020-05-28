public class Soldier extends Character {
    public Soldier(){
        hp=85;
        atk=10;
    }
    public void attack(Character c){
        c.hp-=this.atk;
    }//end void attack
}//end Soldier class
