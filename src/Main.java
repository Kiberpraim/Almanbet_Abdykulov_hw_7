public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(100, 20, "BOOST"),
                new Medic(150, 10, "HEALING", 50),
                new Warrior(200, 30, "CRITICAL DAMAGE")};
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }

        }
    }
}
