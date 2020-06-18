package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student extends JFrame {
    private JTextField name, lastname, faculty;
    public Student() {
        JPanel superior = new JPanel();
        JLabel menu = new JLabel("New student", SwingConstants.CENTER);
        superior.add(menu);
        setVisible(true);
        setBounds(0, 0, 800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel central = new JPanel();
        central.setLayout(new GridLayout(5, 2));
        central.add(new JLabel(""));
        central.add(new JLabel(""));
        central.add(new JLabel("Name "));
        central.add(name = new JTextField());
        central.add(new JLabel("Last Name "));
        central.add(lastname = new JTextField());
        central.add(new JLabel("Faculty "));
        central.add(faculty = new JTextField());
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
        if (name.getText().length() < 3 || lastname.getText().length() < 3 || faculty.getText().length() < 3) {
            emergente.add(new JLabel("Tododos los campos deben tener un minimo de 3 caracteres"));
        } else {
            Data data1 = new Data();
            boolean bo = data1.Data(name.getText(), lastname.getText(), faculty.getText());
            if (bo == true) {
                emergente.add(new JLabel("Datos guardados"));
                name.setText("");
                lastname.setText("");
                faculty.setText("");
            } else {
                emergente.add(new JLabel("Datos no guardados"));
            }
        }
        emergente.pack();
        emergente.setVisible(true);
    }
}
