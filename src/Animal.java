public abstract class Animal extends Creature {
    private String type;
    private boolean domestic;
    private boolean edible;
    private boolean forFun;
    private boolean forSecure;

    public Animal(int age, int hp, boolean alive, String type, boolean domestic, boolean edible, boolean forFun, boolean forSecure) {
        super(age, hp, alive);
        this.type = type;
        this.domestic = domestic;
        this.edible = edible;
        this.forFun = forFun;
        this.forSecure = forSecure;
    }

    public abstract String sayHello();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public boolean isForFun() {
        return forFun;
    }

    public void setForFun(boolean forFun) {
        this.forFun = forFun;
    }

    public boolean isForSecure() {
        return forSecure;
    }

    public void setForSecure(boolean forSecure) {
        this.forSecure = forSecure;
    }
}
