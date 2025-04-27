import java.awt,*;
import javax.swing.*;
public class practice6 {
    public static void main(String[] args) {
        JFrame frame = new Jframe("New");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        Jlabel label = new JLabel();
        JTextField textfield = new JTextField();//.getText() to get the text from the textfield
        JPasswordField pass = new JPasswordField();//new String().getPassword()) to get the password from the password field
        JButton button = new JButton();//.addActionListener() to add an action listener to the button
        JRadioButton radio = new JRadioButton();//.isSelected() to check if the radio button is selected
        JCheckBox check = new JCheckBox();//.isSelected() to check if the checkbox is selected
        JComboBox<String> combo = new JComboBox<>();//.getSelectedItem() to get the selected item from the combo box
        JTextArea textArea = new JTextArea();//.getText() to get the text from the text area
        JList<String> list = new JList<>();//.getSelectedValue() to get the selected value from the list
        ButtonGroup group = new ButtonGroup();// to group the radio buttons together
        group.add(radio);
        JOptionPane.showMessageDialog(frame,"hi","hi",JOptionPane.INFORMATION_MESSAGE);
        JSpinner spinner = new JSpinner();//.getValue() to get the value from the spinner
    }
}
