import com.opencsv.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class csvreaddata {

    // Java code to illustrate
// Reading CSV File with different separator
    public static List<String[]> readDataFromCustomSeparator(String file) {
        List<String[]> content=new ArrayList<>();
        try {
            // Create an object of file reader class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvParser object with
            // custom separator semi-colon
            CSVParser parser = new CSVParserBuilder().withSeparator('|').build();

            // create csvReader object with parameter
            // filereader and parser
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            // Read all data at once
            List<String[]> allData = csvReader.readAll();

            // Print Data.
            content=allData;
        } catch (Exception e) {
            e.printStackTrace();
        }
    return content;
    }

}

