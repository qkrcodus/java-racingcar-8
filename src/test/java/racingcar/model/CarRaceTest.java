package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarRaceTest {
    @Test
    @DisplayName("findWinners는_단일_우승자를_반환한다")
    void findWinners는_단일_우승자를_반환한다() {
        NumberPicker fixed3 = () -> 3;
        NumberPicker fixed9 = () -> 9;
        Car car1 = Car.tested("car1", fixed9);
        Car car2 = Car.tested("car2", fixed3);
        car1.move();
        car2.move();
        CarRace race = CarRace.of(List.of(car1, car2), 1);
        assertThat(race.findWinners()).containsExactly(car1);
    }

    @Test
    @DisplayName("동점인경우_findWinners는_여러_우승자를_반환한다")
    void 동점인경우_findWinners는_여러_우승자를_반환한다() {
        NumberPicker fixed9 = () -> 9;
        Car car1 = Car.tested("car1", fixed9);
        Car car2 = Car.tested("car2", fixed9);
        car1.move();
        car2.move();
        CarRace race = CarRace.of(List.of(car1, car2), 1);
        assertThat(race.findWinners()).containsExactlyInAnyOrder(car1, car2);

    }

    @Test
    @DisplayName("numberOfGames가_0이하면_IllegalArgumentException을_반환한다")
    void numberOfGames가_0이하면_IllegalArgumentException을_반환한다() {
        Car car1 = Car.named("car1");
        assertThatThrownBy(() -> CarRace.of(List.of(car1), 0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
