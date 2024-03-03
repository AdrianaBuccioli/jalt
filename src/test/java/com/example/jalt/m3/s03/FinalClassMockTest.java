/*
 * Introduction to Java Logging and Testing
 * 
 * https://github.com/egalli64/jalt
 */
package com.example.jalt.m3.s03;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

/**
 * Create a Mockito mock for a final class
 * 
 * Since Java 21 the current Mockito approach leads to a warning:
 * 
 * <pre>
 * A Java agent has been loaded dynamically
 * </pre>
 */
class FinalClassMockTest {
    private FinalClass mock = mock();

    /**
     * The mock is of the "right" type
     * 
     * Its methods are created by Mockito to return the usual Java default values
     * <li>0, 0.0, false for primitive
     * <li>null for reference
     */
    @Test
    void constructor() {
        assertThat(mock).isInstanceOf(FinalClass.class);
        assertThat(mock.f()).isZero();
    }
}
