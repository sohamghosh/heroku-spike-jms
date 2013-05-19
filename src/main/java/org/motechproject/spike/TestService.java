package org.motechproject.spike;

import org.springframework.stereotype.Component;

@Component
public class TestService {

    public String create() {
        return "(JMS) Created.";
    }

    public String count() {
        return "(JMS) Count: -1";
    }
}
