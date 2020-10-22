package rimantas.ndFurniture;

public class Furniture {

    private String Name;
    private float Length;
    private float Width;
    private float Heigth;

    public Furniture(String name, float length, float width, float heigth) {
        Name = name;
        Length = length;
        Width = width;
        Heigth = heigth;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getLength() {
        return Length;
    }

    public void setLength(float length) {
        Length = length;
    }

    public float getWidth() {
        return Width;
    }

    public void setWidth(float width) {
        Width = width;
    }

    public float getHeigth() {
        return Heigth;
    }

    public void setHeigth(float heigth) {
        Heigth = heigth;
    }

    public String toString() {
        return Name;
    }
}
