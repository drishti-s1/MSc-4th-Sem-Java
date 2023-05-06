// frame and button by creating a object(association)
import javax.swing.*;
public class Example1{
    public static void main(String[] args){
        JFrame f=new JFrame("");

        JButton b= new JButton("click");
        b.setBounds(100,100,180,40);

        f.add(b);
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}