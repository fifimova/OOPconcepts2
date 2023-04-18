public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
            vehicle.checkTrailer();
//            если можно оставлять пустые методы, тогда в дальнейшем куске нет смысла
//        } else if (vehicle != null) {
//            System.out.println("Обслуживаем " + vehicle.getModelName());
//            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
//                vehicle.updateTyre();
//            }
//            vehicle.checkEngine();
//            vehicle.checkTrailer();
//        } else if (vehicle != null) {
//            System.out.println("Обслуживаем " + vehicle.getModelName());
//            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
//                vehicle.updateTyre();
//            }
//        }
        }
    }
}
