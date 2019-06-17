package cursor.demo.solid.ocp.good;

public class ReportService {
    private ReportCreator creator;

    public ReportService(ReportCreator creator) {
        this.creator = creator;
    }
    public void createReport() {
        creator.create();
    }
}
