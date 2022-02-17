package racingcar.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.controller.GameController;
import racingcar.model.Car;
import racingcar.model.Name;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidationTest {
    private final GameController gameController = new GameController();

    @Test
    @DisplayName("자동차명 입력시 공백이 들어간 경우")
    void inputSpaceBetweenCarNames() {
        final List<Name> actual = Stream.of("bom", "sun")
                .map(Name::new)
                .collect(Collectors.toList());
        final List<String> expected = Arrays.asList("bom", "sun");;

        assertThat(gameController.initCars(actual).getCars().stream()
                .map(Car::getName)
                .map(Name::getName)
                .collect(Collectors.toList()))
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("자동차 이름이 하나도 존재하지 않을 경우 예외처리")
    void blankInputException() {
        assertThatThrownBy(() -> InputValidator.validateBlank(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("최소 1개 이");
    }
}