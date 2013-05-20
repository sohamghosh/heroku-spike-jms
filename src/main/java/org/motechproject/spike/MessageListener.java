package org.motechproject.spike;

import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    public void handle(User user) {
        System.out.println("Recieved message. " + user);
    }
}
