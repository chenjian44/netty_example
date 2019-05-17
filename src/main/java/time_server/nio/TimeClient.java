package time_server.nio;

public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        try{
            port = Integer.valueOf(port);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        new Thread(new TimeClientHandle("127.0.0.1", port), "Time-Client-001").start();
    }

}
