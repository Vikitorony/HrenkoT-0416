public class Chicken extends Animal {

    public Chicken(int age) {
        super(age, 50, true, "chicken", true, true, false, false);
    }

    @Override
    public String sayHello() {
        return "kotkot";
    }

    @Override
    public String getDeathScream() {
        return "rikk";
    }
}
