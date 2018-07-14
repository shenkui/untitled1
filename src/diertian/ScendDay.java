package diertian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by user on 2018/7/12.
 */


public class ScendDay extends JFrame {
    public ScendDay() {
        this.setSize(900, 500);
        this.setTitle("my windows");
        GridLayout gridLayout = new GridLayout(5,2);
        this.setLayout(gridLayout);
        JLabel titlelabel=new JLabel("title");
        JLabel accountlabel=new JLabel("account");
        JLabel passwordlabel=new JLabel("password");
        JLabel remarklabel=new JLabel("remark");
        JTextField title=new JTextField("");
        JTextField account=new JTextField("");
        JPasswordField password=new JPasswordField();
        JTextField remark=new JTextField("");
        JButton btnok=new JButton("Enter");
        JButton btncancle=new JButton("Cancel");
        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ScendDay.this,title.getText()+","+account.getText()+","+password.getText()+","+remark.getText());
            }

        });
         btncancle.addMouseListener(new MouseAdapter() {
           @Override
          public void mouseClicked(MouseEvent e) {
          System.exit(EXIT_ON_CLOSE);
    }
});
        this.add(titlelabel);
        this.add(title);
        this.add(accountlabel);
        this.add(account);
        this.add(passwordlabel);
        this.add(password);
        this.add(remarklabel);
        this.add(remark);
        this.add(btnok);
        this.add(btncancle);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        ScendDay ScendDay = new ScendDay();
    }}
