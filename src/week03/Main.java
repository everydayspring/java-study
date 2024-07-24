package week03;

public class Main {
    public static void main(String[] args) {
        /*
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1);

        Car[] cars = new Car[3];

        car1.changeGear('P');
        cars[0] = car1;

        car2.changeGear('N');
        cars[1] = car2;

        car3.changeGear('d');
        cars[2] = car3;

        for(Car car : cars) {
            System.out.println(car.gear);
        }
        */

        /*
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println();

        System.out.println(car.speed);
        System.out.println(car.gear);
        System.out.println(car.lights);
        System.out.println();

        System.out.println(car.tire);
        System.out.println(car.door);
        System.out.println();

        car.color = "blue";
        car.speed = 100;
        car.lights = false;

        System.out.println(car.color);
        System.out.println(car.speed);
        System.out.println(car.lights);
        */

        System.out.println("------------------------");

        Car car = new Car();

        System.out.println(car.gear);
        double speed = car.gasPedal(100, 'D');
        System.out.println(speed);

        boolean lights = car.onOffLights();
        System.out.println(lights);

        System.out.println();
        System.out.println(car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(100, 80, 150);

    }
}
