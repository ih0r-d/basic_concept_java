package cursor.demo.solid.ocp.bad;

public class ReportService {
    private String formatOfReport;

    public void setFormatOfReport(String formatOfReport) {
        this.formatOfReport = formatOfReport;
    }

    public void createReport() {
        if (formatOfReport.equalsIgnoreCase("pdf")) {
            System.out.println("PDF report was created ... ");
        } else if (formatOfReport.equalsIgnoreCase("csv")) {
            System.out.println("CSV was created ... ");
        } else {
            System.out.println("Please, specify which report you need! ");
        }
    }


}
