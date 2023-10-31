package GameProject;

public class Warrior extends Character {
        private int strength;
    
        public Warrior(String name, int health, int mana, int level, int strength) {
            super(name, health, mana, level);
            this.strength = strength;
        }
    
        @Override
        public void attack(Character target) {
            System.out.println(this.name + " swings a mighty sword at " + target.name);
            // Assuming a sword swing does damage equal to strength
            // Decrease target's health by strength
        }
    }
