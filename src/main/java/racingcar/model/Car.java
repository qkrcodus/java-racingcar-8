package racingcar.model;

public class Car {
    private final String name;

    private Car(String name) {
        this.name = name;
    }

    public static Car named(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
        return new Car(name);
    }


}
