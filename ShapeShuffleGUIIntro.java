// Authors: Aaron Broughton, Nathan Oberdick, Fabian Vlica, Austin Brown
// Filename: ShapeShuffleGUI.java

// Due: 12/7/2016
// Email: atb5274@psu.edu
 
// ATM Application
// GUI & Computational Object


import javax.swing.*;	// Swing GUI components 
import java.awt.*;		// Container class
import java.awt.event.*;	// ActionListener


public class ShapeShuffleGUIIntro extends JFrame implements ActionListener 
{
  
  private Container contentPane;
  private JButton easyButton, mediumButton, hardButton, helpButton, exitButton;  // Main Menu JButtons
  private JTextArea display;
  private String time = "60"; //time is seconds

  /**public build ShapeShuffleGUI (String title)
  {
      buildIntroShapeShuffleGUI(title);
      buildGameScreenShapeShuffleGUI(title);
      buildWinLoseShapeShuffleGUI(title);
  }*/
  
   public ShapeShuffleGUIIntro (String title)
   {
      buildGUI();          //Builds the GUI
      setTitle(title);     //Sets the title.
      setSize(500, 500);	//Sizes the frame's width, and height
      setVisible(true);		//Makes GUI appear in window
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // exits JFrame application
         // uses qualified name for a class constant
         
   }// end GuessTheNumberGUI
   
   //The buildGUI method builds the GUI by getting the content pane, and then calls the methods to build the three panels.
   private void buildGUI()
   {
      contentPane = getContentPane(); //Gets the content pane
      buildNorthPanel(); //Calls the buildNorthPanel method
      buildCenterPanel(); //Calls the buildCenterPanel method
      buildSouthPanel(); //Calls the buildSouthPanel method
      	
      return;
   }//Ends buildGUI method.
   
   private void buildNorthPanel()
   {
      JPanel northPanel;
      northPanel = new JPanel();
      
      display = new JTextArea("How to play: \nFirst select your difficulty of easy, medium or hard. \nSecond, each difficulty gives you a different amount of time. \nEasy being 120 seconds, medium being 60 seconds, and hard being 30 seconds. \nIf you match alll the shapes in the alloted time, you win. If you do not, you lose.");
      display.setVisible(false);
      
      northPanel.add(display);
      contentPane.add("North", northPanel);
    
   }
   
   private void buildCenterPanel()
   {
      JPanel buttonPanel;
      buttonPanel = new JPanel();
      // buttonPanel.setLayout( new FlowLayout() ); // set frame layout
      
      // Instantiates buttons at Top of Main Menu (Easy, Medium, Hard);
      easyButton = new JButton("  Easy  ");
      mediumButton = new JButton("Medium");
      hardButton = new JButton("  Hard  ");
      
      buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
      
      // Adds Action Listeners to the buttons
      easyButton.addActionListener(this);
      easyButton.setActionCommand("OpenEasy");
      //easyButton.setEnabled(true);
      mediumButton.addActionListener(this);
      mediumButton.setActionCommand("OpenMedium");
      //mediumButton.setEnabled(true);
      hardButton.addActionListener(this);
      hardButton.setActionCommand("OpenHard");
      //hardButton.setEnabled(true);
      
      // Adds Buttons to the buttonPanel
      buttonPanel.add(Box.createRigidArea(new Dimension(100,80)));
      buttonPanel.add(easyButton);
      buttonPanel.add(Box.createRigidArea(new Dimension(100,10)));
      buttonPanel.add(mediumButton);
      buttonPanel.add(Box.createRigidArea(new Dimension(100,10))); 
      buttonPanel.add(hardButton);
      
      // Adds the buttonPanel to the contentPane
      contentPane.add("Center", buttonPanel);
   }
   
   private void buildSouthPanel()
   {
      JPanel exitPanel;
      exitPanel = new JPanel();
      exitPanel.setLayout(new BoxLayout(exitPanel, BoxLayout.Y_AXIS));
      
      // Instantiates buttons at Bottom OF Main Menu (Help & Exit)
      helpButton = new JButton("  Help  ");
      exitButton = new JButton("  Exit  ");
      
      // Adds Action Listeners to the buttons
      exitButton.addActionListener(this);
      //exitButton.setEnabled(true);  // Enables The Exit Button
      helpButton.addActionListener(this);
      //helpButton.setEnabled(true); // Enables The help Button
      
      // Adds Buttons to the exitPanel
      exitPanel.add(helpButton);
      //exitButton.add(Box.createVerticalStrut(25)); // Puts spacing between the buttons
      exitPanel.add(exitButton);
      
      // Creates rigid area in the JPanel 
      exitPanel.add(Box.createRigidArea(new Dimension(100, 100)));
      
      // Adds the exit Panel to the content pane
      contentPane.add("South", exitPanel);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      String difficulty = e.getActionCommand();
      
      // Code For Easy
      if(difficulty.equals("OpenEasy"))
      {
         dispose();
         time = "60";
         new ShapeShuffleGuiGame("Shape Shuffle GUI", time);
               
         
         //System.out.println("The time is " + time);
      
      }
      
      // Code For Medium
      if(difficulty.equals("OpenMedium"))
      {
         dispose();
         time = "30";
         new ShapeShuffleGuiGame("Shape Shuffle GUI", time);
         
         
         //System.out.println("The time is " + time);
      }
      
      // Code For Hard
      if(difficulty.equals("OpenHard"))
      {
         dispose();
         time = "15";
         new ShapeShuffleGuiGame("Shape Shuffle GUI", time);
         
         
         //System.out.println("The time is " + time);
      }
      
      
      if(e.getSource() == exitButton)
      {
         System.exit(0);
      }
      
      if(e.getSource() == helpButton)
      {
         display.setVisible(true);
      }
   
   
   }// End Action Performed
}// end ShapeShuffleGUI