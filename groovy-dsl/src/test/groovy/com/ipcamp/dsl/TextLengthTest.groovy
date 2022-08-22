package com.ipcamp.dsl

import org.junit.jupiter.api.Test

class TextLengthTest {

    @Test
    void configureWithBuilder() {
        def result = new TextLength()
                .text("Some text")
                .length()

        assert 9 == result
    }

    @Test
    void configureWithDelegate() {
        def result = TextLength.length {
            text "Some text"
        }

        assert 9 == result
    }
}
