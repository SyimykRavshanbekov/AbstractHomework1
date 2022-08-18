package HomeWork1;

import HomeWork1.Cows.Cow;
import HomeWork1.Cows.abstractCow;
import HomeWork1.Farm.Farm1;
import HomeWork1.Horses.Horse;
import HomeWork1.Horses.abstractHorse;
import HomeWork1.Sheeps.Sheep;
import HomeWork1.Sheeps.abstractSheep;

public class Main {
    public static void main(String[] args) {
        Horse horse1 = new Horse(1000, 10, "white", "female", "Big Horse");
        Horse horse2 = new Horse(1500, 15, "dark", "male", "Mega Horse");
        abstractHorse[] horses1 = {horse1, horse2};
        abstractHorse[] horses2 = {horse1};

        Sheep sheep1 = new Sheep(80, 4, "female", "Fat sheep");
        Sheep sheep2 = new Sheep(50, 3, "male", "Small sheep");
        Sheep sheep3 = new Sheep(50, 3, "male", "Big sheep");
        abstractSheep[] sheeps1 = {sheep1, sheep2, sheep3};
        abstractSheep[] sheeps2 = {sheep1};

        Cow cow1 = new Cow(300, 5, "female", "Big cow");
        Cow cow2 = new Cow(350, 6, "female", "MegaCow");
        Cow cow3 = new Cow(250, 3, "female", "Small cow");
        Cow cow4 = new Cow(300, 4, "female", "MilkCow");
        Cow cow5 = new Cow(300, 6, "female", "Mu");
        abstractCow[] cows1 = {cow1, cow2, cow3, cow4, cow5};
        abstractCow[] cows2 = {cow1};

        Farm1 farm1 = new Farm1("Koi-Tash", cows1, horses1, sheeps1, "Syimyk");
        Farm1 farm2 = new Farm1("Dacha", cows2, horses2, sheeps2, "Bakai");


        farm1.getInformation();
        farm2.getInformation();
    }
}