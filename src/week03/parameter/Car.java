package week03.parameter;

public class Car {
    // 고유데이터
    String company;             // 회사
    String model = "Gv80";      // 모델
    String color;               // 색
    double price;               // 가격

    // 상태 데이터
    double speed;               // 속도 km/h
    char gear;                  // 기어상태 P, R, N D
    boolean lights = true;      // 조명 상태

    // 객체 데이터
    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();

    // 기본생성자 (생략가능)
    public Car () {
        System.out.println("기본생성자 호출, 객체가 생성됨");
    }

    // 생성자
    public Car (String company, String model, String color, double price, double speed, char gear, boolean lights) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.gear = gear;
        this.lights = lights;
    }

    double gasPedal (double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal () {
        speed = 0;
        return speed;
    }

    char changeGear (char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights () {
        lights = !lights;
        return lights;
    }

    void horn () {
        System.out.println("다비켜라~");
    }

    void carSpeeds(double ... speeds) {
        for (double speed : speeds) {
            System.out.println(speed);
        }
    }

    double brakePedal(char type) {
        speed = 0;
        type = 'P'; // 정지 후 매개변수 type을 어떤 타입으로 전달 받았는지 상관없이 'P'로 고정시키기
        changeGear(type);
        return speed;
    }

    Tire setTire(Tire tireCompany) {
        tireCompany.company = "KIA"; // 금호 타이어를 전달 받았지만 강제로 KIA 타이어로 교체
        tire = tireCompany;
        return tire;
    }



}
