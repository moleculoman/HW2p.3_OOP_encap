import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car taxi = new Car("Ford","Focus",1.3,"Еловый", 2011, "США","Робот", "Хэтчбек", "А412АА23",4,true);
        System.out.println(taxi.toString());
        System.out.println("Решение по шиномонтажу, надо ли переходить на зимнюю резину: " + taxi.setWinterTires(12));
        System.out.println("Регистрационный номер соответствует законодательству: " + taxi.checkLicensePlate());
        Car.Key firstCar = new Car.Key(true,true);
        Car.Insurance taxiIns = new Car.Insurance(76,3456,"выа") ;
        }
}