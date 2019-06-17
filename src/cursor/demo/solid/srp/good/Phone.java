package cursor.demo.solid.srp.good;

public class Phone implements DataManager,ConnectionManager{

    private final ConnectionManager connection;
    private final DataManager dataManager;

    public Phone(ConnectionManager connection, DataManager dataManager) {
        this.connection = connection;
        this.dataManager = dataManager;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String msg) {
        dataManager.send(msg);
    }

    @Override
    public void receive() {
        dataManager.receive();
    }
}
