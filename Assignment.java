package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.*;

public class Assignment extends JFrame implements ActionListener {
    public JMenuBar menubar;
    public JMenu programs,faculty,home, student,Business_mgt2,science2,interdisplinary_st2,computing_info2,applied_sci2;
    public JMenuItem Business_mgt,science,interdisplinary_st,computing_info,applied_sci,bit,bcs,bse,bce,bbe,bee,bspe,bseb,bslt,bsep,bsa,bsg,bsp,bba,bsaf,bcpl,bsec,bsecon;
    public JLabel fname,lname,Gender, region, lang_experience, description;
    public JTextField txt_fname,txt_lname;
    public JCheckBox  Luganda, English, Spanish, Swahili, Rukiga, French,agree;
    public JComboBox<String> regionlist;
    public JTextArea description_textarea;
    public JRadioButton male,female;
    public JButton save, clear, exit;
    public ButtonGroup radioGroup;
    public String firstname,gender,lastname,longdata,luga,Eng,Ruki,Span,Fren,swa;
    public Object area;
    public final String []list={"Choose Region","Northern Uganda","Eastern Uganda","Western Uganda","Central Uganda"};
    

    public void setFrame(){

//for the main menubar elements
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        home = new JMenu("Home");
        faculty = new JMenu("Faculty");
        programs = new JMenu("Programs");
        student = new JMenu("Students");

        menubar.add(home);
        menubar.add(faculty);
        menubar.add(programs);
        menubar.add(student);
//for the faculty dropdown menu
//you can add a menu under a menu but the same is not possible for menu items
        applied_sci = new JMenuItem("Faculty of Applied Science");
        computing_info = new JMenuItem("Faculty of Computing And Informatics");
        science = new JMenuItem("Faculty Of Science");
        interdisplinary_st = new JMenuItem("Faculty Of Interdisciplinary Studies");
        Business_mgt = new JMenuItem("Faculty Of Business And Management Sciences");

        faculty.add(applied_sci);
        faculty.addSeparator();
        faculty.add(computing_info);
        faculty.addSeparator();
        faculty.add(science);
        faculty.addSeparator();
        faculty.add(interdisplinary_st);
        faculty.addSeparator();
        faculty.add(Business_mgt);
//        adding actionlisteners
        applied_sci.addActionListener(this);
        computing_info.addActionListener(this);
        science.addActionListener(this);
        interdisplinary_st.addActionListener(this);
        Business_mgt.addActionListener(this);
//For the programs drop down menu
        applied_sci2 = new JMenu("Faculty of Applied Science");
        computing_info2 = new JMenu("Faculty of Computing And Informatics");
        science2 = new JMenu("Faculty Of Science");
        interdisplinary_st2 = new JMenu("Faculty Of Interdisciplinary Studies");
        Business_mgt2 = new JMenu("Faculty Of Business And Management Sciences");

        programs.add(computing_info2);
        programs.addSeparator();
        programs.add(applied_sci2);
        programs.addSeparator();
        programs.add(science2);
        programs.addSeparator();
        programs.add(interdisplinary_st2);
        programs.addSeparator();
        programs.add(Business_mgt2);
//faculty of computing sub dropdowns
        bit=new JMenuItem("Bachelor of Information Technology");
        bcs=new JMenuItem("Bachelor of Computer Science");
        bse=new JMenuItem("Bachelor of Software Engineering");

        computing_info2.add(bit);
        computing_info2.add(bcs);
        computing_info2.add(bse);
 //        adding action listeners

        bit.addActionListener(this);
        bcs.addActionListener(this);
        bse.addActionListener(this);
 //faculty of applied science sub dropdowns
        bbe=new JMenuItem("Bachelor of Biomedical Engineering");
        bee=new JMenuItem("Bachelor of Engineering in Electrical and Electronics Engineering");
        bce=new JMenuItem("Bachelor of Science in Computer Engineering");
        bspe=new JMenuItem("Bachelor of Science in Petroleum Engineering and Environmental Management");

        applied_sci2.add(bbe);
        applied_sci2.add(bee);
        applied_sci2.add(bce);
        applied_sci2.add(bspe);
//        adding action listeners
        bbe.addActionListener(this);
        bee.addActionListener(this);
        bce.addActionListener(this);
        bspe.addActionListener(this);
//faculty of science sub dropdowns
        bsec=new JMenuItem("Bachelor of Science with Education (Chem/Math)");
        bseb=new JMenuItem("Bachelor of Science with Education (Biological)");
        bslt=new JMenuItem("Diploma in Science Laboratory Technology ");
        bsep=new JMenuItem("Bachelor of Science with Education (Physical) ");

        science2.add(bsec);
        science2.add(bseb);
        science2.add(bslt);
        science2.add(bsep);
//        adding action listeners
        bsec.addActionListener(this);
        bseb.addActionListener(this);
        bslt.addActionListener(this);
        bsep.addActionListener(this);
//faculty of interdisciplinary studies sub dropdowns
        bsa=new JMenuItem("Bachelor of Science in Agricultural Livelihoods and Farm Production ");
        bsg=new JMenuItem("Bachelor of Science in Gender and Applied Women Health");
        bsp=new JMenuItem("Bachelor of Science in Planning and Community Development ");

        interdisplinary_st2.add(bsa);
        interdisplinary_st2.add(bsg);
        interdisplinary_st2.add(bsp);
//        adding action listeners
        bsa.addActionListener(this);
        bsg.addActionListener(this);
        bsp.addActionListener(this);
//faculty of business and management studies sub dropdowns
        bba=new JMenuItem("Bachelor of Business Administration");
        bsaf=new JMenuItem("Bachelor of Science in Accounting and Finance");
        bsecon=new JMenuItem("Bachelor of Science in Economics");
        bcpl=new JMenuItem("Bachelor of Science in Procurement and Supply Chain Management");

        Business_mgt2.add(bba);
        Business_mgt2.add(bsaf);
        Business_mgt2.add(bsecon);
        Business_mgt2.add(bcpl);
//        adding action listeners
        bba.addActionListener(this);
        bsaf.addActionListener(this);
        bsecon.addActionListener(this);
        bcpl.addActionListener(this);
//for the first and last name input options

        fname = new JLabel("Enter First Name : ");
        fname.setBounds(30,30,120,30);
        add(fname);
        txt_fname = new JTextField();
        txt_fname.setBounds(180,30,220,30);
        add(txt_fname);

        lname = new JLabel("Enter Last Name: ");
        lname.setBounds(30,80,120,30);
        add(lname);
        txt_lname = new JTextField();
        txt_lname.setBounds(180,80,220,30);
        add(txt_lname);

//for the gender selection

        Gender = new JLabel("Gender  :");
        Gender.setBounds(30,120,80,30);
        add(Gender);
        radioGroup=new ButtonGroup();
        male = new JRadioButton("Male",false);
        radioGroup.add(male);
        female = new JRadioButton("Female",false);
        radioGroup.add(female);
        male.setBounds(180,120,80,30);
        add(male);
        female.setBounds(280,120,80,30);
        add(female);

//for the region choice selection

        region = new JLabel("Select Address Region :");
        region.setBounds(30,160,150,30);
        add(region);
        regionlist = new JComboBox<>();
        regionlist.setBounds(180,160,220,30);
        add(regionlist);
        for(String R : list) {
            regionlist.addItem(R);
        }

//for the language experience

        lang_experience = new JLabel("Language Experience :");
        lang_experience.setBounds(30,220,150,30);
        add(lang_experience);
        
        Luganda = new JCheckBox("Luganda",false);
        Luganda.setBounds(200,220,100,30);
        add(Luganda);
        English = new JCheckBox("English",false);
        English.setBounds(310,220,80,30);
        add(English);
        Swahili = new JCheckBox("Swahili",false);
        Swahili.setBounds(200,270,100,30);
        add(Swahili);
        Rukiga = new JCheckBox("Rukiga",false);
        Rukiga.setBounds(310,270,80,30);
        add(Rukiga);
        French = new JCheckBox("French",false);
        French.setBounds(200,320,100,30);
        add(French);
        Spanish = new JCheckBox("Spanish",false);
        Spanish.setBounds(310,320,88,30);
        add(Spanish);

//for the description text area

        description = new JLabel("Description  :");
        description.setBounds(30,380,100,30);
        add(description);
        description_textarea = new JTextArea();
        description_textarea.setBounds(180,380,220,150);
        add(description_textarea);

//for the agreement checkbox

        agree = new JCheckBox("");
        agree.setBounds(50,550,30,30);
        add(agree);
        agree.addActionListener(this);
        JLabel agrees = new JLabel("I have read and Agree to the Terms & Conditions of MUST");
        agrees.setBounds(80,550,350,30);
        add(agrees);


//for the last three buttons

        save = new JButton("Save");
        save.setBackground(Color.BLUE);
        save.setBounds(30,600,100,30);
        add(save);
        save.addActionListener(this);
        clear = new JButton("Clear");
        clear.setBackground(Color.GREEN);
        clear.setBounds(170,600,100,30);
        add(clear);
        clear.addActionListener(this);
        exit = new JButton("Exit");
        exit.setBackground(Color.RED);
        exit.setBounds(300,600,100,30);
        add(exit);
        exit.addActionListener(this);

    }

    public static void main(String[] args) {
        Assignment a= new Assignment();
        a.setSize(450,700);
        a.setLocationRelativeTo(null);
        a.setTitle("Form");
        a.setResizable(false);
        a.setFrame();
        a.setLayout(null);
        a.setTitle("Mbarara University Registration Form");
        a.setVisible(true);
        //a.inputValidation();
        
        try{
     
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    Object choice = e.getSource();
    if(choice==applied_sci){
        showMessageDialog(null,
                   "Faculty Dean: Dr.Nabasa Everest\n" +
                           "Date Started: 15th-Jan-2015\n" +
                            "No of programs:4 programs\n" +
                            "No of departments: 4 departments\n" +
                            "About : Deals in research science and technology",
                    "Faculty of computing and informatics",
                    INFORMATION_MESSAGE);
    }
    else if(choice==computing_info){
        showMessageDialog(null,
                "Faculty Dean: Dr.Nabasa Everest\n" +
                        "Date Started: 15th-Jan-2015\n" +
                        "No of programs:4 programs\n" +
                        "No of departments: 4 departments\n" +
                        "About : Deals in research science and technology\n",
                "Faculty of computing and informatics",
                INFORMATION_MESSAGE);
    }
    else if(choice==science){
        showMessageDialog(null,
                "Faculty Dean: Dr.Atwiine\n" +
                        "Date Started: 15th-Jan-2015\n" +
                        "No of programs:4 programs\n" +
                        "No of departments: 4 departments\n" +
                        "About : Deals in research science and technology\n",
                "Faculty of computing and informatics",
                INFORMATION_MESSAGE);
    }
    else if(choice==interdisplinary_st){
        showMessageDialog(null,
                "Faculty Dean: Dr.Asasira\n" +
                        "Date Started: 15th-Jan-2015\n" +
                        "No of programs:4 programs\n" +
                        "No of departments: 4 departments\n" +
                        "About : Deals in research about gender and counselling\n",
                "Faculty of Interdisciplinary Studies",
                INFORMATION_MESSAGE);
    }
    else if(choice==Business_mgt) {
        showMessageDialog(null,
                "Faculty Dean: Dr.Twinamatsiko\n" +
                        "Date Started: 15th-Jan-2015\n" +
                        "No of programs:4 programs\n" +
                        "No of departments: 4 departments\n" +
                        "About : Deals in research in business management",
                "Faculty of Business ",
                INFORMATION_MESSAGE);
    }
    else if(choice==bit){
        showMessageDialog(null,
            "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bcs){
        showMessageDialog(null,
 "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bse){
        showMessageDialog(null,
            "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bbe){
        showMessageDialog(null,
             "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bee){
        showMessageDialog(null,
             "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bce){
        showMessageDialog(null,
             "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bspe){
        showMessageDialog(null,
             "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bsec){
        showMessageDialog(null,
             "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bseb){
        showMessageDialog(null,
             "Program head :Mr.KennethBaguma\n" +
                    "Number of course units :6\n" +
                    "Program description :Equip students with the basic computing Knowledge\n" +
                    "Program short name :BIT\n" +
                    "C,JAVA,WEB,OS,SAD,FIS\n date it was started: 5th-jan-2015",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bslt){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units :\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bsep){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units :\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bsa){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units :\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bsg){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bsp){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units :\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bba){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units :\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bsaf){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units:\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bsecon){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units :\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
    else if(choice==bcpl){
        showMessageDialog(null,
            "Program head :\n" +
                    "Number of course units :\n" +
                    "Program description :\n" +
                    "Program short name :\n" +
                    "Atleast 5 course units and date it was started",
            "Program Name",
            INFORMATION_MESSAGE);}
//    for the save button
    else if(choice==save){
//            first name validation
        if(txt_fname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"First Name cannot contain a null value");
            }
//            last name validation
            else if(txt_lname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Last Name cannot contain a null value");
            }
//            genderValidation
            else if(!male.isSelected() && !female.isSelected()){
                JOptionPane.showMessageDialog(null,"Please select a gender");
            }
//            region combobox validation
            else if(regionlist.getSelectedItem()==list[0]){
                JOptionPane.showMessageDialog(null,"Please select a Region");
            }
//            if(description_textarea.getText().length()<50){
//            JOptionPane.showConfirmDialog(null, "The description cannot be less than 50 words");
//            }
            else if(!Luganda.isSelected()&&!English.isSelected()||!Spanish.isSelected()&&!Swahili.isSelected()||!Rukiga.isSelected()&&!French.isSelected()){
                JOptionPane.showMessageDialog(null,"Please select atleast three languages");
            }
            
//            description textarea verification
            else if(description_textarea.getText().equals("")){
                JOptionPane.showMessageDialog(null," description is needed");
            }
            
           
//            agree button verification
            else if(!agree.isSelected()){
                JOptionPane.showMessageDialog(null,"Please Agree to the terms and Conditions");
            }
            
           
        else if( JOptionPane.showConfirmDialog (null, "Are You sure the information entered is correct","confirmation",YES_NO_OPTION) == JOptionPane.YES_OPTION){
            firstname=txt_fname.getText();
            lastname=txt_lname.getText();
           
            area = regionlist.getSelectedItem();
            longdata=description_textarea.getText();
            if(male.isSelected()){
                gender="male";
            }else{
                gender="female";
            }
            if(Luganda.isSelected()){
                luga=Luganda.getText();
            }else{
            luga="";
            }
            if(English.isSelected()){
                Eng=English.getText();
            }else{
            Eng="";
            }
            
            if(Swahili.isSelected()){
                swa=Swahili.getText();
            }else{
            swa="";
            }
            if(Rukiga.isSelected()){
                Ruki=Rukiga.getText();
            }else{
            Ruki="";
            }
            if(Spanish.isSelected()){
                Span=Spanish.getText();
            }else{
            Span="";
            }
            if(French.isSelected()){
                Fren=French.getText();
            }else{
            Fren="";
            }
            
            JOptionPane.showMessageDialog(null,"First Name :"+firstname+"\n"+"Last Name :"+
                    lastname+"\n"+"Gender :"+gender+"\n"+"Region :"+area+"\n"+"Language"+luga+swa+Fren+Ruki+Span+Eng+"\n"+""
                            + "Description:\n"+longdata,"Message", INFORMATION_MESSAGE);
        }//else {
          //  JOptionPane.showConfirmDialog(null, "Looks like you are not sure", "confirmation", YES_NO_OPTION,INFORMATION_MESSAGE);
        //}
    }
    
//    for the clear button
    else if(choice==clear){
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to clear ","Clear Confirmation",YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            txt_fname.setText("");
            txt_lname.setText("");
            radioGroup.clearSelection();
            regionlist.setSelectedIndex(0);
            Luganda.setSelected(false);
            English.setSelected(false);
            Spanish.setSelected(false);
            Swahili.setSelected(false);
            Rukiga.setSelected(false);
            French.setSelected(false);
            description_textarea.setText("");
            
            agree.setSelected(false);
            txt_fname.requestFocus();
        }else {
            JOptionPane.showMessageDialog(null, "Clear Cancelled");
        }
    }
//    for the exit button
    else if(choice==exit){
        int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Exit ","Exit Confirmation",YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            System.exit(0);
        }else {
            JOptionPane.showMessageDialog(null, "Exit Cancelled","Exit Cancelled",WARNING_MESSAGE);
        }
    }
    }
    public void inputValidation(){
      if(description_textarea.getText().length()<50){
                try{
                    throw new Validation("Description cannot be less than 50 words");
                }catch(Validation ex){
                    JOptionPane.showMessageDialog(null,ex);
                }
            }
    
    }
}
//public  void inputValidation() throws Validation{
//
//            if(description_textarea.getText().length()<50){
//            JOptionPane.showConfirmDialog(null, "The description cannot be less than 50 words");
//            }
//}
//}
//
//class Validation extends Exception{
//Validation(String error_message){
//super(error_message);
//}
//}