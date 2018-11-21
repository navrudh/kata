package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringAToITest {

    @Test
    void case1() {
        assertThat(StringAToI.myAtoi("42")).isEqualTo(42);
    }

    @Test
    void case2() {
        assertThat(StringAToI.myAtoi("   -42")).isEqualTo(-42);
    }

    @Test
    void case3() {
        assertThat(StringAToI.myAtoi("4193 with words")).isEqualTo(4193);
    }

    @Test
    void case4() {
        assertThat(StringAToI.myAtoi("words and 987")).isEqualTo(0);
    }

    @Test
    void case5() {
        assertThat(StringAToI.myAtoi("-91283472332")).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    void case6() {
        assertThat(StringAToI.myAtoi("91283472332")).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    void case7() {
        assertThat(StringAToI.myAtoi("")).isEqualTo(0);
    }

    @Test
    void case8() {
        assertThat(StringAToI.myAtoi("-")).isEqualTo(0);
    }

    @Test
    void case9() {
        assertThat(StringAToI.myAtoi("  0000000000012345678")).isEqualTo(12345678);
    }

    @Test
    void case10() {
        assertThat(StringAToI.myAtoi("  -0000000000012345678")).isEqualTo(-12345678);
    }
}