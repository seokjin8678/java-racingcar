package study;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("size() 메소드가 Set의 크기를 반환해야 한다")
    void sizeSet() {
        // given
        int size = numbers.size();

        // expect
        assertThat(size).isEqualTo(3);
    }

    @ParameterizedTest()
    @DisplayName("set에 1,2,3 값이 있는지 확인해야 한다")
    @ValueSource(ints = {1, 2, 3})
    void containsSet(int input) {
        // expect
        assertThat(numbers.contains(input)).isTrue();
    }
}
