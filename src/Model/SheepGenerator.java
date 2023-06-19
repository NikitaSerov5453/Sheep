package Model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SheepGenerator {
    private static final int MIN_SHEEP = 5;
    private static final int MAX_SHEEP = 150;
    private static final int DAY_IN_MONTH = 30;

    private final int numberSheep = random(MIN_SHEEP, MAX_SHEEP);
    public static int max = 0;
    public static int wool;
    public static int meat;

    public SheepGenerator() {

    }

    public int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public int getNumberSheep() {
        return numberSheep;
    }

    public static ArrayList<Sheep> sheepArray = new ArrayList<>();
    public static ArrayList<Sheep> killSheep = new ArrayList<>();

    public void listSheep() {
        for (int i = 0; i < getNumberSheep(); i++) {
            sheepArray.add(new Sheep());
        }
    }

    public void addOneDay() {
        int i = 0;
        for (Sheep sheep : sheepArray) {
            sheepArray.get(i).setWeightMeat(sheep.getWeightMeat() + 1);
            sheepArray.get(i).setWoolWeight(sheep.getWoolWeight() + 200);
            i++;
        }
    }

    public void month() {
        for (int i = 1; i <= DAY_IN_MONTH; i++) {
            killSheep();
            addOneDay();
            if (i % 5 == 0) {
                sheepArray.add(new Sheep());
            }
        }
    }

    public static void killSheep() {
        for (int i = 0; i < sheepArray.size(); i++) {
            getMaxValue(sheepArray);
            if (sheepArray.get(i).getWeightMeat() == max) {
                killSheep.add(sheepArray.get(i));
                sheepArray.remove(i);
                max = 0;
                break;
            }
        }
    }

    public static void getMaxValue(ArrayList<Sheep> list) {
        for (Sheep sheep : list) {
            if (sheep.getWeightMeat() > max) {
                max = sheep.getWeightMeat();
            }
        }
    }

    public void countWoolAndMeat() {
        for (Sheep sheep : killSheep) {
            meat += sheep.getWeightMeat();
            wool += sheep.getWoolWeight();
        }
    }
}