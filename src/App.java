import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        /* INSTANTIATE OBJECT */
        Car avante = new Car("white", 1599, "SNN7456R", "2019", "Avante", "Hyundai", "Sedan");
        /* ACCESS ATTRIBUTES OF NEW OBJECT */
        avante.honk();
        avante.moveForward();
        avante.moveRight();

        Vehicle honda = new Car("Grey", 1600, "SNP4233M", "2020", "Civic", "Honda", "Hatchback");
        honda.honk();

        // Vehicle schoolBus = new Bus("Yellow", 2000, "PA4556", "2015", "Tiagra",
        // "Mercedes", true, true);
        // schoolBus.setDoorStatus("front"); // setDoorStatus is part of Bus (child)
        // Class only and not in Vehicle (parent) so cannot use for "Vehicle schoolBus"

        Bus schoolBus = new Bus("Yellow", 2000, "PA4556", "2015", "Tiagra", "Mercedes", true, true, false, false);
        schoolBus.startSwipe();
        schoolBus.stop();
        schoolBus.setDoorStatus("front"); // setDoorStatus is part of Bus (child) Class only and not in Vehicle (parent)
        schoolBus.getDoorStatus();
        schoolBus.setDoorStatus("back"); // setDoorStatus is part of Bus (child) Class only and not in Vehicle (parent)
        schoolBus.getDoorStatus();
        schoolBus.setDoorStatus("front"); // setDoorStatus is part of Bus (child) Class only and not in Vehicle (parent)
        schoolBus.getDoorStatus();
        schoolBus.moveForward();
        schoolBus.moveRight();

        // Vehicle schoolBus may be useful instead of using Bus schoolBus for this
        // following:
        // List<Vehicle> vehicles = new ArrayList<>();
        // vehicles.add(avante);
    }
}
