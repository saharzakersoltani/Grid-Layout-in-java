import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("GridLayout");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        JButton button5 = new JButton("Button5");
        JButton button6 = new JButton("Button6");
        JButton button7 = new JButton("Button7");
        JButton button8 = new JButton("Button8");
        JButton button9 = new JButton("Button9");
        JButton button10 = new JButton("Button10");
        JButton button11 = new JButton("Button11");
        JButton button12 = new JButton("Button12");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);
        button10.setFocusable(false);
        button11.setFocusable(false);
        button12.setFocusable(false);

        button1.setBackground(Color.BLUE);
        button2.setBackground(Color.GREEN);
        button3.setBackground(Color.BLUE);
        button4.setBackground(Color.GREEN);
        button5.setBackground(Color.BLUE);
        button6.setBackground(Color.GREEN);
        button7.setBackground(Color.BLUE);
        button8.setBackground(Color.GREEN);
        button9.setBackground(Color.BLUE);
        button10.setBackground(Color.GREEN);
        button11.setBackground(Color.BLUE);
        button12.setBackground(Color.GREEN);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);

        frame.setLayout(new GridLayout(3,3,5,5));


    }

}