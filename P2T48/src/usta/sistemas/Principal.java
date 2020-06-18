package usta.sistemas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    public Principal() {
        setTitle("SACO 1.0");
        setLayout(new BorderLayout());
        JLabel menu = new JLabel("Main menu", SwingConstants.CENTER);
        JPanel superior = new JPanel();
        JPanel centro = new JPanel();
        superior.add(menu);
        JPanel izquierdo = new JPanel();
        izquierdo.setLayout(new GridLayout(5, 1));
        JButton form1 = new JButton("Data");
        form1.setBounds(0, 0, 100, 90);
        form1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                show(actionEvent);
            }
        });
        izquierdo.add(form1);
        JButton form2 = new JButton("Student");
        form2.setBounds(0, 0, 100, 90);
        form2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Student Student1 = new Student();
            }
        });
        izquierdo.add(form2);
        JButton about = new JButton("About");
        about.setBounds(0, 0, 100, 30);
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                About Abut1 = new About();
            }
        });
        izquierdo.add(about);
        JButton books = new JButton("Books");
        books.setBounds(0, 0, 100, 30);
        books.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Books books1 = new Books();
            }
        });
        izquierdo.add(books);
        JButton b_data = new JButton("Data of Books");
        b_data.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                showb(actionEvent);
            }
        });
        izquierdo.add(b_data);
        JPanel inferior = new JPanel();
        inferior.add(new JLabel("by José Solano"));
        add(superior, BorderLayout.NORTH);
        add(izquierdo, BorderLayout.WEST);
        add(inferior, BorderLayout.SOUTH);
        setVisible(true);
        setBounds(0, 0, 800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void show(java.awt.event.ActionEvent evt) {

        Show show = new Show(this);
    }
    private void showb(java.awt.event.ActionEvent eve) {

        ShowB showb = new ShowB(this);
    }
}
