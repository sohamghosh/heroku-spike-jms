package org.motechproject.spike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Autowired
    private OutboundGateway outboundGateway;

    public String enqueue() {
        outboundGateway.sendEventMessage(new User("Soham", "Bangalore"));
        return "(JMS) Enqueued.";
    }
}
