public class Character implements CharacterInterface {
    private String name;
    private double hitPoints;
    private double strength;
    private Weapon weapon;

    public Character(String name, double hp, double strength){
        this.name = name;
        this.hitPoints = hp;
        this.strength = strength;
    }


    //attacks based on the weapon blah blah blah
    @Override
    public double attack() {
        return 0;
    }
}