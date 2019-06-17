package cursor.demo.solid.ocp.good;

public class OCPLauncher {
    public static void main(String[] args) {
        ReportCreator pdf = new PDFReport();
        ReportService pdfReportService = new ReportService(pdf);
        pdfReportService.createReport();
    }
}
