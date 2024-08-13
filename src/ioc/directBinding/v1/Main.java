package ioc.directBinding.v1;

// 변화에 유연하게 대처하기 위해 느슨한 결합도를 지향한다
// 💡 제어역전 IoC : Inversion oc Control 💡
// 💡 프로그램 제어 흐름의 주도권을 외부로 넘겨주는 것 💡
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.drive();
    }
}
