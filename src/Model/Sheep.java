package Model;

public class Sheep {
    private static final int MIN_VALUE_WEIGHT_MEAT = 5;
    private static final int MAX_VALUE_WEIGHT_MEAT = 30;
    private static final int MIN_VALUE_WEIGHT_WOOL = 4000;
    private static final int MAX_VALUE_WEIGHT_WOOL = 6000;
    private int weightMeat;
    private int woolWeight;

    public Sheep() {
        weightMeat = sheepGenerator.random(MIN_VALUE_WEIGHT_MEAT, MAX_VALUE_WEIGHT_MEAT);
        woolWeight = sheepGenerator.random(MIN_VALUE_WEIGHT_WOOL, MAX_VALUE_WEIGHT_WOOL);
    }

    SheepGenerator sheepGenerator = new SheepGenerator();

    public int getWeightMeat() {
        return this.weightMeat;
    }

    public int getWoolWeight() {
        return this.woolWeight;
    }

    public void setWeightMeat(int weightMeat) {
        this.weightMeat = weightMeat;
    }

    public void setWoolWeight(int woolWeight) {
        this.woolWeight = woolWeight;
    }

    @Override
    public String toString() {
        return "\n" + "Вес шерсти = " + getWoolWeight() + ", вес мяса = " + getWeightMeat();
    }
}
