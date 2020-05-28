public class Tank extends Character {
    public Tank(){
        hp=100;
        atk=20;
    }
    public void attack(Character c){
        c.hp -= this.atk;
    }//end void attack
}//end Tank class
