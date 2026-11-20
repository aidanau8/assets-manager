
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        Vehicle car = new Vehicle(
                "My car", "2024-01-15",
                new BigDecimal("20000"),
                "Ford", 2024, 120000
        );

        Vehicle truck = new Vehicle(
                "Tom's truck", "2021-06-10",
                new BigDecimal("30000"),
                "Toyota", 2021, 80000
        );

        House house = new House(
                "My house", "2020-05-10",
                new BigDecimal("250000"),
                "123 Main Street", 1, 1500, 4000
        );

        House vacationHouse = new House(
                "Vacation house", "2022-07-20",
                new BigDecimal("180000"),
                "456 Lake Road", 2, 1200, 3000
        );

        assets.add(car);
        assets.add(truck);
        assets.add(house);
        assets.add(vacationHouse);

        BigDecimal total = BigDecimal.ZERO;

        for (Asset item : assets) {

            System.out.println(item);

            if (item instanceof House) {
                House h = (House) item;
                System.out.println("House at " + h.getAddress());
            }

            if (item instanceof Vehicle) {
                Vehicle v = (Vehicle) item;
                System.out.println("Vehicle: " + v.getYear()
                        + " " + v.getMakeModel());
            }

            System.out.println();

            total = total.add(item.getValue());
        }

        System.out.println("Total value: " + total);
    }
}
