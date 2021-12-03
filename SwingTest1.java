package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test {
    JFrame j;
    Container c;
    JButton b1, b2;
    JTextField t1, t2, t3;

    Test(){
        j = new JFrame();
        c = j.getContentPane();
        b1 = new JButton("Add");
        b1 = new JButton("Sub");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        c.add(b1);
        c.add(b2);
        c.add(t1);
        c.add(t2);
        c.add(t3);
        j.setSize(800, 400);
        j.setVisible(true);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {

    // }
}
public  class SwingTest1 {
    public static  void main(String[] args){
        Test ob = new Test();
    }
}