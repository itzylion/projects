package GameProject;

public class Character { 
        protected String name;
        protected int health;
        protected int mana;
        protected int level;
    
        public Character(String name, int health, int mana, int level) {
            this.name = name;
            this.health = health;
            this.mana = mana;
            this.level = level;
        }
    
        public void attack(Character target) {
            System.out.println(this.name + " attacks " + target.name);
            // Assuming a basic attack decreases the target's health by 10
            target.health -= 10;
        }
    
        public void useAbility() {
            // Default ability does nothing
            System.out.println(this.name + " uses a basic ability.");
        }
    }

