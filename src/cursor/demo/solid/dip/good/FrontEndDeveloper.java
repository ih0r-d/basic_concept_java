package cursor.demo.solid.dip.good;

public class FrontEndDeveloper  implements Developer {

    private void writeJS() {
        System.out.println("Write client side on js ...");
    }

    @Override
    public void writeCode() {
        writeJS();
    }
}