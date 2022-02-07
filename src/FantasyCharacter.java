
/*
1. Несмотря на то, что идеологически наши персонажи разные, у всех них должны быть такие характеристики:
имя, здоровье, ловкость, опыт, сила, золото.

Кроме того, все персонажи должны уметь атаковать, иногда атака может быть неудачной(промах), успех атаки зависит от ловкости персонажа
 */
public abstract class FantasyCharacter implements Fighter {  //1.1   По своей сути персонажи довольно одикановые, поэтому мы можем выделть это в отдельный абстрактный класс, и в нем реализовать метод ведения боя:

    private String name;
    private int healthPoints;
    private int strength;
    private int dexterity;
    private int xp;
    private int gold;

    public FantasyCharacter(String name, int healthPoints, int strength, int dexterity, int xp, int gold) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    public int attack() {               //1.2 Этот метод @Ovveride - потому что это метод интерфейса, который мы применили к нашему абстрактному классу. Так мы делаем контракт, что все персонажи этого класса будут уметь атаковать
        if (dexterity * 3 > getRandomValue()) return strength;
        else return 0;
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getXp() {
        return xp;
    }

    public int getGold() {
        return gold;
    }


    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return String.format("%s здоровье%d", name, healthPoints);
    }
}
