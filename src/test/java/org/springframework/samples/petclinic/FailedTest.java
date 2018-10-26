package org.springframework.samples.petclinic;

import static org.assertj.core.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

public class FailedTest {
    @Test
    public void alwaysFail() {
        assertTrue(false);
    }
}
