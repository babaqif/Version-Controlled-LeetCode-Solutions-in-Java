import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(3000);
            Socket socket = serversocket.accept();
            System.out.println("Received a connection");
            socket.close();
        } catch (IOException e) {
            System.out.println("Failed to create socket");
            e.printStackTrace();
        }
    }
}
