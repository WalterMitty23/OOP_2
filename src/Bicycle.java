public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Тех осмотр велосипеда " + getModelName());
        super.check();
    }
}