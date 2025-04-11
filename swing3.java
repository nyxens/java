import javax.swing.*;
public class swing3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20,20,80,25);
        JTextField nameField = new JTextField();
        nameField.setBounds(100,20,200,25);
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20,60,80,25);
        JTextField emailField = new JTextField();
        emailField.setBounds(100,60,200,25);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20,100,80,25);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100,100,200,25);
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(120,150,100,30);
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(frame,"Name cannot be empty.");
            } else if (!email.contains("@") || !email.endsWith(".com")) {
                JOptionPane.showMessageDialog(frame,"Enter a valid email (must contain '@' and end with '.com').");
            } else if (password.length() < 6) {
                JOptionPane.showMessageDialog(frame,"Password must be at least 6 characters long.");
            } else {
                JOptionPane.showMessageDialog(frame,"Registration Successful!");
            }
        });
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(submitButton);
        frame.setVisible(true);
    }
}
