public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Ходу");
    }

    @Override
    public void finishMoving() {
        System.out.println("По тормозам");
    }

    @Override
    public void doPitStop() {
        System.out.println("Смени резину");
    }

    @Override
    public void doBestLapTime() {
        System.out.println("Сделай лучшее время");
    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Сделай максимальную скорость");
    }
}
