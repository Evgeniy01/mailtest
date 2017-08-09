import java.io.*;

public class LineCounter {

    private String fileName;

    public LineCounter(String fileName) {
        this.fileName = fileName;
    }

    public int getFileLinesCount() throws IOException {

        int linesCount = 0;

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName));
        BufferedReader reader = new BufferedReader(inputStreamReader);

        while(reader.readLine() != null) {
            linesCount++;
        }

        return linesCount;
    }
}
