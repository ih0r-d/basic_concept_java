package cursor.demo.solid.srp.good;

import cursor.demo.solid.srp.good.impl.ConnectionManagerImpl;
import cursor.demo.solid.srp.good.impl.DataManagerImpl;

public class SRPLauncher {
    public static void main(String[] args) {
        ConnectionManager connection = new ConnectionManagerImpl();
        DataManager dataManager = new DataManagerImpl();

        Phone phone = new Phone(connection, dataManager);
        phone.dial("380991234567");
        phone.send("Hello, dear students");
        phone.receive();
        phone.disconnect();
    }
}
