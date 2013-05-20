package org.motechproject.spike;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String address;

    public User() {
    }

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("User");
        sb.append("{name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
