package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.model.Car;

public class CarTest {
    @Test
    @DisplayName("자동차_이름_5자_초과면_IllegalArgumentException을_반환한다")
    void 자동차_이름_5자_초과면_IllegalArgumentException을_반환한다() {
        assertThatThrownBy(() -> Car.named("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("4_이상일_경우_전진한다")
    @CsvSource({"0,false", "1,false", "4,true", "5,true", "9,true"})
    void randomNumber가_4_이상일_경우_전진한다(int randomNumber, boolean trueOrFalse) {
        Car.named("abcde");
        assertThat(Car.canMove(randomNumber).isEqualTo(trueOrFalse));
    }


}
