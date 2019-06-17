package cursor.demo.solid.srp.bad;

public class SRPLauncher {
    public static void main(String[] args) {
        Phone phone = new Samsung();
        phone.dial("380991234567");
        phone.send("Hello, dear students");
        phone.receive();
        phone.disconnect();
    }
}
