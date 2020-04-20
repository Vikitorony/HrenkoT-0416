public class Main {
    public static void main(String[] args) {
        Creature[] creatures = new Creature[100];
        creatures[0] = getRandomCreature();
        if (creatures[0].getClass().equals("cat")) {
            Cat c = (Cat) creatures[0];
        }

        Wolf wolf = new Wolf(5);
        Animal cat = new Cat(3);

        for (int i = 0; i < creatures.length; i++) {
            creatures[i] = getRandomCreature();
        }
    }

    public static Creature getRandomCreature() {
        int rnd = (int) Math.random() * 100;
        if (rnd < 60) {
            return new Chicken(2);
        } else if (rnd < 65) {
            return new Turkey(3);
        } else if (rnd < 70) {
            return new Cat(8);
        } else if (rnd < 80) {
            return new Dog(5);
        } else {
            return new Wolf(7);
        }
    }

    public static void attackAnimal(Wolf attacker, Animal poorAnimal) {
        poorAnimal.setHp(poorAnimal.getHp() - attacker.getAttackScore());
        if (poorAnimal.isAlive()) {
            // adott objektum egy adott osztályra vagy interface-re castolható-e
            if (poorAnimal instanceof AttackerInterface){
                AttackerInterface ai = (AttackerInterface) poorAnimal;

                attacker.setHp(attacker.getHp() - ai.getAttackScore());
            }
        }
    }
}
