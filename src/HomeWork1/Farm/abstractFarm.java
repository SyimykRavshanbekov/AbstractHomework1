package HomeWork1.Farm;

import HomeWork1.Cows.abstractCow;
import HomeWork1.Horses.abstractHorse;
import HomeWork1.Sheeps.abstractSheep;

public abstract class abstractFarm {
    private String address;
    private abstractCow[] cows;
    private abstractHorse[] horses;
    private abstractSheep[] sheep;
    private String OwnerName;

    public abstractFarm(String address, abstractCow[] cows, abstractHorse[] horses, abstractSheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstractCow[] getCows() {
        return cows;
    }

    public void setCows(abstractCow[] cows) {
        this.cows = cows;
    }

    public abstractHorse[] getHorses() {
        return horses;
    }

    public void setHorses(abstractHorse[] horses) {
        this.horses = horses;
    }

    public abstractSheep[] getSheep() {
        return sheep;
    }

    public void setSheep(abstractSheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public void getInformation(){
        System.out.println("---------------------------------------------"+OwnerName.toUpperCase()+"'s farm ---------------------------------------------");
        System.out.println("Address: " + address);
        System.out.println("-----------------COWS---------------------");
        for (abstractCow i : cows) {
            System.out.println(i);
        }
        System.out.println("\n-----------------HORSES-------------------");
        for (abstractHorse i :horses) {
            System.out.println(i);
        }
        System.out.println("\n-----------------SHEEP-------------------");
        for (abstractSheep i :sheep) {
            System.out.println(i);
        }

    }
}
