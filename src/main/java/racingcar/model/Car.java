package racingcar.model;

public final class Car {
    private static final int THRESHOLD_NAME_LENGTH = 5;
    private static final int THRESHOLD_MOVE = 4;
    private final String name;
    private final NumberPicker picker;
    private int score;

    private Car(String name, NumberPicker picker) {
        this.name = name;
        this.score = 0;
        this.picker = picker;
    }

    public static Car named(String name) {
        validateName(name);
        return new Car(name, new RandomNumberPicker());
    }

    static Car tested(String name, NumberPicker picker) {
        validateName(name);
        return new Car(name, picker);
    }

    private static void validateName(String name) {
        if (name.length() > THRESHOLD_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    public void move() {
        if (picker.pick() >= THRESHOLD_MOVE) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

}
