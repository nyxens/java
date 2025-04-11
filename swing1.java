import javax.swing.*;
public class swing1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Issue Form");
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel nl = new JLabel("Student Name:");
        nl.setBounds(20,20,100,25);
        JTextField nf = new JTextField();
        nf.setBounds(130,20,180,25);
        JLabel il = new JLabel("Student ID:");
        il.setBounds(20,60,100,25);
        JTextField iF = new JTextField();
        iF.setBounds(130,60,180,25);
        JLabel bl = new JLabel("Book Title:");
        bl.setBounds(20,100,100,25);
        JTextField bf = new JTextField();
        bf.setBounds(130,100,180,25);
        JLabel dl = new JLabel("Issue Date:");
        dl.setBounds(20,140,100,25);
        JTextField df = new JTextField(); 
        df.setBounds(130,140,180,25);
        JButton sb = new JButton("Submit");
        sb.setBounds(120,180,100,30);
        sb.addActionListener(e -> {
            String name = nf.getText();
            String id = iF.getText();
            String book = bf.getText();
            String date = df.getText();
            if (name.isEmpty() || id.isEmpty() || book.isEmpty() || date.isEmpty()) {
                JOptionPane.showMessageDialog(frame,"Please fill all fields.");
            } else {
                String message = "Student Name: " + name + "\n"
                               + "Student ID: " + id + "\n"
                               + "Book Title: " + book + "\n"
                               + "Issue Date: " + date;
                JOptionPane.showMessageDialog(frame,message,"Details Submitted",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(nl);
        frame.add(nf);
        frame.add(il);
        frame.add(iF);
        frame.add(bl);
        frame.add(bf);
        frame.add(dl);
        frame.add(df);
        frame.add(sb);
        frame.setVisible(true);
    }
}
