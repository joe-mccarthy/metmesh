package com.github.joemccarthy.metmesh.services.server.delegate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ServerDelegateTest {

    private ServerDelegate serverDelegate = new ServerDelegate();

    @Test
    void testGetMethodName() {
        assertEquals("getMethodName", serverDelegate.getMethodName());
    }
}
