package java_packages.Theorie.InterfaceOef;

public class AppMain {
    public static void main(String[] args) {

        GasStation station = new GasStation();

        Car c = new Car("Astra", "Opel");
        Airplane a = new Airplane("Boeing", "747","2 wings");

        station.service(c);
        station.service(a);

        WashingStation w = new WashingStation();

        Bicycle b = new Bicycle("Tandem","Handibike");

        b.Wash();
        c.wash();
        a.wash();
    }
}
