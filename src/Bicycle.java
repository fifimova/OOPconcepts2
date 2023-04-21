public class Bicycle extends WheelsVehicle implements ServiceStation {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
