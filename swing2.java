import javax.swing.*;
public class swing2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Feedback Form");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel nl = new JLabel("Student Name:");
        nl.setBounds(20,20,100,25);
        JTextField nf = new JTextField();
        nf.setBounds(130,20,220,25);
        JLabel cl = new JLabel("Course Name:");
        cl.setBounds(20,60,100,25);
        JTextField cf = new JTextField();
        cf.setBounds(130,60,220,25);
        JLabel el = new JLabel("Overall Experience:");
        el.setBounds(20,100,150,25);
        JRadioButton excellent = new JRadioButton("Excellent");
        JRadioButton good = new JRadioButton("Good");
        JRadioButton average = new JRadioButton("Average");
        JRadioButton poor = new JRadioButton("Poor");
        ButtonGroup group = new ButtonGroup();
        group.add(excellent);
        group.add(good);
        group.add(average);
        group.add(poor);
        excellent.setBounds(30,130,100,25);
        good.setBounds(130,130,80,25);
        average.setBounds(220,130,90,25);
        poor.setBounds(310,130,70,25);
        JLabel CL = new JLabel("Comments:");
        CL.setBounds(20,170,100,25);
        JTextArea CA = new JTextArea();
        CA.setBounds(130,170,220,80);
        CA.setLineWrap(true);
        CA.setWrapStyleWord(true);
        JButton sb = new JButton("Submit");
        sb.setBounds(80,270,100,30);
        JButton CB = new JButton("Clear");
        CB.setBounds(220,270,100,30);
        sb.addActionListener(e -> {
            String name = nf.getText();
            String course = cf.getText();
            String comments = CA.getText();
            String experience = "";
            if (excellent.isSelected()) experience = "Excellent";
            else if (good.isSelected()) experience = "Good";
            else if (average.isSelected()) experience = "Average";
            else if (poor.isSelected()) experience = "Poor";
            if (name.isEmpty() || course.isEmpty() || experience.isEmpty()) {
                JOptionPane.showMessageDialog(frame,"Please fill in all required fields.");
            } else {
                String summary = "Student Name: " + name + "\n"
                               + "Course Name: " + course + "\n"
                               + "Experience: " + experience + "\n"
                               + "Comments: " + comments;
                JOptionPane.showMessageDialog(frame,summary,"Feedback Summary",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        CB.addActionListener(e -> {
            nf.setText("");
            cf.setText("");
            group.clearSelection();
            CA.setText("");
        });
        frame.add(nl);
        frame.add(nf);
        frame.add(cl);
        frame.add(cf);
        frame.add(el);
        frame.add(excellent);
        frame.add(good);
        frame.add(average);
        frame.add(poor);
        frame.add(CL);
        frame.add(CA);
        frame.add(sb);
        frame.add(CB);
        frame.setVisible(true);
    }
}
