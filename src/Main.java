import connection.ConnectionFactory;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection conn = ConnectionFactory.getConnection();

        if (conn != null) {
            System.out.println("Conectado ao banco com sucesso!");
        }

    }
}