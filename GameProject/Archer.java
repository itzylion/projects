package GameProject;

public class Archer extends Character {
        private int agility;
    
        public Archer(String name, int health, int mana, int level, int agility) {
            super(name, health, mana, level);
            this.agility = agility;
        }
    
        @Override
        public void attack(Character target) {
            System.out.println(this.name + " shoots an arrow at " + target.name);
            // Assuming an arrow shot does damage equal to agility
            // Decrease target's health by agility
        }
    }

