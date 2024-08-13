package ioc.looseCoupling;

// 변화에 유연하게 대처하기 위해 느슨한 결합도를 지향한다
// 💡 제어역전 IoC : Inversion oc Control 💡
// 💡 프로그램 제어 흐름의 주도권을 외부로 넘겨주는 것 💡

// 느슨한 결합
// Car -> Engine(interface) <- GasEngine
public class Main {
    public static void main(String[] args) {

        // IoC 단계

        // 1. 객체의 생성을 외부로 위임
        // DI:의존성 주입 -> 객체가 필요한 종속성을 외부에서 주입해주는 것
        GasEngine gasEngine = new GasEngine();
        Car gasCar = new Car(gasEngine);
        gasCar.drive();

        ElectricEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.drive();
    }
}
