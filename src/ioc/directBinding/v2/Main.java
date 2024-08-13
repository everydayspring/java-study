package ioc.directBinding.v2;

// 변화에 유연하게 대처하기 위해 느슨한 결합도를 지향한다
// 💡 제어역전 IoC : Inversion oc Control 💡
// 💡 프로그램 제어 흐름의 주도권을 외부로 넘겨주는 것 💡
public class Main {
    public static void main(String[] args) {
        Car gasCar = new Car("gas");
        gasCar.drive();

        Car eletricCar = new Car("electric");
        eletricCar.drive();
    }
}
