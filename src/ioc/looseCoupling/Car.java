package ioc.looseCoupling;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        // 강한 결합도
        this.engine = engine;
    }

    public void drive() {
        this.engine.run();
    }
}
