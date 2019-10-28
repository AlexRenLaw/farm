package Farm;

abstract public class Creature extends Character {
protected int speed;
protected int weight;

    @Override
    public String toString() {
        return "Creature{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Creature(String name, int health, int res, int speed, int weight) {
        super(name, health, res);
        this.speed = speed;
        this.weight = weight;

    }
}
