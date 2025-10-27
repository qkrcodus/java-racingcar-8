package racingcar.model;

public class RandomNumberPicker implements NumberPicker {
    private static final int START_OF_RANDOM_NUMBER_RANGE = 0;
    private static final int END_OF_RANDOM_NUMBER_RANGE = 9;

    @Override
    public int pick() {
        return camp.nextstep.edu.missionutils.Randoms.pickNumberInRange(START_OF_RANDOM_NUMBER_RANGE,
                END_OF_RANDOM_NUMBER_RANGE);
    }
}
