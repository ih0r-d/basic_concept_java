package cursor.demo.solid.ocp.bad;

public class OCPLauncher {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        reportService.setFormatOfReport("pdf");

        reportService.createReport();
    }
}
