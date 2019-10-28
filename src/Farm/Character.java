package Farm;

//if (java instanceof Parameter){

        abstract public class Character {
            protected String name;
            protected int health;
            protected int res;

            public int getRes() {
                return res;
            }

            public void setRes(int res) {
                this.res = res;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;

            }

            public int getHealth() {
                return health;
            }

            public void setHealth(int health) {
                this.health = health;
            }

            public Character(String name, int health, int res) {
        this.name = name;
        this.health = health;
        this.res = res;

        }
}
