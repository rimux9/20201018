package rimantas.ndFurniture;

public class Furniture {
    private String Name;
    private Float Width;
    private Float Height;
    private Float Thickness;


    public void getName(String name, float width, float height, float thickness) {
        Name = name;
        Width = width;
        Height = height;
        Thickness = thickness;


    }
    public String getName() {
        return Name;
    }

    }


