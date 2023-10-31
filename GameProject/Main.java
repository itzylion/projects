package GameProject;
//Main class for testing
public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("Gandalf", 100, 200, 10, 50);
        Warrior warrior = new Warrior("Conan", 150, 50, 15, 20);
        Archer archer = new Archer("Legolas", 120, 80, 12, 30);

        mage.useAbility();  // Mage-specific ability
        warrior.attack(mage);  // Warrior-specific attack on the mage
        archer.attack(warrior);  // Archer-specific attack on the warrior

        System.out.println("Mage's Health: " + mage.health);
        System.out.println("Warrior's Health: " + warrior.health);
        System.out.println("Archer's Health: " + archer.health);
    }
}

