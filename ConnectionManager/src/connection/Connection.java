package connection;

/**
 * Created by psok on 2/19/2016.
 */
public class Connection {
    private int marker;

    public Connection(int marker) {
        this.marker = marker;
    }

    public void open() {
        System.out.println("Connection is opened: " + marker);
    }
}
