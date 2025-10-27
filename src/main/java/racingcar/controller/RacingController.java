package racingcar.controller;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;
import racingcar.model.CarRace;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {
    public void run() {
        List<String> names = InputView.readRacingCarNames();
        int numberOfGames = InputView.readNumberOfGames();

        List<Car> cars = names.stream()
                .map(Car::named)
                .collect(Collectors.toList());

        CarRace race = CarRace.of(cars, numberOfGames);

        for (int i = 0; i < numberOfGames; i++) {
            for (Car car : cars) {
                car.move();
            }
            OutputView.printByPhase(cars);
        }

        OutputView.printWinners(race.findWinners());

    }
}
