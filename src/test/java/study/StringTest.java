package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    @DisplayName("\"1,2\"를 ','로 split 했을 때 1과 2로 분리되어야 한다.")
    void splitNumbersString() {
        // given
        String input = "1,2";

        // when
        String[] result = input.split(",");

        // then
        assertThat(result).contains("1", "2");
    }

    @Test
    @DisplayName("\"1\"을 ','로 split 했을 때 1만을 포함하는 배열이 반환되어야 한다.")
    void splitNumberString() {
        // given
        String input = "1";

        // when
        String[] result = input.split(",");

        // then
        assertThat(result).containsExactly("1");
    }
}
