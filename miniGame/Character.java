import java.util.Scanner;
public class Character {
    public int hp;
    public int atk;
    public int pick;
    public Character(){
        hp=0;
        atk=0;
    }
    public void chooseCharacter(Scanner sc,Character c){
        System.out.println("--------------------------------------");
        System.out.println("Choose your character!");
        System.out.println("1.Soldier");
        System.out.println("2.Sniper");
        System.out.println("3.Tank");
        System.out.println("--------------------------------------");
        System.out.print(">>> ");
        c.pick=sc.nextInt();
    }//end chooseCharacter method
    public void chooseCharacter(Character c) { //Over-road
        c.pick = (int) (1 + Math.random() * 3);
        System.out.println();
    }//end chooseCharacter
    public void attack(Character c){
        c.hp-=this.atk;
    }//end void attack
}//end Character class

