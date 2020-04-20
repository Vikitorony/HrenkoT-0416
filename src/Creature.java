public abstract class Creature {
    private int age;
    private int hp;
    private boolean alive;

    public Creature(int age, int hp, boolean alive) {
        this.age = age;
        this.hp = hp;
        this.alive = alive;
    }

    public abstract String getDeathScream();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            hp = 0;
            setAlive(false);
            System.out.println(getDeathScream());
        }
        this.hp = hp;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
