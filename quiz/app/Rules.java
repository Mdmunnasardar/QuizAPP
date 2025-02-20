package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton start, back;
    String name;

    Rules(String name) {

        this.name = name;

        JLabel heading = new JLabel("Welcome " + name + " to QUIZ TEST");
        heading.setBounds(150, 100, 700, 30);
        heading.setFont(new Font("Algerian", Font.BOLD, 28));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(70, 150, 700, 350);
        rules.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        rules.setForeground(new Color(22, 99, 54));
        rules.setText(
                "<html>" +
                        "1. Open to all Java enthusiasts." + "<br><br>" +
                        "2. 10 multiple-choice questions." + "<br><br>" +
                        "3. 20 seconds per question." + "<br><br>" +
                        "4. No external resources or code execution." + "<br><br>" +
                        "5. No collaboration or assistance." + "<br><br>" +
                        "6. Highest scores may be featured!" + "<br><br>" +
                        "7. Have fun and test your Java skills!" + "<br><br>" +
                        "<html>"

        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(300, 500, 100, 30);
        back.setBackground(new Color(22, 99, 54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(450, 500, 100, 30);
        start.setBackground(new Color(22, 99, 54));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Bg/back.png"));
        Image i = i1.getImage().getScaledInstance(700, 550, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 700, 550);
        add(image);

        setSize(700, 550);
        setLocation(350, 100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            // new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
