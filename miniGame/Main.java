import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Character user=new Character();
        Character pc=new Character();
        Scanner stdIn = new Scanner(System.in);
        int i=1;

        user.chooseCharacter(stdIn,user); //Choose Of User
        System.out.println();

        switch (user.pick) {
            case 1:
                user = new Soldier();
                System.out.println("Soldier picked\nYour pick = Soldier");
                System.out.println("Your hp = "+user.hp+", "+"Your atk = "+user.atk);
                break;
            case 2:
                user = new Sniper();
                System.out.println("Sniper picked\nYour pick = Sniper");
                System.out.println("Your hp = "+user.hp+", "+"Your atk = "+user.atk);
                break;
            case 3:
                user = new Tank();
                System.out.println("Tank picked\nYour pick = Tank");
                System.out.println("Your hp = "+user.hp+", "+"Your atk = "+user.atk);
                break;
            default:
                System.out.println("Enter INTEGER in range (1~3)");
        }//end switch-case

        pc.chooseCharacter(pc); //Choose Of PC

        switch (pc.pick) {
            case 1:
                pc = new Soldier();
                System.out.println("Pc\'s pick = Soldier");
                System.out.println("Pc\'s hp = "+pc.hp+", "+"Pc\'s atk = "+pc.atk);
                break;
            case 2:
                pc = new Sniper();
                System.out.println("Pc\'s pick = Sniper");
                System.out.println("Pc\'s hp = "+pc.hp+", "+"Pc\'s atk = "+pc.atk);
                break;
            case 3:
                pc = new Tank();
                System.out.println("Pc\'s pick = Tank");
                System.out.println("Pc\'s hp = "+pc.hp+", "+"Pc\'s atk = "+pc.atk);
                break;
            default:
        }//end switch-case

        while(true){

            if(user.hp<=0) {
                System.out.println("\nYou LOSE...");
                System.out.println("--------------------------------------");
                break;
            }
            else if(pc.hp<=0){
                System.out.println("\nYou WIN!!!");
                System.out.println("--------------------------------------");
                break;
            }
            System.out.println("----------------- "+i+" ------------------");
            user.attack(pc);

            if(Sniper.ok) {
                System.out.println("[You -> Pc] " + (user.atk + 45) + " attack !");
                System.out.println("Your hp = " + user.hp);
                System.out.println("Pc\'s hp = " + pc.hp);
                Sniper.ok=false;
            }
            else {
                System.out.println("[You -> Pc] " + user.atk + " attack !");
                System.out.println("Your hp = " + user.hp);
                System.out.println("Pc\'s hp = " + pc.hp);
            }
            System.out.println();

            if(user.hp<=0) {
                System.out.println("\nYou LOSE...");
                System.out.println("--------------------------------------");
                break;
            }
            else if(pc.hp<=0){
                System.out.println("\nYou WIN!!!");
                System.out.println("--------------------------------------");
                break;
            }

            pc.attack(user);

            if(Sniper.ok) {
                System.out.println("[Pc -> You] " + (pc.atk + 45) + " attack !");
                System.out.println("Your hp = " + user.hp);
                System.out.println("Pc\'s hp = " + pc.hp);
                i++;
                Sniper.ok=false;
            }
            else {
                System.out.println("[Pc -> You] " + pc.atk + " attack !");
                System.out.println("Your hp = " + user.hp);
                System.out.println("Pc\'s hp = " + pc.hp);
                i++;
            }
        }

    }
}


