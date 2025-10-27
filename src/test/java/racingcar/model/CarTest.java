package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    @DisplayName("자동차_이름_5자_초과면_IllegalArgumentException을_반환한다")
    void 자동차_이름_5자_초과면_IllegalArgumentException을_반환한다() {
        assertThatThrownBy(() -> Car.named("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    @DisplayName("move_가_참이면_score는_1만큼_증가한다")
    void move하면_score는_1만큼_증가한다() {
        NumberPicker fixed9 = () -> 9;
        Car car = Car.tested("abcde", fixed9);
        car.move();
        assertThat(car.getScore()).isEqualTo(1);
    }

    @Test
    @DisplayName("move가_거짓이면_score_증가_없음")
    void move하면_score_증가없음() {
        NumberPicker fixed3 = () -> 3;
        Car car = Car.tested("abc", fixed3);
        car.move();
        assertThat(car.getScore()).isZero();
    }
}
