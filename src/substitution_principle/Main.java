package substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    static void printBuildings(List<Building> buildings) {
        for(int i=0; i<buildings.size(); i++) {
            System.out.println(i+1 + ". " + buildings.get(i).toString());
        }
        System.out.println();
    }

    //Using wildcards we can make the method accept subtypes of the parent class
    static void betterPrintBuildings(List<? extends Building> buildings) {
        for(int i=0; i<buildings.size(); i++) {
            System.out.println(i+1 + ". " + buildings.get(i).toString());
        }
        System.out.println();
    }

    //Using wildcards we can make the method accept supertypes
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office()); //Works coz Office is a child of Building
        printBuildings(buildings);

        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        //printBuildings(offices); //Doesn't work coz substitution principal doesn't apply for types of Lists
        betterPrintBuildings(offices); //With the use of wildcards this is now possible

        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        betterPrintBuildings(houses);

        addHouseToList(houses);
        addHouseToList(buildings); //This is now possible because of wildcards


    }

}
