package access;

public class ConnectionManager {
    private ConnectionManager() {
    }
    private static Connection [] connections = {Connection.get(), Connection.get(), Connection.get()};
    private static int i = 0;

    public static Connection getConnections(){
        if(i<connections.length){
            return connections[i++];
        }
        else {
            return null;
        }
    }
}
 class TestConnections{
     public static void main(String[] args) {
         System.out.println(ConnectionManager.getConnections());
         System.out.println(ConnectionManager.getConnections());
         System.out.println(ConnectionManager.getConnections());
         System.out.println(ConnectionManager.getConnections());
     }
 }