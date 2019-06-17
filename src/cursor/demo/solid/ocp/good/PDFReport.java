package cursor.demo.solid.ocp.good;

public class PDFReport implements ReportCreator {
    @Override
    public void create() {
        System.out.println("PDF report was created ...");
    }
}
