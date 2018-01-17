import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputReader {

    public List<String> getLinesList() throws IOException {
        final List<String> list = new ArrayList<>();
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final File f = new File("./src/File.txt");
        final BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null)
            list.add(line);
        return list;
    }


}
