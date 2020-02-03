import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TXTParser {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\zheny\\OneDrive\\Рабочий стол\\Test.txt";
        TXTParser parser = new TXTParser(file);
        parser.processLineByLine();
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.callMethodsCalculate();
    }

    public TXTParser(String fileName) {
        filePath = Paths.get(fileName);
    }

    public void processLineByLine() throws IOException {
        try (Scanner sc = new Scanner(filePath, ENCODING)) {
            while (sc.hasNext()) {
                processLine(sc.nextLine());
            }
        }
    }

    private void processLine(String line) {
        try (Scanner sc = new Scanner(line)) {
            sc.useDelimiter(";");

            StringBuilder sb = new StringBuilder();
            while (sc.hasNext()) {
                String name = sc.next();
                String value = sc.next();
                sb.append("Name is: ")
                        .append(quote(name.trim()))
                        .append("Value is: ")
                        .append(quote(value.trim()))
                        .append(" ---- ");
            }
            log(sb.toString());
            sb.setLength(0);
        }
    }

    private final Path filePath;
    private final static Charset ENCODING = StandardCharsets.UTF_8;

    private static void log(Object object) {
        System.out.println(object);
    }

    private String quote(String text) {
        String QUOTE = "'";
        return QUOTE + text + QUOTE;
    }
}
