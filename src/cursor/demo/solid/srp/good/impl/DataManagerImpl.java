package cursor.demo.solid.srp.good.impl;

import cursor.demo.solid.srp.good.DataManager;

public class DataManagerImpl implements DataManager {
    @Override
    public void send(String msg) {
        System.out.println("Message -> '" + msg + "' successfully sent . . .  ");
    }

    @Override
    public void receive() {
        System.out.println("data received successfully");
    }
}
