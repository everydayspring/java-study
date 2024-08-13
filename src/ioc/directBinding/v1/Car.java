package ioc.directBinding.v1;

// Car -> GasEngine
// Car가 GasEngine에 의존한다
// GasEngine이 변경되면 Car도 변경된다

public class Car {
    private GasEngine engine;

    public Car() {
        // 강한 결합도
        this.engine = new GasEngine();
    }

    public void drive() {
        this.engine.run();
    }
}
