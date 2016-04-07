package connection;

import java.util.Stack;

/**
 * Created by psok on 2/19/2016.
 */
public class ConnectionManager {
    private final static int connectionAmount = 10;
    private static Stack<Connection> connections;

    static {
        connections = new Stack<Connection>();
        for (int i = 0; i < connectionAmount; i++) {
            connections.push(new Connection(i));
        }
    }

    public static Connection getConnection() {
        return connections.empty() ? null : connections.pop();
    }
}
