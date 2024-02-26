package PAJ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kelas extends JFrame {

    private JTextArea Chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();
    private JLabel sign = new JLabel();

    public Kelas() {
        JFrame frame = new JFrame();
        final int[] i = {0};
        int batas = 1;

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setLocation(480,200);
        frame.setTitle("SIMULASI CHAT DOI");
        frame.add(Chatarea);
        frame.add(chatbox);
        frame.add(sign);

        Chatarea.setSize(500, 400);
        Chatarea.setLocation(2, 2);

        sign.setSize(500, 20);
        sign.setLocation(2, 410);
        sign.setForeground(Color.black);
        sign.setFont(new Font("Calibri", Font.PLAIN, 16));

        chatbox.setSize(500, 30);
        chatbox.setLocation(2, 430);

        bot("Siapa?");

        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                boolean angka = false;
                String gtext = chatbox.getText();

                Chatarea.append("Kamu = " + gtext + "\n");
                chatbox.setText("");

                i[0]++;

                if (gtext.contains("hai")) {
                    bot("APASIH SO ASIK");
                } else if (gtext.contains("pacar")) {
                    frame.dispose();
                } else {
                    int random = (int) (Math.random() * 3 + 1);

                    if (random == 1) {
                        bot("APASIH LO G JELAS");
                    } else if (random == 2) {
                        bot("SOK ASIK LU");
                    } else if (random == 3) {
                        bot("MAKSUDNYA?");
                    }
                }
            }
        });
        batas++;
        int angka = i[0];
        total(angka);
    }

    private void total(int angka){
        sign.setText("Persentase dia suka dengan kamu : " + angka + "%");
    }

    private void bot(String string) {
        Chatarea.append("Dia = " + string + "\n");
    }
}
