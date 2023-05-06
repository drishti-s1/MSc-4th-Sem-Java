import javax.swing.*;
public class Form1{
    public static void main(String[] args){
        JFrame f= new JFrame("Data entry form");
        JLabel l1= new JLabel("Enter your name");
        JTextField tf= new JTextField();
        l1.setBounds(230,130,180,40);
        tf.setBounds(350,130,180,40);

        JLabel l2= new JLabel("Enter your age");
        JTextField tff= new JTextField();
        l2.setBounds(230,230,180,40);
        tff.setBounds(350,230,80,40);


        JLabel l3= new JLabel("Enter your address");
        JTextField tfff= new JTextField();
        l3.setBounds(230,330,500,40);
        tfff.setBounds(350,330,250,40);

        
        JButton b= new JButton("OK");
        b.setBounds(300,450,80,50);
        JButton c=new JButton("Cancel");
        c.setBounds(450,450,100,50);

        f.add(tf);
        f.add(l1);
        f.add(tff);
        f.add(l2);
        f.add(tfff);
        f.add(l3);
        f.add(b);
        f.add(c);

        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);

    }
}