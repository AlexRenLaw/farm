package Farm;

public class Pet extends Creature {

    public Pet(String name, int health, int res, int speed, int weight) {
        super(name, health, res, speed, weight);
    }


    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

}
