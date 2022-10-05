public class Main {

    public static void main(String[] args) {
        Bus aeroTown = new Bus("Hyundai", "Aero Town", 3.1);
        Bus aurora = new Bus("ПАЗ", "Аврора", 2.8);
        Bus crafter = new Bus("Volkswagen", "Crafter", 3.2);
        Bus sprinter = new Bus("Mercedes-Benz", "Sprinter", 3.5);


        Car lada = new Car("Lada", "Kalina", 1.6);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5);
        Car bmw = new Car("BMW", "Z8", 2.5);
        Car hyundai = new Car("Hyundai", "Avante", 1.8);

        Truck fighter = new Truck("Mitsubishi", "Fighter", 8.2);
        Truck bichok = new Truck("ЗИЛ", "5301 Бычок", 4.0);
        Truck vario = new Truck("Mercedes-Benz", "Vario", 4.2);
        Truck tgl = new Truck("MAN", "TGL", 6.7);

        aeroTown.printInfo();
        tgl.doBestLapTime();

        Driver<Bus> kostya = new Driver<>("Kostya Minin", "D", 6, crafter);
        kostya.startMoving(aurora);

        Driver<Car> andrei = new Driver<>("Andrei Ivanov", "B", 4, audi);
        andrei.startMoving(bmw);

        Driver<Truck> mihail = new Driver<>("Mihail Kotov", "C", 8, vario);
        mihail.refuel(fighter);

        printInfoRace(andrei);
    }

    private static void printInfoRace(Driver<? extends Transport>drivers) {
        System.out.println("Водитель " + drivers.getName()
                + " управляет автомобилем " + drivers.getTransport().getBrand() + drivers.getTransport().getModel()
                + " и будет участвовать в заезде.");
    }
}