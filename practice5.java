import javax.swing.*;
import java.awt.*;
public class practice5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shopping");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel nl = new JLabel("Name:");
        nl.setBounds(100,20,100,25);
        JTextField nf = new JTextField();
        nf.setBounds(200,20,180,25);
        JLabel n2 = new JLabel("Quantity:");
        n2.setBounds(100,100,100,25);
        JTextField qf = new JTextField();
        qf.setBounds(200,100,180,25);
        JLabel n3 = new JLabel("Product:");
        n3.setBounds(100,60,100,25);
        String[] products = {"Rice-$40/kg","Wheat-$35/kg","Sugar-$45/kg"};
        JComboBox<String> cb = new JComboBox<>(products);
        cb.setBounds(200,60,180,25);
        JButton sb = new JButton("Order now");
        sb.setBounds(150,200,100,30);
        sb.addActionListener(e -> {
            String name = nf.getText();
            String quantity = qf.getText();
            String product = (String) cb.getSelectedItem();
            if(name.isEmpty()||Integer.parseInt(quantity)<0){
                JOptionPane.showMessageDialog(frame,"Please fill all fields.");
            }else{
                int bill = 0;
                if(product.equals("Rice-$40/kg")){
                    bill = 40*Integer.parseInt(quantity);
                }else if(product.equals("Wheat-$35/kg")){
                    bill = 35*Integer.parseInt(quantity);
                }else if(product.equals("Sugar-$45/kg")){
                    bill = 45*Integer.parseInt(quantity);
                }
                String messgae = "Order placed!" + name + " ordered " + quantity + " kg of " + product + "\nTotal bill: $" + bill;
                JOptionPane.showMessageDialog(frame,messgae,"Order Details",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        frame.add(nl);
        frame.add(nf);
        frame.add(n2);
        frame.add(qf);
        frame.add(n3);
        frame.add(cb);
        frame.add(sb);
        frame.setVisible(true);
    }
}
