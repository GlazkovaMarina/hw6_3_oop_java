package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// Отчетные данные

    public Report(List<ReportItem> items) {
        this.items = items;
    }
    public Report() {
        this(new ArrayList<ReportItem>());
    }

    public List<ReportItem> getItems() {
        return items;
    }

    // расчет отчетных данных
    public void calculate(){
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    // public void output(){
    //     PrintReport reportPrint = new PrintReport();
    //     reportPrint.output(items);
    // }
    // public void output(){
    //     PrintReport reportPrint = new PrintReport();
    //     reportPrint.output(items);
    // }
}