package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.CarRace;

public class CarRaceTest {
    @Test
    @DisplayName("findWinners는_단일_우승자를_반환한다")
    void findWinners는_단일_우승자를_반환한다() {
        final Car car1 = Car.named("car1");
        final Car car2 = Car.named("car2");
        car1.move(9);
        car2.move(3);
        CarRace race = CarRace.of(List.of(car1, car2), 1);
        assertThat(race.findWinners()).containsExactly(car1);
    }

    @Test
    @DisplayName("동점인경우_findWinners는_여러_우승자를_반환한다")
    void 동점인경우_findWinners는_여러_우승자를_반환한다() {
        final Car car1 = Car.named("car1");
        final Car car2 = Car.named("car2");
        car1.move(9);
        car2.move(9);
        CarRace race = CarRace.of(List.of(car1, car2), 1);
        assertThat(race.findWinners()).containsExactlyInAnyOrder(car1, car2);

    }

    @Test
    @DisplayName("numberOfGames가_0이하면_IllegalArgumentException을_반환한다")
    void numberOfGames가_0이하면_IllegalArgumentException을_반환한다() {
        final Car car1 = Car.named("car1");
        assertThatThrownBy(() -> CarRace.of(List.of(car1), 0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
