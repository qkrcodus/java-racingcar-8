package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;

public class CarTest {
    @Test
    @DisplayName("자동차_이름_5자_초과면_IllegalArgumentException을_반환한다")
    void 자동차_이름_5자_초과면_IllegalArgumentException을_반환한다() {
        assertThatThrownBy(() -> new Car("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);

    }

}
