package GameProject;

public class Mage extends Character {
        private int spellPower;
    
        public Mage(String name, int health, int mana, int level, int spellPower) {
            super(name, health, mana, level);
            this.spellPower = spellPower;
        }
    
        @Override
        public void useAbility() {
            System.out.println(this.name + " casts a powerful spell!");
            // Assuming a spell does damage equal to spellPower
            // Decrease target's health by spellPower
        }
}
