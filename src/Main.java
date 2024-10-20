public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20),
                new Medic(80, 10, 50),
                new Warrior(120, 30)};

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}