public class Vehicle implements Movable {

    /* ATTRIBUTES */
    private String color;
    private int capacity;
    private String licensePlateNo;
    private String year;
    private String model;
    private String make;
    private Boolean started;
    private Boolean wiperSwiped;

    /* CONSTRUCTORS */
    public Vehicle() {
    }

    public Vehicle(String color, int capacity, String licensePlateNo, String year, String model, String make) {
        this.color = color;
        this.capacity = capacity;
        this.licensePlateNo = licensePlateNo;
        this.year = year;
        this.model = model;
        this.make = make;
    }

    /* GETTERS AND SETTERS */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLicensePlateNo() {
        return licensePlateNo;
    }

    public void setLicensePlateNo(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // public Boolean isStarted() {
    // return started;
    // }

    // public void setStarted(Boolean started) {
    // this.started = started;
    // }

    /* FUNCTIONS/METHODS */
    @Override
    public String toString() {
        return "Vehicle [color=" + color + ", capacity=" + capacity + ", licensePlateNo=" + licensePlateNo + ", year="
                + year + ", model=" + model + ", make=" + make + "]";
    }

    // Need to check the current status of "started" and "wiperSwiped"
    public Boolean getStarted() {
        return started;
    }

    public Boolean getWiperSwiped() {
        return wiperSwiped;
    }

    /* We will need this if there is no getter-setter for start */
    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void honk() {
        System.out.println(("Beep... Beep...")); // Can override this in child Class specific to its honk sound
    }

    public void startSwipe() {
        this.wiperSwiped = true;
    }

    public void stopSwipe() {
        this.wiperSwiped = false;
    }

    /* IMPLEMENT MOVABLE (TO REMOVE ERROR) */
    @Override
    public void moveForward() {
        System.out.println("Vehicle is moving forward...");
    }

    @Override
    public void moveBackward() {
        System.out.println("Vehicle is moving backward...");
    }

    @Override
    public void moveLeft() {
        System.out.println("Vehicle is moving left...");
    }

    @Override
    public void moveRight() {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
        System.out.println("Vehicle is moving right...");
    }

}
