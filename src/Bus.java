public class Bus extends Transport implements Competing {

    public Bus(String brand,
               String model,
               double engineVolume
//               int productionYear,
//               String productionCountry,
//               String colorBody,
//               int maxSpeed
    ) {
        super(brand,
                model,
                engineVolume
//                productionYear,
//                productionCountry,
//                colorBody,
//                maxSpeed
        );
    }

    @Override
    public void startMoving() {
        System.out.println("Вперед");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение");
    }

    @Override
    public void doPitStop() {
        System.out.println("Сделай Пит стоп!");
    }

    @Override
    public void doBestLapTime() {
        System.out.println("Лучший круг");
    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Выжми максимум!");
    }

//    @Override
//    public void refuel() {
//        System.out.println("Можно заправлять бензином или дизелем!");
//    }

}
