package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class About extends JFrame {
    public About() {
        JPanel superior = new JPanel();
        JLabel menu = new JLabel("About");
        superior.add(menu);
        JPanel inferior = new JPanel();
        JLabel creator = new JLabel("by José Gabriel");
        inferior.add(creator);
        JPanel central = new JPanel();
        JLabel creat = new JLabel(new ImageIcon("d:/Creator.jpg"));
        JLabel inst = new JLabel(new ImageIcon("d:/USTA.png"));
        central.add(creat, BorderLayout.EAST);
        central.add(inst, BorderLayout.WEST);
        add(superior, BorderLayout.NORTH);
        add(central, BorderLayout.CENTER);
        add(inferior, BorderLayout.SOUTH);
        setVisible(true);
        setBounds(0, 0, 800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
