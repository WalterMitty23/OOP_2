public class Car extends Vehicle{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkEngine(String gear) {
        System.out.println("Проверяем КПП");
    }

    @Override
    public void check() {
        System.out.println("Тех осмотр легковых авто " + getModelName());
        super.check();
        checkEngine();
        checkEngine("КПП");
    }
}