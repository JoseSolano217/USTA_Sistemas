package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class Show extends JDialog {
    public Show (java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        JPanel superior = new JPanel();
        JLabel menu = new JLabel("List of students", SwingConstants.CENTER);
        menu.setFont(new Font("Arial", 0, 20));
        superior.add(menu);
        String[] names = {"Name", "Last name", "Faculty"};
        Data data1 = new Data();
        JTable tabla = new JTable(data1.all_data(), names);
        tabla.setBounds(10, 50, 550, 300);
        JScrollPane central = new JScrollPane(tabla);
        add(superior, BorderLayout.NORTH);
        add(central, BorderLayout.CENTER);
        setSize(600, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
    }
}
