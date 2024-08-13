package ioc.looseCoupling;

public class GasEngine implements Engine{
    @Override
    public void run(){
        System.out.println("::: loosCoupling - 가솔린 엔진이 동작합니다");
    }

//    public void run(){
//        System.out.println("가솔린 엔진이 동작합니다");
//    }
}
