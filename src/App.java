public class App {
    public static void main(String[] args) throws Exception {

        /* INSTANTIATE OBJECT */
        Car avante = new Car("white", 1599, "SNN7456R", "2019", "Avante", "Hyundai", "Sedan");
        /* ACCESS ATTRIBUTES OF NEW OBJECT */
        avante.honk();

        Vehicle honda = new Car("Grey", 1600, "SNP4233M", "2020", "Civic", "Honda", "Hatchback");
        honda.honk();
    }
}
