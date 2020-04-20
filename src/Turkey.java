public class Turkey extends Animal {
    private int attackPower;

    public Turkey(int age) {
        super(age, 60, true, "turkey", true, true, false, true);
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
        return "krr";
    }

    @Override
    public String getDeathScream() {
        return "nyekk";
    }
}
