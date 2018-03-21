package Pra6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class TaskExecutionWebServer {

    private static final int THREAD_NUM = 10;
    private static final ExecutorService exec = Executors.newFixedThreadPool(THREAD_NUM);
    private static final Executor executor = Executors.newFixedThreadPool(THREAD_NUM);

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (!exec.isShutdown()) {
            try {
                final Socket conn = socket.accept();
                exec.execute(new Runnable() {
                    public void run() {
                        handleReuqest(conn);
                    }
                });
            } catch (RejectedExecutionException ex) {
                if (!exec.isShutdown()) {
                    exec.isTerminated();
                    System.out.println("task submission rejected");
                }
            }
        }

    }


    private static void handleReuqest(Socket conn) {
        System.out.println("hello world" + conn.toString());
    }
}
