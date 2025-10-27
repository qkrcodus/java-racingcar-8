package racingcar.model;

import java.util.List;

public class CarRace {
    private static final int THRESHOLD_NUMBER_OF_GAMES = 0;
    private int numberOfGames;
    private List<Car> cars;

    private CarRace(List<Car> cars, int numberOfGames) {
        this.cars = cars;
        this.numberOfGames = numberOfGames;
    }

    public static CarRace of(List<Car> cars, int numberOfGames) {
        if (numberOfGames <= THRESHOLD_NUMBER_OF_GAMES) {
            throw new IllegalArgumentException("경주 횟수는 0보다 커야 합니다.");
        }
        return new CarRace(cars, numberOfGames);
    }

    public List<Car> findWinners() {
        final int maxScore = cars.stream()
                .mapToInt(Car::getScore)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getScore() == maxScore)
                .toList();
    }

}
