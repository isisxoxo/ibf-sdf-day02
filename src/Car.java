public class Car extends Vehicle { // Car Class (child) will extend from the Vehicle Class (parent)

    /* ATTRIBUTES SPECIFIC TO CAR */
    private String bodyType; // Sedan, Hatchback etc.

    /* CONSTRUCTORS FOR CAR */
    public Car(String bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String color, int capacity, String licensePlateNo, String year, String model, String make,
            String bodyType) {
        super(color, capacity, licensePlateNo, year, model, make);
        this.bodyType = bodyType;
    }

    /* GETTERS AND SETTERS FOR CAR ATTRIBUTES */
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /* FUNCTIONS SPECIFIC TO CAR */
    @Override
    public void honk() {
        System.out.println(this.getLicensePlateNo() + " Tuuu... Tuuu... Tuuu..."); // To know which car honked
    }

    @Override
    public void moveForward() {
        System.out.println("Car is moving forward...");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car is moving backward...");
    }

    @Override
    public void moveLeft() {
        System.out.println("Car is moving left...");
    }

    @Override
    public void moveRight() {
        System.out.println("Car is moving right...");
    }

    @Override
    public String toString() {
        return "Car [color=" + this.getColor() + ", capacity=" + this.getCapacity() + ", licensePlateNo=" + this
                .getLicensePlateNo() + ", year="
                + this.getYear() + ", model=" + this.getModel() + ", make=" + this.getMake() + ", bodyType=" + bodyType
                + "]";
    } // Override Vehicle to string so that it will display as Car [...] instead of
      // Vehicle [...]

}
