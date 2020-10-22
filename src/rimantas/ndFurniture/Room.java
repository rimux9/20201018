package rimantas.ndFurniture;

import java.util.List;

public class Room {


    private String Name;
    private float Size;
    private List<Furniture> FurnitureList;

    public Room(String name, float size, List<Furniture> furnitureList) {
        Name = name;
        Size = size;
        FurnitureList = furnitureList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSize() {
        return Size;
    }

    public void setSize(float size) {
        Size = size;
    }

    public List<Furniture> getFurnitureList() {
        return FurnitureList;
    }

    public void setFurnitureList(List<Furniture> furnitureList) {
        FurnitureList = furnitureList;
    }

    public String toString() {
        return Name + Size  + FurnitureList ;
    }
}

