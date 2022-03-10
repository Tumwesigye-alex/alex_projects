
package form;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Form extends Frame implements ActionListener{
    
    private JTextField text,text2,text3;
    private JLabel lab1,lab2,lab3;
    private JButton btnsign,btnfor;
    private JCheckBox ch;
    
    Form(){
        //initialising components
       text= new JTextField();
       text3= new JTextField();
       text2= new JTextField();
       lab1=new JLabel("USER NAME :");
       lab2=new JLabel("PASSWORD :");
       lab3=new JLabel("Show password");
        btnsign =new JButton("SIGN IN");
        btnfor=new JButton("FORGOT PASSWORD");
        ch=new JCheckBox();
       
        //SETTING BOUNDS FOR THE CALCULATOR
       lab1.setBounds(20,20,80,100);
       text.setBounds(120,50,200,50);
       lab2.setBounds(20,80,80,100);
       text2.setBounds(120,110,200,50);
       ch.setBounds(120,170,20,20);
       lab3.setBounds(150,150,80,50);
       btnsign.setBounds(40,220,300,50);
       btnsign.setForeground(Color.BLUE);
       btnfor.setBounds(40,290,300,50);
       add(btnsign);
       add(btnfor);
       add(ch);
       add(text);
       add(text2);
       add(text3);
       add(lab1);
       add(lab2);
       add(lab3);
       //adding actionListener onto the button
       btnsign.addActionListener(this);
       btnfor.addActionListener(this);
       ch.addActionListener(this);
       text.addActionListener(this);
       text2.addActionListener(this);
       text3.addActionListener(this);
           }
 
    public static void main(String[] args) {
        Form f = new Form();
        f.setSize(350, 350);
        f.setLocationRelativeTo(null);
        //f.setBackground(Color.CYAN);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
       Font myFont=new Font("Ink Free",Font.BOLD,20);
        f.setFont(myFont);
    
        
        f.addWindowListener(new WindowAdapter(){
            @Override            public void windowClosing(WindowEvent evt){
              System.exit(0);
            }
        });
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
    }}