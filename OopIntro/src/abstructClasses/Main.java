package abstructClasses;

import abstructClasses.demo.CustomerManager;
import abstructClasses.demo.MySqlDatabaseManager;
import abstructClasses.demo.SqlDatabaseManager;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator wgc = new WomanGameCalculator();
        wgc.calculate();
        wgc.gameOver();
    }

}
