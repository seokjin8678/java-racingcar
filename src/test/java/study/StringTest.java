package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    @DisplayName("\"(1,2)\"문자열에서 '()'를 제거하고 \"1,2\"가 반환되어야 한다.")
    void substringString() {
        // given
        String input = "(1,2)";

        // when
        String result = input.substring(1, input.length() - 1);

        // then
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("\"abc\" 문자열에서 특정 위치의 문자를 가져와야 한다.")
    void indexOfString() {
        // given
        String input = "abc";

        // when
        char result = input.charAt(2);

        // then
        assertThat(result).isEqualTo('c');
    }

    @Test
    @DisplayName("\"abc\" 문자열에서 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생해야 한다.")
    void indexOfStringThrowException() {
        // given
        String input = "abc";

        // expect
        assertThatThrownBy(() -> input.charAt(4))
                .isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
