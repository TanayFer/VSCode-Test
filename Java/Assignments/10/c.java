abstract class GameCharacter {
    protected String name;
    protected int health;
    
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    abstract void attack();
    
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health: " + health);
    }
}

class Warrior extends GameCharacter {
    public Warrior(String name, int health) {
        super(name, health);
    }
    
    @Override
    void attack() {
        System.out.println(name + " performs a powerful sword slash!");
    }
}

class Mage extends GameCharacter {
    public Mage(String name, int health) {
        super(name, health);
    }
    
    @Override
    void attack() {
        System.out.println(name + " casts a fireball spell!");
    }
}