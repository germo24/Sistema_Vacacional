import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

 public class Welcome extends JFrame implements ActionListener{

   private JLabel label1,label2,label3,label4;
   private JTextField tfield1;
   private JButton button1;
   public static String text = "";

    public Welcome(){
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setTitle(" Welcome ! ");
     getContentPane().setBackground(new Color(255,0,0));
     setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());    

      ImageIcon imagen1 = new ImageIcon("images/logo-coca-blanco.png");
      label1 = new JLabel(imagen1);
      label1.setBounds(60,55,250,100);
      add(label1);

      label2 = new JLabel(" Vacational Control System ");
      label2.setFont(new Font("Calibri Light", 3, 23));
      label2.setForeground(new Color(255,255,255));
      label2.setBounds(45,150,300,75);
      add(label2);

      label3 = new JLabel(" Enter your name: ");
      label3.setFont(new Font("Calibri (Cuerpo)", 1, 12));
      label3.setForeground(new Color(255,255,255));
      label3.setBounds(45,215,150,50);
      add(label3);

      label4 = new JLabel(" The Coca Cola Company ");
      label4.setFont(new Font("Calibri (Cuerpo)", 1, 10));
      label4.setForeground(new Color(255,255,255));
      label4.setBounds(1,415,200,25);
      add(label4);

      tfield1 = new JTextField();
      tfield1.setBounds(50,255,230,30);
      tfield1.setBackground(new Color(210,210,210));
      tfield1.setFont(new Font("Calibri (Cuerpo)", 1, 12));
      tfield1.setForeground(new Color (1,1,1));
      add(tfield1);

      button1 = new JButton(" Enter ");
      button1.setBounds(125,305,100,30);
      button1.setBackground(new Color(250,250,250));
      button1.setFont(new Font("Calibri (Cuerpo)", 1, 13));
      button1.setForeground(new Color(255,0,0));
      add(button1);
      button1.addActionListener(this);
 }

       public void actionPerformed(ActionEvent e){

        if(e.getSource() == button1){
         text = tfield1.getText().trim();

          if(text.equals("")){
           JOptionPane.showMessageDialog(null, "You must to ingress your name");
   }     
          else{
           License interface2 = new License();
            interface2.setBounds(0,0,600,425);
            interface2.setResizable(false);
            interface2.setLocationRelativeTo(null);
            interface2.setVisible(true);
            this.setVisible(false);
   }
  }
 }

       public static void main(String args[]){
        Welcome interface1 = new Welcome();
         interface1.setBounds(0,0,375,475);
         interface1.setResizable(false);
         interface1.setLocationRelativeTo(null);
         interface1.setVisible(true);
 }
}