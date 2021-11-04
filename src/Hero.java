public class Hero extends Character{

    private double mana;
    private Weapon weapon;

    //making a constructor that matches the super:
    public Hero(String name, double hp, double strength, double mana) {
        super(name, hp, strength);
        this.mana = mana;
    }

    // attack is based on the weapon
    public double attack(boolean special) {
        if (weapon instanceof Magic) {
            if (mana == 0.0) {
                return 0.0;
            }
        }
        return this.weapon.weaponAttack();
    }

    /*
    public double specAttackWithWeapon(boolean special) {
        return 0.0;
    }
     */

    @Override
    public String toString() {
        return super.toString() + "\nMana: " + mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
