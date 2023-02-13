package racingcar.domain;

import java.util.Objects;

public class Car {
    private static final int DEFAULT_POSITION = 0;

    private final Name name;
    private final Position position;

    public Car(String name) {
        this(name, DEFAULT_POSITION);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move() {
        position.forward();
    }

    public boolean isSamePosition(Position position) {
        return Objects.equals(this.position, position);
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
