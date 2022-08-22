package com.ipcamp.dsl

import org.junit.jupiter.api.Test

import static org.mockito.Mockito.mock
import static org.mockito.Mockito.verify
import static org.mockito.Mockito.when

class TestUsingMockito {

    @Test
    void test() {
        def list = mock(List.class)

        when(list.isEmpty()).thenReturn(false)

        assert !list.isEmpty()
        verify(list).isEmpty()
    }
}
