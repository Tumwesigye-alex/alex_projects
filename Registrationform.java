
package registrationform;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Registrationform extends JFrame implements ActionListener {
//declaring the variables to be used in the form
    private JTextField t1,t2;
    private JButton btsave,btclear,btexit;
    private JRadioButton rb1,rb2;
    private Choice c;
    private ButtonGroup j;
    private JTextArea tx;
    //private JComboBox jc;
    private Checkbox ch1,ch2,ch3,ch4,ch5,ch6,ch7;
    private JLabel labh, labf,labp,labs,lab1,lab14,lab15,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11,lab12,lab13;
    Registrationform(){
        //initialising the variables in the constructors
        t1 = new JTextField("");
        t2 = new JTextField("");
        j=new ButtonGroup();
        j.add(rb1);
        j.add(rb2);
        //String[] alex = {"Northern Uganda","Eastern","Western","South","Central"};
        //jc = new JComboBox<String>(alex);
        c=new Choice();
        c.add("Northern Uganda");
        c.add("Southern Uganda");
        c.add("Eastern Uganda");
        c.add("Western Uganda");
        c.add("Central Uganda");
        
        btsave= new JButton("SAVE");
        btclear= new JButton("CLEAR");
        btexit= new JButton("EXIT");
        tx= new JTextArea();
        rb1=new JRadioButton();
        rb2=new JRadioButton();
        ch1 = new Checkbox();
        ch2 = new Checkbox();
        ch3 = new Checkbox();
        ch4 = new Checkbox();
        ch5 = new Checkbox();
        ch5 = new Checkbox();
        ch6 = new Checkbox();
        ch7 = new Checkbox();
        labh = new JLabel("Home");
        labf = new JLabel("Faculty");
        labp = new JLabel("Programs");
        labs = new JLabel("Students");
        lab1 = new JLabel("Enter first name:");
        lab2 = new JLabel("Enter Last Name:");
        lab3 = new JLabel("Gender");
        lab4 = new JLabel("Male");
        lab5 = new JLabel("Female");
        lab6 = new JLabel("Select Address Religion:");
        lab7 = new JLabel("Language Experience");
        lab8 = new JLabel("Luganda");
        lab9 = new JLabel("English");
        lab10 = new JLabel("Swahili");
        lab11 = new JLabel("Rukiga");
        lab12 = new JLabel("French");
        lab13 = new JLabel("Spanish");
        lab14 = new JLabel("Description:");
        lab15 = new JLabel("I have read and Agreed to the terms and conditions of MUST");
        // adding components to the frame
        //setting bounds for the frame
        labh.setBounds(0, 0, 60, 40);labf.setBounds(50, 0, 60, 40);labp.setBounds(100, 0, 60, 40);labs.setBounds(170, 0, 60, 40);
        lab1.setBounds(30,30,100,70);lab2.setBounds(30,80,100,70);
        lab3.setBounds(30,120,100,70);
        rb1.setBounds(230,140,30,30);lab4.setBounds(260,130,100,50);
        rb2.setBounds(400,140,30,30);lab5.setBounds(430,130,100,50);
        lab6.setBounds(30,170,200,50);
        lab7.setBounds(30,230,150,50);
        ch1.setBounds(230,250,20,20);
        lab8.setBounds(250,245,100,30);
         ch2.setBounds(480,250,20,20);
        lab9.setBounds(500,245,100,30);
         ch3.setBounds(230,280,20,20);
        lab10.setBounds(250,275,100,30);
         ch4.setBounds(480,280,20,20);
        lab11.setBounds(500,275,100,30);
        ch5.setBounds(230,310,20,20);
        lab12.setBounds(250,305,100,30);
        ch6.setBounds(480,310,20,20);
        lab13.setBounds(500,305,100,30);
        lab14.setBounds(30,350,100,30);
        tx.setBounds(230,345,320,100);
        ch7.setBounds(30,460,20,20);
        lab15.setBounds(50,455,500,30);
        btsave.setBounds(30,485,140,30);
        btsave.setBackground(Color.BLUE);
        btclear.setBounds(220,485,140,30);
        btclear.setBackground(Color.GREEN);
        btexit.setBounds(410,485,140,30);
        btexit.setBackground(Color.RED);
        c.setBounds(230,180,300,30);
        t1.setBounds(230,50,300,30);t2.setBounds(230,100,300,30);
        add(labh);  add(labf);  add(labp);  add(labs);  add(lab1);  add(lab2);add(c);
        add(lab3); add(lab4); add(lab5); add(lab6); add(lab7); add(lab8); add(lab9);
        add(lab10); add(lab11); add(lab12); add(lab13); add(lab14); add(lab15); add(tx);
        add(rb1); add(rb2); add(ch1); add(ch2); add(ch3); add(ch4); add(ch5);
        add(ch6); add(ch7); add(btsave); add(btclear); add(btexit); add(t1);add(t2);
        btsave.addActionListener(this);btclear.addActionListener(this);btexit.addActionListener(this);
        rb1.addActionListener(this);rb2.addActionListener(this);//ch1.addActionListener(this);
        //ch2.addActionListener(this);ch3.addActionListener(this);ch4.addActionListener(this);
        t1.addActionListener(this);t2.addActionListener(this);
        //ch5.addActionListener(this);ch6.addActionListener(this);ch7.addActionListener(this);
    }
    public static void main(String[] args) {
        Registrationform reg = new Registrationform();
         reg.setTitle("Mbarara University Registration Form");
       reg.setSize(600, 600);
       reg.setLayout(null);
       reg.setVisible(true);
       reg.setLocationRelativeTo(null);
       reg.setResizable(false);
        reg.setTitle("Mbarara University Registration Form");
        reg.addWindowListener(new WindowAdapter(){
        public void closing(){
        System.exit(0);
        }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btsave){
        JOptionPane.showMessageDialog(null, "Information successfully saved");
        }
        else if(e.getSource()==btclear){
            t1.setText("");
            t2.setText("");
            tx.setText("");
           
        
        }
        else if(e.getSource()==btexit){
        //System.exit(0);
        if(JOptionPane.showConfirmDialog(null, "Are you sure want to exit?","Exit confirmation",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
       JOptionPane.showMessageDialog(null, "Exit cancelled");
        }
        }
      
    }
    
}
