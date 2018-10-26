package org.springframework.samples.petclinic;

import org.junit.Test;
import org.junit.runner.RunWith;

public class FailedTest {
    @Test
    public void alwaysFail() {
        throw new RuntimeException("Fail");
    }
}
