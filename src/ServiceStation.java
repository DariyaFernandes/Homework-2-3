public class ServiceStation {

    public void check(Bicycle bicycle) {
        bicycle.doService();

    }
    public void check(Car car) {

        System.out.println("Обслуживаем " + car.getModelName());
        car.doService();

    }
    public void check(Truck truck) {
        truck.doService();

    }

}