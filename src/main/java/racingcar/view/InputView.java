package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public final class InputView {
    private static final String NAME_DELIMETER = ",";

    private InputView() {
    }

    public static List<String> readRacingCarNames() {
        String inputCarNames = Console.readLine();
        String[] cars = inputCarNames.split(NAME_DELIMETER);
        List<String> carNames = new ArrayList<>();
        for (String car : cars) {
            carNames.add(car);
        }
        return carNames;
    }

    public static int readNumberOfGames() {
        String inputNumberOfGames = Console.readLine();
        int number;
        number = Integer.parseInt(inputNumberOfGames.trim());
        if (number <= 0) {
            throw new IllegalArgumentException("경주 횟수는 0보다 커야 합니다.");
        }
        return number;
    }
}
