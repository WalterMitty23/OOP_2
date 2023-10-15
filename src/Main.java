public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Car car2 = new Car("Mercedes", 4);

        Truck truck = new Truck("Volvo", 4);
        Truck truck2 = new Truck("Kamaz", 4);

        Bicycle bicycle = new Bicycle("Kama", 2);
        Bicycle bicycle2 = new Bicycle("Stels", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();

        station.check(bicycle);
        System.out.println();

        station.check(truck);
        System.out.println();

    }
}