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

}
