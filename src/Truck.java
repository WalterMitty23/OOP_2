public class Truck extends Vehicle{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Тех осмотр грузовых авто " + getModelName());
        super.check();
        checkEngine();
        checkTrailer();
    }
}