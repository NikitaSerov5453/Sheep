package Controller;

import Model.SheepGenerator;
import Viever.ConsoleView;

public class Controller {
    public Controller() {

    }

    public void start() {
        SheepGenerator sheepGenerator = new SheepGenerator();
        sheepGenerator.listSheep();
        sheepGenerator.month();
        sheepGenerator.countWoolAndMeat();
        ConsoleView.paramPerMonth(SheepGenerator.wool, SheepGenerator.meat);

    }
}
