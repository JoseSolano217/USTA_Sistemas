package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Books extends JFrame {
    private JTextField name, code, isbn, descrtiption;
    public Books() {
        JPanel superior = new JPanel();
        JLabel menu = new JLabel("New book", SwingConstants.CENTER);
        superior.add(menu);
        setVisible(true);
        setBounds(0, 0, 800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel central = new JPanel();
        central.setLayout(new GridLayout(6, 2));
        central.add(new JLabel(""));
        central.add(new JLabel(""));
        central.add(new JLabel("Name "));
        central.add(name = new JTextField());
        central.add(new JLabel("Code "));
        central.add(code = new JTextField());
        central.add(new JLabel("ISBN "));
        central.add(isbn = new JTextField());
        central.add(new JLabel("Description"));
        central.add(descrtiption = new JTextField());
        central.add(new JLabel(""));
        central.add(new JLabel(""));
        JPanel inferior = new JPanel();
        JButton create = new JButton("Create");
        inferior.add(create);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                crear(actionEvent);
            }
        });
        add(superior, BorderLayout.NORTH);
        add(central, BorderLayout.CENTER);
        add(inferior, BorderLayout.SOUTH);
    }
    public void crear(java.awt.event.ActionEvent Evt) {
        final JDialog emergente = new JDialog(this, "Save data", true);
        if (name.getText().length() < 3 || code.getText().length() < 6 || isbn.getText().length() < 5 ||
                descrtiption.getText().length() < 20) {
            emergente.add(new JLabel("Minimum character not reached, minimum is 6, 3, 5, 20, respectively."));
        } else {
            Data2 data2 = new Data2();
            boolean bo = data2.Data2(name.getText(), code.getText(), isbn.getText(), descrtiption.getText());
            if (bo == true) {
                emergente.add(new JLabel("Data saved"));
                name.setText("");
                code.setText("");
                isbn.setText("");
                descrtiption.setText("");
            } else {
                emergente.add(new JLabel("Data couldn't be saved"));
            }
        }
        emergente.pack();
        emergente.setVisible(true);
    }
}
