package ioc.directBinding.v2;

// Car -> GasEngine
// Car가 GasEngine에 의존한다
// GasEngine이 변경되면 Car도 변경된다

public class Car {
    private String model;

    private GasEngine gasEngine;
    private ElectricEngine electricEngine;

    public Car(String model) {
        this.model = model;

        if(model.equals("gas")){
            this.gasEngine = new GasEngine();
        } else if(model.equals("electric")) {
            this.electricEngine = new ElectricEngine();
        }
    }

    public void drive() {
        if(model.equals("gas")){
            this.gasEngine.run();
        } else if(model.equals("electric")) {
            this.electricEngine.run();
        }
    }
}
