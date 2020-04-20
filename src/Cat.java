public class Cat extends Animal implements AttackerInterface {

    public Cat(int age) {
        super(age,50,true, "cat", true, false, true, false);
    }

    @Override
    public String sayHello() {
        return "miau";
    }

    @Override
    public String getDeathScream() {
        return "nyau";
    }

    @Override
    public int getAttackScore() {
        return 5;
    }
}
