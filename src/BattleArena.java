import java.util.LinkedList;
import java.lang.Math;


public class BattleArena {
    LinkedList<CharacterInterface> heroes;
    LinkedList<CharacterInterface> badguys;
    LinkedList<Weapon> weaponRack;
    CharacterInterface winner;

    public BattleArena(LinkedList<CharacterInterface> heroes,
                       LinkedList<CharacterInterface> badguys,
                       LinkedList<Weapon> weaponRack){
        this.heroes = heroes;
        this.badguys = badguys;
        this.weaponRack = weaponRack;
    }

    public void FIGHT(){
        System.out.println("FIGHT");
    	Random rand = new Random();
    	 
    	Character c1 = heroes.getFirst();
    	Character c2 = badguys.getFirst();
         
         double damagec1 = (double) rand.nextInt((int) c1.getStrength());
         double damagec2 = (double) rand.nextInt((int) c2.getStrength());
         
         
         while(c1.isAlive()  && c2.isAlive())
         {	
         	 System.out.println(c1.getName() + " Strength: " + c1.getHitPoints() + " " + c2.getName() + " Strength: " + c2.getHitPoints());
             System.out.println(c1.getName() + " Attacks " + c2.getName());
             c2.takeDamage(damagec2);
             System.out.println(c1.getName() + " Strength: " + c1.getHitPoints() + " " + c2.getName() + " Strength: " + c2.getHitPoints());
             System.out.println(c2.getName() + " Attacks " + c1.getName());
             c1.takeDamage(damagec1); 
             
             if(c1.isAlive() == false) {
             	System.out.println(c2.getName() + " Wins");
             }
             
             if(c2.isAlive() == false) {
             	System.out.println(c1.getName() + " Wins");
             }
         }
    }

    public void AnnounceContestants(){
        //loops through the contestants in the arena.

        System.out.println("******ANNOUNCING OUR HEROES******");
        int count = 1;
        for(CharacterInterface C : this.heroes){
            System.out.println(String.format("Contestant #%d:", count++));
            System.out.println(C);
        }

        System.out.println("******ANNOUNCING OUR BAD GUYS******");
        System.out.println("(boos from the crowd)");
        count = 1;
        for(CharacterInterface C : this.badguys){
            System.out.println(String.format("Contestant #%d:", count++));
            System.out.println(C);
        }

        System.out.println("******AVAILABLE WEAPONS FOR OUR HEROES*****");
        for(Weapon W : this.weaponRack){
            System.out.println(W);
        }


    }

    public void AnnounceWinner(){
        //displays the winner and their weapon, fireworks, boom.
        System.out.println("\n\nAND THE WINNER IS: ");
        System.out.println("(rumbling)");

        System.out.println(this.winner);

    }
    public double getRandomAttack(CharacterInterface contestant) {

        if (contestant instanceof BadGuy) {
            //attack function call for the badguy
        }

        if (contestant instanceof Hero) {
            //hand of god roll:
            int handofgod = (int) Math.floor(Math.random() * 100) % 2;

            //attack function call for the hero

        }
        return 0d;
    }


}

