import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(3000);
        } catch (IOException e) {
            System.out.println("Failed to create socket");
            e.printStackTrace();
        }
    }
}
