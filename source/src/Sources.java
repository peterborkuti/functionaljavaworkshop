import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sources {
    public static String getIndexHtml() {
        try {
            URL indexURL = new URL("https://index.hu/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(indexURL.openStream()));
            return in.lines().limit(10).collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static int getPowerOfTwo(int n) {
        return IntStream.iterate(2, i -> 2 * i).limit(n).skip(n-1).findFirst().getAsInt();
    }
}
