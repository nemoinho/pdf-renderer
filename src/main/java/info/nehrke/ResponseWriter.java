package info.nehrke;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ResponseWriter {
    private OutputStreamWriter writer;
    ResponseWriter(OutputStream outputStream) {
        writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
    }

    void write(URL url) {
        try {
            writer.write("\"" + url.toString() + "\"");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
