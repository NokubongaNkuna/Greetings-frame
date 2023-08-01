package za.ac.tut.gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingsGUI extends JFrame
{
    // panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //Labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    // Textfield
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //Textarea
    private JTextArea greetingsTxtArea;
    
    //Buttons
    private JButton greetBtn;
    private JButton cleaBtn;
    private JButton exitBtn;
            
   public GreetingsGUI()
   {
       //configure the GUI
       setLayout(new BorderLayout());
       setTitle("Greeting GUI");
       setSize(700, 750);
       setBackground(Color.yellow);
       
       // Creat panels 
       namePnl = new JPanel(new FlowLayout());
       surnamePnl = new JPanel(new FlowLayout());
       
       nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
       
       greetingAreaPnl = new JPanel(new FlowLayout());
       greetingAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
       
       btnsPnl = new JPanel(new FlowLayout());
       mainPnl = new JPanel(new BorderLayout());
       
       headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
       headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
       
       // Create the text labels
       headingLbl = new JLabel("Greetings App");
       nameLbl = new JLabel("Name: ");
       surnameLbl = new JLabel("Surname: ");
       
       //Create the text field
       nameTxtFld = new JTextField(20);
       surnameTxtFld = new JTextField(20);
       
       // Create the text area
       greetingsTxtArea = new JTextArea(40, 50);
       greetingsTxtArea.setEditable(false);
       greetingsTxtArea.setText("Hello [name] [surname]");
       
       //create the buttons
       greetBtn = new JButton("Greet");
       cleaBtn = new JButton("Clear");
       exitBtn = new JButton("Exit");
       
       //add name label textfield to the name panel
       namePnl.add(nameLbl);
       namePnl.add(nameTxtFld);
       
       // add surname label and textfield to the surname panel
       surnamePnl.add(surnameLbl);
       surnamePnl.add(surnameTxtFld);
       
       //add the name and surname panel to the collective panel
       nameAndSurnamePnl.add(namePnl);
       nameAndSurnamePnl.add(surnamePnl);
       
       //add the greetings area to its panel
       greetingAreaPnl.add(greetingsTxtArea);
       
       //add buttons to their panel
       btnsPnl.add(greetBtn);
       btnsPnl.add(cleaBtn);
       btnsPnl.add(exitBtn);
       
       //add all the panels to the main panel
       mainPnl.add(nameAndSurnamePnl,BorderLayout.NORTH);
       mainPnl.add(greetingAreaPnl,BorderLayout.CENTER);
       mainPnl.add(btnsPnl,BorderLayout.SOUTH);
               
               //add the main panel to the frame'spanel
               add(headingPnl,BorderLayout.NORTH);
               add(mainPnl, BorderLayout.CENTER );
               
               // make the frame visible 
               setVisible(true);
       
       
       
        
  }
}
