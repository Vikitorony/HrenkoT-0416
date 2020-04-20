public class Dog extends Animal {
    private int attackPower;

    public Dog(int age) {
        super(age, 80, true, "dog", true, false, true, true);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public String sayHello() {
        return "vau";
    }

    @Override
    public String getDeathScream() {
        return "doh";
    }
}
