package Farm;

public interface Attacker {
    void attack(Pet pet);

    default void runAway() {
        System.out.println("Домашнее животное убежало");
    }
}
