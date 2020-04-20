public class Wolf extends Animal implements AttackerInterface {
    private int attackPower;
    public Wolf(int age) {
        super(age, 200, true, "wolf", false, false, false, false);
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public String sayHello() {
        return "wrr";
    }

    @Override
    public String getDeathScream() {
        return "ouch";
    }

    @Override
    public int getAttackScore() {
        return 50;
    }
}
