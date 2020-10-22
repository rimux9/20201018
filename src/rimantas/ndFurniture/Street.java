package rimantas.ndFurniture;

import java.util.List;

public class Street {
    private String City;
    private List<House> houses;

    public Street(String city, List<House> houseList) {
        City = city;
        houses = houseList;
    }

    public String getTownName() {
        return City;
    }

    public void setTownName(String townName) {
        City = City;
    }

    public List<House> getHouseList() {
        return houses;
    }

    public void setHouseList(List<House> houseList) {
        houses = houseList;
    }

    @Override
    public String toString() {
        return City + houses;
    }
}
