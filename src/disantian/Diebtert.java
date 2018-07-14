package disantian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 2018/7/13.
 */
public class Diebtert extends JFrame{
    /*顶部*/
    private JTextField panelSearch = new JTextField();
    private JPanel panelProcess = new JPanel();
    private JTextField txtSearch = new JTextField();
    private  JButton btnSearch = new JButton("search");
   /*中间*/
   private  JPanel panelcencer = new JPanel();

    private  JTextField lblview=new JTextField();
/*底部*/
    private  JButton btnadd = new JButton("add");
    private  JButton btndel = new JButton("del");
    private JButton btnmodify = new JButton("modify");
/*第二面板*/
    private JPanel panelAdd=new JPanel();
    private JLabel labAddAcount=new JLabel("账号");
    private JTextField account = new JTextField();
    private JLabel labpassword = new JLabel("密码");
    private  JTextField password = new JTextField();
   // private  JButton btnEnter = new JButton();
  //  private  JButton btnCancel = new JButton();



    public Diebtert(){
        panelSearch.setLayout(new BorderLayout());
        panelcencer.setLayout(new GridLayout());
        panelSearch.add(txtSearch);
        panelSearch.add(btnSearch,BorderLayout.EAST);
        panelProcess.add(btnadd,BorderLayout.SOUTH);
        panelProcess.add(btndel,BorderLayout.SOUTH);
        panelProcess.add(btnmodify,BorderLayout.SOUTH);

      //  panelProcess.add(btnEnter);
       // btnEnter.setVisible(false);
       // panelProcess.add(btnCancel);
        panelcencer.add(lblview);
        lblview.setVisible(true);
        this.add(panelSearch,BorderLayout.NORTH);
        this.add(panelProcess,BorderLayout.SOUTH);
        //this.add(panelAdd);
        this.add(panelcencer);
       //panelSearch.add(btnEnter,BorderLayout.SOUTH);

        /*用户密码*/
        this.add(labAddAcount,BorderLayout.WEST);
        this.add(account,BorderLayout.EAST);
        this.add(labpassword ,BorderLayout.WEST);
        this.add(password,BorderLayout.EAST);

        /*第二面板*/
        panelAdd.setLayout(new GridLayout(2,2));
        panelAdd.add(labAddAcount);
        panelAdd.add(account);
        panelAdd.add(labpassword);
        panelAdd.add(password);
       // panelAdd.setVisible(false);




        btnadd.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

             //JOptionPane.showMessageDialog(Diebtert.this,panelSearch.getText());
              String value = btnadd.getText();
              if(value.equals("add")) {
                  //移除组件
                  Diebtert.this.panelcencer.remove(lblview);
                  //添加到中间
                  Diebtert.this.panelcencer.add(panelAdd);
                  value="save";
                  btndel.setText("cancel");
                  btnmodify.setVisible(false);

              } else {
                  //还原初始状态

                  Diebtert.this.panelcencer.remove(panelAdd);
                  lblview.setText("保存成功");
                  Diebtert.this.panelcencer.add(lblview);
                  value="add";
                  btndel.setText("del");
                  btnmodify.setVisible(true);
              }
              btnadd.setText(value);

              //类似页面刷新
              Diebtert.this.panelcencer.setVisible(false);
              Diebtert.this.panelcencer.setVisible(true);


            lblview.setText(value);
              lblview.setForeground(Color.red);
              panelAdd.setVisible(true);
             //btnEnter.setVisible(true);


          }



      });
        btndel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vauledel = btndel.getText();
                if (vauledel.equals("cancel")){
                    Diebtert.this.panelcencer.remove(lblview);
                    //添加到中间
                    Diebtert.this.panelcencer.add(panelAdd);
                    vauledel="del";
                   btnadd.setVisible(false);
                    btnmodify.setVisible(false);
                } else {
                    //还原

                    Diebtert.this.panelcencer.remove(panelAdd);
                    Diebtert.this.panelcencer.add(lblview);
                    vauledel="cancel";


                    btnmodify.setVisible(false);
                btnadd.setText(vauledel);




            }}
        });







        this.setSize(888,666);
        this.setTitle("账号管理");
        this.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public  static  void main(String[] args){
        new Diebtert();
    }
}
