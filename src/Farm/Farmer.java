package Farm;

public class Farmer extends Character implements Eat, Shoo {

    public Farmer(String name, int health, int res) {
        super(name, health, res);
    }





    @Override
    public void takeRes(Pet pet) {
        this.res += pet.getRes();
    }

    @Override
    public void shoo(Wild wild) {
        System.out.println("Фермер прогоняет дикое животное" + wild.getName());


    }
}
