package thread.nio;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Yue Lin
 * @since 2018-03-26
 */
public class EchoServer {

    private Selector selector;
    private ExecutorService es = Executors.newCachedThreadPool();

    public static Map<Socket, Long> startTime = new HashMap<>();

    private void start() throws Exception {
        selector = SelectorProvider.provider().openSelector();
        ServerSocketChannel socketChannel = ServerSocketChannel.open();
        socketChannel.configureBlocking(false);

        InetSocketAddress isa = new InetSocketAddress(InetAddress.getLocalHost(), 8000);
//        InetSocketAddress isa = new InetSocketAddress(8000);
        socketChannel.socket().bind(isa);

        SelectionKey key = socketChannel.register(selector, SelectionKey.OP_ACCEPT);

        for (;;) {
            selector.select();
            Set readyKeys = selector.selectedKeys();
            Iterator iter = readyKeys.iterator();
            long e = 0;
            while (iter.hasNext()) {
                SelectionKey sk = (SelectionKey) iter.next();
                iter.remove();
            }
        }
    }
}
