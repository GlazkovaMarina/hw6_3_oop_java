package solid.dip;
import java.io.*;
import java.util.List;

public class PrintFile {
    public void output(List<ReportItem> items, String fileName) {
        if (!items.isEmpty()){
            try (FileWriter writer = new FileWriter(fileName, true)) {
                for (ReportItem item : items) {
                    writer.write(toString().format("screen %s - %f \n", item.getDescription(), item.getAmount()));
                }
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
        }
        }
        else{
            System.out.println("No data");
        }
    }
}
