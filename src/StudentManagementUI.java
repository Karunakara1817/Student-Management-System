import javax.swing.*;
import java.awt.*;

public class StudentManagementUI extends JFrame {

    JTextField nameField;
    JButton addButton;

    public StudentManagementUI() {

        setTitle("Student Management System");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");

        nameField = new JTextField(20);

        addButton = new JButton("Add Student");

        add(nameLabel);
        add(nameField);
        add(addButton);

        addButton.addActionListener(e -> {

            String name = nameField.getText();

            StudentDAO dao = new StudentDAO();

            dao.addStudent(name);

            JOptionPane.showMessageDialog(
                    null,
                    "Student Saved Successfully"
            );
        });

        setVisible(true);
    }
}