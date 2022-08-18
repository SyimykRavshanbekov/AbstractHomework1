package HomeWork1.Farm;

import HomeWork1.Cows.abstractCow;
import HomeWork1.Horses.abstractHorse;
import HomeWork1.Sheeps.abstractSheep;

public class Farm1 extends abstractFarm{
    public Farm1(String address, abstractCow[] cows, abstractHorse[] horses, abstractSheep[] sheep, String ownerName) {
        super(address, cows, horses, sheep, ownerName);
    }
}
