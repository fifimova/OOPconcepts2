public abstract class MotorVehicle extends WheelsVehicle {
    public MotorVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
