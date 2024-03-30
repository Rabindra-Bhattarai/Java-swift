import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {

    public main() {
        setTitle("Login Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); // Increased size
        setLocationRelativeTo(null); // Center the window

        JPanel mainPanel = new JPanel(new BorderLayout());
        JLabel headerLabel = new JLabel("Login to Your Account", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(headerLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 20, 20));
        mainPanel.add(formPanel, BorderLayout.CENTER);

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton forgotPasswordButton = new JButton("Forgot Password?");
        JButton registerButton = new JButton("Register");

        formPanel.add(usernameLabel);
        formPanel.add(usernameField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);
        formPanel.add(new JLabel()); // Empty label for spacing
        formPanel.add(loginButton);
        formPanel.add(forgotPasswordButton);
        formPanel.add(registerButton);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            // Add login logic here
        });

        forgotPasswordButton.addActionListener(e -> {
            // Add forgot password logic here
            JOptionPane.showMessageDialog(this, "Forgot Password clicked.");
        });

        registerButton.addActionListener(e -> {
            // Add register logic here
            JOptionPane.showMessageDialog(this, "Register clicked.");
        });

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(main::new);
    }
}
