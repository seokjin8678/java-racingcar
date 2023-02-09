package racingcar.domain;

import static racingcar.validator.Validator.*;

import java.util.Objects;
import racingcar.dto.RacingCarStatusResponse;

public class Car {
    private final String name;
    private final Position position;

    public Car(String name) {
        validateBlankCarName(name);
        validateCarNameLength(name);
        this.name = name;
        this.position = new Position(0);
    }

    public RacingCarStatusResponse getStatus() {
        return new RacingCarStatusResponse(name, position.getValue());
    }

    public void move() {
        position.forward();
    }

    public Position getMovedLength() {
        return position;
    }

    public boolean isSamePosition(Position position) {
        return Objects.equals(this.position, position);
    }
}
