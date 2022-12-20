package software_enginner;

import javax.swing.*;

public class creat_account {
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("µù¥U±b¸¹");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panelimplement(panel);
        frame.setVisible(true);
    }

    private static void panelimplement(JPanel panel)
    {
        panel.setLayout(null);
        
        JLabel account = new JLabel("¿é¤J±b¤á:");
        account.setBounds(10, 20, 80, 25);
        panel.add(account);

        JTextField account_text = new JTextField(20);
        account_text.setBounds(100,20, 165, 25);
        panel.add(account_text);

        JLabel password = new JLabel("¿é¤J±K½X");
        password.setBounds(10,50,80,20);
        panel.add(password);

        
    }
}
