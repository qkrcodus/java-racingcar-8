package racingcar.model;

public class Car {
    private final String name;
    private int score;

    private Car(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static Car named(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
        return new Car(name, 0);
    }

    public void move(int randomNumber) {
        if (canMove(randomNumber)) {
            score++;
        }
    }

    public static boolean canMove(int randomNumber) {
        if (randomNumber >= 4) {
            return true;
        }
        return false;
    }

    public int getScore() {
        return score;
    }

}
