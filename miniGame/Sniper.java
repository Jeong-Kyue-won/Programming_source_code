public class Sniper extends Character {
    public static boolean ok = false;
    public Sniper(){
        hp=70;
        atk=5;
    }
    public void attack(Character c){
        if((int)(1+Math.random()*100)>70){
            c.hp -= this.atk+45; //atk = 50
            System.out.println("Critical !!!");
            ok=true;
             }
        else
            c.hp -= this.atk;
    }//end void attack
}//end Sniper class
