import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void addStudent(String name) {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "INSERT INTO students(name) VALUES(?)";

            PreparedStatement pst =
                    con.prepareStatement(query);

            pst.setString(1, name);

            pst.executeUpdate();

            System.out.println("Student Saved");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}