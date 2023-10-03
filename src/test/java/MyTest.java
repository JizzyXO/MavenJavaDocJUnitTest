import org.example.MyWriter;
import org.example.AppData;
import org.example.MyReader;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

public class MyTest {

    @Test
    public void testSaveAndReadCsvFile() {
        String testFilePath = "file.csv";
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        MyWriter.saveInCsvFile(header, data);

        AppData appData = MyReader.readCsvFile(testFilePath);
        assertArrayEquals(header, appData.getHeader());
        assertArrayEquals(data, appData.getData());

        File file = new File(testFilePath);

        if (file.exists()) {
            file.delete();
        }
    }
}
