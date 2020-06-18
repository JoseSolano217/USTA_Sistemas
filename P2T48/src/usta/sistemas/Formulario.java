package usta.sistemas;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
    public Formulario() {
        JLabel label1 = new JLabel("SAMPLE SOFTWARE", SwingConstants.CENTER);
        label1.setBounds(250, 10, 300, 30);
        add(label1);
        JLabel author = new JLabel("by José Solano", SwingConstants.RIGHT);
        author.setBounds(160, 520, 595, 20);
        add(author);
        JButton boton = new JButton("Iniciar");
        boton.setBounds(350, 200, 100, 50);
        add(boton);
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Principal main = new Principal();
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
