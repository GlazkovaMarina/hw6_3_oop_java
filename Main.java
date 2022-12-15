package solid;

import solid.dip.PrintReport;
import solid.dip.PrintFile;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        PrintReport printReport = new PrintReport();
        printReport.output(report.getItems());
        PrintFile printFile = new PrintFile();
        printFile.output(report.getItems(),"test.txt");
    }
}
