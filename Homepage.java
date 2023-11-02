import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

 public class Homepage extends JFrame implements ActionListener{

   private JMenuBar mb;
   private JMenu Moptions, Mabout, Mbackgroundcolor;
   private JMenuItem MIredcolor, MIblackcolor, MIpurplecolor, MICleanup, MIexit, MIcreator;
   private JLabel JLlogococa, JLwelcome, JLtitle, JLfullname, JLfatherlname, JLmotherlname, JLdepartament, JLseniority, JLresult, JLfooter;
   private JTextField TFfullname, TFfatherlname, TFmotherlname;
   private JComboBox CBdepartament, CBseniority;
   private JTextArea TAresult;
   private JScrollPane spane1;
   private JButton buttoncalculate;
   String namerecuperated = "";

    public Homepage(){
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setTitle("Homepage");
     getContentPane().setBackground(new Color (255,0,0));
     setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
     Welcome Winterface = new Welcome();
     namerecuperated = Winterface.text;

      mb = new JMenuBar();
      mb.setBackground(new Color(255,0,0));
      setJMenuBar(mb);

      Moptions = new JMenu("Options");
      Moptions.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      Moptions.setBackground(new Color(255,255,255));
      Moptions.setForeground(new Color (255,255,255));
      mb.add(Moptions);

      Mabout = new JMenu("About..");
      Mabout.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      Mabout.setBackground(new Color(255,255,255));
      Mabout.setForeground(new Color (255,255,255));
      mb.add(Mabout);

      Mbackgroundcolor = new JMenu(" Background color ");
      Mbackgroundcolor.setFont(new Font("Calibri (Cuerpo)", 1, 14));
      Mbackgroundcolor.setBackground(new Color(255,255,255));
      Mbackgroundcolor.setForeground(new Color (0,0,0));
      Moptions.add(Mbackgroundcolor);

      MIredcolor = new JMenuItem("Red");
      MIredcolor.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      MIredcolor.setBackground(new Color(255,255,255));
      MIredcolor.setForeground(new Color(0,0,0));
      MIredcolor.addActionListener(this);
      Mbackgroundcolor.add(MIredcolor);

      MIblackcolor = new JMenuItem("Black");
      MIblackcolor.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      MIblackcolor.setBackground(new Color(255,255,255));
      MIblackcolor.setForeground(new Color(0,0,0));
      MIblackcolor.addActionListener(this);
      Mbackgroundcolor.add(MIblackcolor);

      MIpurplecolor = new JMenuItem("Purple");
      MIpurplecolor.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      MIpurplecolor.setBackground(new Color(255,255,255));
      MIpurplecolor.setForeground(new Color(0,0,0));
      MIpurplecolor.addActionListener(this);
      Mbackgroundcolor.add(MIpurplecolor);

      MICleanup = new JMenuItem("Clean up");
      MICleanup.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      MICleanup.setBackground(new Color(255,255,255));
      MICleanup.setForeground(new Color(0,0,0));
      MICleanup.addActionListener(this);
      Moptions.add(MICleanup);

      MIexit = new JMenuItem("Exit");
      MIexit.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      MIexit.setBackground(new Color(255,255,255));
      MIexit.setForeground(new Color(0,0,0));
      MIexit.addActionListener(this);
      Moptions.add(MIexit);

      MIcreator = new JMenuItem("The creator");
      MIcreator.setFont(new Font(" Calibri (Cuerpo) ", 1, 14));
      MIcreator.setBackground(new Color(255,255,255));
      MIcreator.setForeground(new Color(0,0,0));
      MIcreator.addActionListener(this);
      Mabout.add(MIcreator);

      ImageIcon image1 = new ImageIcon("images/logo-coca-blanco.png");
      JLlogococa = new JLabel(image1);
      JLlogococa.setBounds(15,-15,230,150);
      add(JLlogococa);

      JLwelcome = new JLabel("Welcome " + namerecuperated);
      JLwelcome.setFont(new Font(" Calibri (Cuerpo) ", 2, 32));
      JLwelcome.setForeground(new Color(255,255,255));
      JLwelcome.setBounds(300,45,400,130);
      add(JLwelcome);

      JLtitle = new JLabel("Worker data for holiday calculation");
      JLtitle.setFont(new Font(" Calibri (Cuerpo) ", 2, 32));
      JLtitle.setForeground(new Color(255,255,255));
      JLtitle.setBounds(100,75,525,170);
      add(JLtitle);

      JLfullname = new JLabel("Fullname: ");
      JLfullname.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      JLfullname.setForeground(new Color(255,255,255));
      JLfullname.setBounds(35,200,120,30);
      add(JLfullname);

      TFfullname = new JTextField();
      TFfullname.setFont(new Font(" Calibri (Cuerpo) ", 1, 11));
      TFfullname.setForeground(new Color(0,0,0));
      TFfullname.setBackground(new Color(221,221,221));
      TFfullname.setBounds(35,225,140,25);
      add(TFfullname);

      JLfatherlname = new JLabel("Father's last name: ");
      JLfatherlname.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      JLfatherlname.setForeground(new Color(255,255,255));
      JLfatherlname.setBounds(35,260,120,30);
      add(JLfatherlname);

      TFfatherlname = new JTextField();
      TFfatherlname.setFont(new Font(" Calibri (Cuerpo) ", 1, 11));
      TFfatherlname.setForeground(new Color(0,0,0));
      TFfatherlname.setBackground(new Color(221,221,221));
      TFfatherlname.setBounds(35,285,140,25);
      add(TFfatherlname);

      JLmotherlname = new JLabel("Mother's last name: ");
      JLmotherlname.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      JLmotherlname.setForeground(new Color(255,255,255));
      JLmotherlname.setBounds(35,320,120,30);
      add(JLmotherlname);

      TFmotherlname = new JTextField();
      TFmotherlname.setFont(new Font(" Calibri (Cuerpo) ", 1, 11));
      TFmotherlname.setForeground(new Color(0,0,0));
      TFmotherlname.setBackground(new Color(221,221,221));
      TFmotherlname.setBounds(35,345,140,25);
      add(TFmotherlname);

      JLdepartament = new JLabel("Select your department: ");
      JLdepartament.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      JLdepartament.setForeground(new Color(255,255,255));
      JLdepartament.setBounds(300,205,140,30);
      add(JLdepartament);

      CBdepartament = new JComboBox();
      CBdepartament.setFont(new Font(" Calibri (Cuerpo) ", 1, 11));
      CBdepartament.setForeground(new Color(0,0,0));
      CBdepartament.setBackground(new Color(221,221,221));
      CBdepartament.setBounds(300,230,155,25);
      CBdepartament.addItem("");
      CBdepartament.addItem(" Customer Support ");
      CBdepartament.addItem(" Logistic Departament ");
      CBdepartament.addItem(" Management Departament ");
      add(CBdepartament);

      JLseniority = new JLabel("Select your seniority: ");
      JLseniority.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      JLseniority.setForeground(new Color(255,255,255));
      JLseniority.setBounds(300,265,140,30);
      add(JLseniority);

      CBseniority = new JComboBox();
      CBseniority.setFont(new Font(" Calibri (Cuerpo) ", 1, 11));
      CBseniority.setForeground(new Color(0,0,0));
      CBseniority.setBackground(new Color(221,221,221));
      CBseniority.setBounds(300,290,155,25);
      CBseniority.addItem("");
      CBseniority.addItem(" 1 year of service ");
      CBseniority.addItem(" 2 to 6 years of service ");
      CBseniority.addItem(" 7 or more years of service ");
      add(CBseniority);

      JLresult = new JLabel(" Result: ");
      JLresult.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      JLresult.setForeground(new Color(255,255,255));
      JLresult.setBounds(300,325,120,30);
      add(JLresult);

      TAresult = new JTextArea("\n   Here will be the result of the holiday calculation ");
      TAresult.setFont(new Font(" Calibri (Cuerpo) ", 1, 11));
      TAresult.setForeground(new Color(255,0,0));
      TAresult.setBackground(new Color(221,221,221));
      TAresult.setEditable(false);
      spane1 = new JScrollPane(TAresult);
      spane1.setBounds(300,350,300,75);
      add(spane1);

      JLfooter = new JLabel(" 2020 The Coca-Cola Company | All rights reserved");
      JLfooter.setFont(new Font(" Calibri Light ", 3, 9));
      JLfooter.setForeground(new Color(255,255,255));
      JLfooter.setBounds(200,450,500,25);
      add(JLfooter);

      buttoncalculate = new JButton(" Calculate ");
      buttoncalculate.setBackground(new Color(221,221,221));
      buttoncalculate.setFont(new Font(" Calibri (Cuerpo) ", 1, 11));
      buttoncalculate.setForeground(new Color(255,0,0));
      buttoncalculate.setBounds(620,430,90,30);
      buttoncalculate.addActionListener(this);
      add(buttoncalculate);


 }

       public void actionPerformed(ActionEvent e){

        if(e.getSource() == buttoncalculate){

         String FULLN = TFfullname.getText();
         String FATHERN = TFfatherlname.getText();
         String MOTHERN = TFmotherlname.getText();
         String DT = CBdepartament.getSelectedItem().toString();
         String SY = CBseniority.getSelectedItem().toString();

          if( FULLN.equals("") || FATHERN.equals("") || MOTHERN.equals("") || DT.equals("") || SY.equals("")){
           JOptionPane.showMessageDialog(null, "You must complete all fields");
    }
          else{

              if(DT.equals(" Customer Support ")){
            
                   if(SY.equals(" 1 year of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 6 days holidays");
              }
                   if(SY.equals(" 2 to 6 years of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 14 days holidays");
              }
                   if(SY.equals(" 7 or more years of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 20 days holidays");
              }
             }
           
               if(DT.equals(" Logistic Departament ")){
            
                   if(SY.equals(" 1 year of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 7 days holidays");
              }
                   if(SY.equals(" 2 to 6 years of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 15 days holidays");
              }
                   if(SY.equals(" 7 or more years of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 22 days holidays");
              }
             }

               if(DT.equals(" Management Departament ")){
            
                   if(SY.equals(" 1 year of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 10 days holidays");
              }
                   if(SY.equals(" 2 to 6 years of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 20 days holidays");
              }
                   if(SY.equals(" 7 or more years of service ")){
                    TAresult.setText("\n   The worker " + FULLN + " " + FATHERN + " " + MOTHERN +
                                     "\n   from " + DT + " with" +
                                     "\n   " + SY + " has 30 days holidays");
              }
             }


   }
  }
        if(e.getSource() == MIredcolor){
         getContentPane().setBackground(new Color(255,0,0));
         mb.setBackground(new Color(255,0,0));
         TAresult.setForeground(new Color(255,0,0));
         buttoncalculate.setForeground(new Color(255,0,0));
  }
        if(e.getSource() == MIblackcolor){
         getContentPane().setBackground(new Color(4,4,4));
         mb.setBackground(new Color(4,4,4));
         TAresult.setForeground(new Color(4,4,4));
         buttoncalculate.setForeground(new Color(4,4,4));
  }
        if(e.getSource() == MIpurplecolor){
         getContentPane().setBackground(new Color(75,15,75));
         mb.setBackground(new Color(75,15,75));
         TAresult.setForeground(new Color(75,15,75));
         buttoncalculate.setForeground(new Color(75,15,75));
  }
        if(e.getSource() == MICleanup){
         TFfullname.setText("");
         TFfatherlname.setText("");
         TFmotherlname.setText("");
         CBdepartament.setSelectedIndex(0);
         CBseniority.setSelectedIndex(0);
         TAresult.setText("\n   Here will be the result of the holiday calculation ");
  }
        if(e.getSource() == MIexit){
         System.exit(0);
  }
        if(e.getSource() == MIcreator){
         JOptionPane.showMessageDialog(null, " developed by German Voss :) ");
  }
 }

       public static void main(String args[]){
        Homepage interface3 = new Homepage();
         interface3.setBounds(0,0,750,535);
         interface3.setResizable(false);
         interface3.setLocationRelativeTo(null);
         interface3.setVisible(true);
 }
}