package auto;

public class Car {
    String company;
    String model;
    String color;
    int gear;
    int speed;

    public Car() {
        this("검정", 1, 0); //아래 this 쓰고 작성하기
        color = "검정";
        speed = 0;
        gear = 1;
    }

    public Car(String color, int gear, int speed) {
        this.color = color; // 객체일 때만 사용 // this points to the instance of current class
        this.gear = gear;
        this.speed = speed;

    }

    public Car(String company, String model, String color, int gear, int speed) {
//        this.company = company; 에러남
        this(color, gear, speed);
        this.company = company;
        this.model = model;

    }

    boolean changeGear() {
        if (gear + 1 < 7) {
            gear++;
            return true;
        } else return false;
    }

    boolean changeGear(int step) {
        if (step > 0 && step < 8) {
            gear = step;
            return true;
        } else return false;
    }
    void speedUp() {
        if (speed + 20 < 200)
            speed += 20;

        else speed = 200;
}
    void speedDown() {
        if (speed > 20)
            speed -= 20;
        else speed = 0;
    }

    @Override
    public String toString() {
        String str;
        str = "제조회사:" + company + ", model:" + model + "\n";
        return str;

    }
}
