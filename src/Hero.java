
abstract class Hero implements HavingSuperAbility {
    public int health;
    public int damage;
    public String superpowerType;

    public Hero(int health, int damage, String superpowerType) {
        this.health = health;
        this.damage = damage;
        this.superpowerType = superpowerType;
    }
    public void applySuperAbility () {
        System.out.println("Hero применил суперспособность " + superpowerType);
    }
}