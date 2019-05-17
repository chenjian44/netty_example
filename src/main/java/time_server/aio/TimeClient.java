package aio;

/**
 * @author: 陈健
 * @date: 2019/1/30 20:56
 * @description:
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        try {
            port = Integer.valueOf(port);
        } catch (NumberFormatException e) {

        }


        new Thread(new AsyncTimeClientHandler("127.0.0.1", port), "AIO-AsyncTimeClientHandler-001").start();
    }


}
