package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        Car k3Car = new K3Car();
        Car model3Car = new Model3Car();

        driver.setCar(k3Car);
        driver.drive();
        System.out.println("\n\n\n");

        driver.setCar(model3Car);
        driver.drive();

    }

}
