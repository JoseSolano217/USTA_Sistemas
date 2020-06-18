package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class ShowB extends JDialog {
    public ShowB (java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        JPanel superior = new JPanel();
        JLabel menu = new JLabel("List of books", SwingConstants.CENTER);
        menu.setFont(new Font("Arial", 0, 20));
        superior.add(menu);
        String[] books = {"Name", "Code", "ISBN", "Description"};
        Data2 data2 = new Data2();
        JTable tabla = new JTable(data2.b_data(), books);
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
