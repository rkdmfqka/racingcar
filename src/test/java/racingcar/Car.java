package test.java.racingcar;

public class Car {
    //자동차 객체의 동작 방법
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }
    // 추가 기능 구현
    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        position++;
    }

    public String toGo() {
        return name + " : " + position;
    }
}