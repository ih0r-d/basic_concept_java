package cursor.demo.solid.ocp.good;

public class CSVReport implements ReportCreator {
    @Override
    public void create() {
        System.out.println("CSV report was created ... ");
    }
}
