package cursor.demo.solid.dip.good;

public class BackEndDeveloper  implements Developer{

    private void writeJava() {
        System.out.println("Write server side on java ...");
    }

    @Override
    public void writeCode() {
        writeJava();
    }
}