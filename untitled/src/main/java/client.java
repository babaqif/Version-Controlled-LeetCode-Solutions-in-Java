import java.io.IOException;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",3000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
