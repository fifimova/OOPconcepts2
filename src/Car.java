public class Car extends MotorVehicle implements ServiceStation {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
