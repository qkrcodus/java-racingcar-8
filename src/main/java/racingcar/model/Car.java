package racingcar.model;

public final class Car {
    private static final int THRESHOLD_NAME_LENGTH = 5;
    private static final int THRESHOLD_MOVE = 4;
    private final String name;
    private int score;

    private Car(String name) {
        this.name = name;
        this.score = 0;
    }

    public static Car named(String name) {
        if (name.length() > THRESHOLD_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
        return new Car(name);
    }

    public void move(int randomNumber) {
        if (canMove(randomNumber)) {
            score++;
        }
    }

    public static boolean canMove(int randomNumber) {
        if (randomNumber >= THRESHOLD_MOVE) {
            return true;
        }
        return false;
    }

    public int getScore() {
        return score;
    }

}
