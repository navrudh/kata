package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseVowelsTest {

    @Test
    void case1() {
        assertThat(ReverseVowels.reverseVowels("hello")).isEqualTo("holle");
    }

    @Test
    void case2() {
        assertThat(ReverseVowels.reverseVowels("leetcode")).isEqualTo("leotcede");
    }

    @Test
    void case3() {
        assertThat(ReverseVowels.reverseVowels(".,")).isEqualTo(".,");
    }
}