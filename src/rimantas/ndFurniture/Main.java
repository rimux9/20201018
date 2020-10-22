package rimantas.ndFurniture;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Furniture table = new Furniture("table", 2.00f, 1.00f, 0.80f);
        Furniture chair = new Furniture("chair", 0.50f, 0.40f, 0.50f);
        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(table);
        furnitureList.add(chair);

        Room kitchen = new Room("kitchen", 15, furnitureList);
        Room bedroom = new Room("bedroom", 20, furnitureList);
        Room bathroom = new Room("bathroom", 10, furnitureList);
        List<Room> roomsList = new ArrayList<>();
        roomsList.add(kitchen);
        roomsList.add(bedroom);
        roomsList.add(bathroom);

        House house1 = new House(roomsList);
        House house2 = new House(roomsList);
        List<House> housesList = new ArrayList<>();
        housesList.add(house1);
        housesList.add(house2);


        Street streetName = new Street("London", housesList);

        PrintFurnitureFromHouses(roomsList, housesList);

    }

    private static void PrintFurnitureFromHouses(List<Room> roomsList, List<House> housesList) {
        for (House house : housesList) {
            for (Room room : roomsList) {
                System.out.println(room.getFurnitureList());
            }
        }
    }
}