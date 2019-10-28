package Farm;

public class Wild extends Creature implements Attacker {
    protected int power;

    public Wild(String name, int health, int res, int speed, int weight, int power) {
        super(name, health, res, speed, weight);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    @Override
    public void attack(Pet pet) {
        System.out.println("Дикое животное атакует домашнее животное" + pet.getName());


    }
}
