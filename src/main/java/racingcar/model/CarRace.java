package racingcar.model;

import java.util.List;

public class CarRace {
    private int numberOfGames;
    private List<Car> cars;

    public CarRace(List<Car> cars, int numberOfGames) {
        this.cars = cars;
        this.numberOfGames = numberOfGames;
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
