import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /* INSTANTIATE OBJECT */
        Car avante = new Car("white", 1599, "SNN7456R", "2019", "Avante", "Hyundai", "Sedan");
        /* ACCESS ATTRIBUTES OF NEW OBJECT */
        avante.honk();
        avante.moveForward();

        Vehicle honda = new Car("Grey", 1600, "SNP4233M", "2020", "Civic", "Honda", "Hatchback");
        honda.honk();
        honda.moveRight();

        // Vehicle schoolBus = new Bus("Yellow", 2000, "PA4556", "2015", "Tiagra",
        // "Mercedes", true, true);
        // schoolBus.setDoorStatus("front"); // setDoorStatus is part of Bus (child)
        // Class only and not in Vehicle (parent) so cannot use for "Vehicle schoolBus"

        Bus schoolBus = new Bus("Yellow", 2000, "PA4556", "2015", "Tiagra", "Mercedes", true, true);
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

        // Print out vehicle information
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(avante);
        vehicles.add(honda);
        vehicles.add(schoolBus);

        for (Vehicle veh : vehicles) {
            System.out.println(veh.toString()); // Use toString() function from Vehicle.java/Car.java/Bus.java depending
                                                // on whether there was an override

        }

        /* USING GENERICS */
        Container<Vehicle> container = new Container<>();
        container.addItem(avante);
        container.addItem(honda);
        container.addItem(schoolBus);

        List<Vehicle> retrieveVehicles = container.getItems();
        for (Vehicle veh : retrieveVehicles) {
            System.out.println(veh.toString());
        }
    }
}
