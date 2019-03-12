/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAttemptsTerminationStrategyTest {
    private final MaxAttemptsTerminationStrategy STRATEGY = new MaxAttemptsTerminationStrategy(10);

    @Test
    public void shouldTerminate_greater() {
        WaitContext context = new WaitContext(0L);
        for (int i = 0; i < 11; i++) {
            context.incrementAttempts();
        }
        assertTrue(STRATEGY.shouldTerminate(context));
    }

    @Test
    public void shouldTerminate_equal() {
        WaitContext context = new WaitContext(0L);
        for (int i = 0; i < 10; i++) {
            context.incrementAttempts();
        }
        assertTrue(STRATEGY.shouldTerminate(context));
    }

    @Test
    public void shouldNotTerminate() {
        WaitContext context = new WaitContext(0L);
        for (int i = 0; i < 9; i++) {
            assertFalse(STRATEGY.shouldTerminate(context));
            context.incrementAttempts();
        }
    }
}
