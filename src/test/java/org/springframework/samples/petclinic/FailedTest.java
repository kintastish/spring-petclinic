package org.springframework.samples.petclinic;

import org.junit.Ignore;
import org.junit.Test;

public class FailedTest {
    @Test
//    @Ignore
    public void alwaysFail() {
        throw new RuntimeException("Fail");
    }
}
