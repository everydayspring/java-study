package ioc.looseCoupling;

public class ElectricEngine implements Engine{

    @Override
    public void run() {
        System.out.println("::: loosCoupling - 전기 엔진이 동작합니다");
    }
}
