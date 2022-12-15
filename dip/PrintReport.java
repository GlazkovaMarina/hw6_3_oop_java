package solid.dip;

import java.util.List;

public class PrintReport {
    public void output(List<ReportItem> items) {
        if (!items.isEmpty()){
            System.out.println("Output to printer");
            for (ReportItem item : items) {
                System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
            }
        }
        else{
            System.out.println("No data to printer");
        }
    }
}