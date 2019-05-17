package time_server.aio;

public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        try {
            port = Integer.valueOf(port);
        } catch (NumberFormatException e) {

        }


        new Thread(new aio.AsyncTimeClientHandler("127.0.0.1", port), "AIO-AsyncTimeClientHandler-001").start();
    }


}
