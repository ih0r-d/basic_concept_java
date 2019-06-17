package cursor.demo.solid.srp.good.impl;

import cursor.demo.solid.srp.good.ConnectionManager;

public class ConnectionManagerImpl implements ConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Connection with -> '" + phoneNumber + "' is established . . .");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected successfully. . . ");
    }
}


