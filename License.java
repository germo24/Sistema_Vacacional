import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;

 public class License extends JFrame implements ActionListener, ChangeListener{

   private JLabel label1,label2;
   private JCheckBox check1;
   private JButton button1,button2;
   private JTextArea area1;
   private JScrollPane spane1;
   String namerecuperated = "";

    public License(){
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setTitle("License");
     setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
     Welcome Winterface = new Welcome();
     namerecuperated = Winterface.text;

      label1 = new JLabel(" Terms and conditions ");
      label1.setBounds(150,1,280,50);
      label1.setFont(new Font(" Calibri Light ", 1, 23));
      label1.setForeground(new Color(1,1,1));
      add(label1);

      area1 = new JTextArea();
      area1.setEditable(false);
      area1.setBackground(new Color(253,253,253));
      area1.setFont(new Font(" Calibri (Cuerpo) ", 3, 12));
      area1.setText("\n\n          TERMS AND CONDITIONS " + 
                    "\n\n         Restrictions " + 
                    "\n\n       The only Content that you may download from this Site is Content specifically available" +
                    "\n        for download as long as you retain the copyright notices and any other notices of " + 
                    "\n        ownership of the Content." +
                    "\n\n        Using the Site to send or transmit any illegal, threatening, false, misleading, abusive, " + 
                    "\n        harassing, libelous, defamatory, vulgar, etc." + 
                    "\n\n        The Coca-ColaCompany will work closely with the authorities or any court issuing a " + 
                    "\n       court order requesting The Coca-Cola Company to disclose the identity of any person " + 
                    "\n        who sent or transmitted such information or material." + 
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                               SAMPLE TEST");
      spane1 = new JScrollPane(area1);
      spane1.setBounds(25,50,535,225);
      add(spane1);

      check1 = new JCheckBox(" I " + namerecuperated +  " accept the terms and conditions ");
      check1.setBounds(30,285,280,30);
      add(check1);
      check1.addChangeListener(this);

      button1 = new JButton("Continue");
      button1.setBounds(30,325,90,30);
      button1.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      button1.setEnabled(false);
      add(button1);
      button1.addActionListener(this);

      button2 = new JButton("Exit");
      button2.setBounds(130,325,90,30);
      button2.setFont(new Font(" Calibri (Cuerpo) ", 1, 12));
      button2.setEnabled(true);
      add(button2);
      button2.addActionListener(this);

      ImageIcon image1 = new ImageIcon("images/logo-coca-rojo.png");
      label2 = new JLabel(image1);
      label2.setBounds(300,270,250,120);
      add(label2);
 }
       public void stateChanged(ChangeEvent e){

        if(check1.isSelected() == true){
         button1.setEnabled(true);
         button2.setEnabled(false);
   }
        else{
         button1.setEnabled(false);
         button2.setEnabled(true);
   }
  }

       public void actionPerformed(ActionEvent e){

        if(e.getSource() == button1){
         Homepage interface3 = new Homepage();
          interface3.setBounds(0,0,750,535);
          interface3.setResizable(false);
          interface3.setLocationRelativeTo(null);
          interface3.setVisible(true);
          this.setVisible(false);
   }
        else if(e.getSource() == button2){
         Welcome interface1 = new Welcome();
          interface1.setBounds(0,0,375,475);
          interface1.setResizable(false);
          interface1.setLocationRelativeTo(null);
          interface1.setVisible(true);
          this.setVisible(false);
  } 
 }

       public static void main(String args[]){
        License interface2 = new License();
         interface2.setBounds(0,0,600,425);
         interface2.setResizable(false);
         interface2.setLocationRelativeTo(null);
         interface2.setVisible(true);
 }
}