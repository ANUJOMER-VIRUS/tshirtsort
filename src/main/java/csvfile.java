import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class csvfile {
    List<String> filenames = new LinkedList<String>();

    public void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                if (fileEntry.getName().contains(".csv"))
                    filenames.add(fileEntry.getName());
            }
        }
    }

     final File folder = new File("CSV");



}
