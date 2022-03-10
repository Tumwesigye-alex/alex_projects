package swing_form;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Swing_form extends JFrame implements ActionListener
{
    private JLabel name,pwd;
    private JTextField tname;
    private JPasswordField tpwd;
    private JButton btlog,btclear;
    
    //initialising the components
    public void jforms(){
    Font fon =new Font("Mono space",Font.BOLD,15);
    name= new JLabel("User name");
    pwd=new JLabel("Password");
    tname=new JTextField("");
    btlog=new JButton("Login");
    btclear=new JButton("Clear");
    tpwd=new JPasswordField("");
    //setting the bounds for the COMPONENTS
    name.setBounds(20, 30, 100, 80);
    tname.setBounds(120,50,250,40);
    pwd.setBounds(20, 90, 100, 80);
    tpwd.setBounds(120,110,250,40);
    btlog.setBounds(120, 170, 110, 50);
    btclear.setBounds(250,170,115,50);
    //adding the components
    add(name);
    add(tname);
    add(pwd);
    add(tpwd);
    add(btlog);
    add(btclear);
    tpwd.addActionListener(this);
    tname.addActionListener(this);
    btclear.addActionListener(this);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Swing_form f=new Swing_form();
        f.jforms();
        f.setTitle("Swing forms");
        f.setSize(400, 500);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(3);
        f.setAlwaysOnTop(true);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
    String a=evt.getActionCommand();
    if(a.equals("Clear")){
    tname.setText(null);
    tpwd.setText(null);
    tname.requestFocus();
    }
    }
    
}
