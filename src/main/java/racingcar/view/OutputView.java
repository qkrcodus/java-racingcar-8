package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.Car;

public final class OutputView {
    private static final String BETWEEN_NAME_AND_MOVES = " : ";
    private static final String ONE_MOVE = "-";
    private static final String NAME_DELIMETER = ",";

    private OutputView() {
    }

    public static void printByPhase(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + BETWEEN_NAME_AND_MOVES + ONE_MOVE.repeat(car.getScore()));
        }
        System.out.println();
    }

    public static void printWinners(List<Car> winners) {
        String names = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(NAME_DELIMETER));
        System.out.println("최종 우승자 : " + names);
    }
}
