package net.reiden.linebot;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidCheckerTest {

    private ValidChecker validChecker;

    @BeforeEach
    void setup() {
        validChecker = new ValidChecker();

    }
    @Test
    void valid_성공_테스트() {

        assertEquals(true, validChecker.isValid(1, 1));
    }

    @Test
    void valid_실패_테스트() {
        assertEquals(false, validChecker.isValid(1, 2));
    }
}
