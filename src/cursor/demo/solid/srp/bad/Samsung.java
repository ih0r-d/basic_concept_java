package cursor.demo.solid.srp.bad;

public class Samsung implements Phone{
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Connection with -> '" + phoneNumber + "' is established . . .");
    }

    @Override
    public void send(String msg) {
        System.out.println("Message -> '" + msg + "' successfully sent . . .  ");
    }

    @Override
    public void receive() {
        System.out.println("data received successfully");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected successfully. . . ");
    }
}
