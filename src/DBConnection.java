import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url =
            "jdbc:mysql://localhost:3306/student_db";

    static String user = "root";

    static String password = "Karna@9153";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(
                    url,
                    user,
                    password
            );

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }
}