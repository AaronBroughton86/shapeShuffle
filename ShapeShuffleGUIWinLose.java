//ShapeShuffle GUI class
//Name: Aaron Broughton, Nathan Oberdick, Fabian Vlica, Austin Brown
//Date: 11/9/16
//Lab #5
//Due Date: 11/16/16
//Email: nko5019@psu.edu
//File: ATMAppletGUI.java
//Purpose: This class is used to create a ATM-Like GUI that contains several element for a later revision with functionality.

import javax.swing.*;	// Swing GUI components 
import java.awt.*;		// Container class
import java.awt.event.*;	// ActionListener

public class ShapeShuffleGUIWinLose extends JFrame implements ActionListener 
{
   private JButton playAgainButton;
   private JButton exitButton;
   private Container contentPane;
   private JLabel blankSpace;

   public ShapeShuffleGUIWinLose (String title)
   {
      buildGUI();          //Builds the GUI
      setTitle(title);     //Sets the title.
      setSize(500, 400);	//Sizes the frame's width, and height
      setVisible(true);		//Makes GUI appear in window
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // exits JFrame application
         // uses qualified name for a class constant
   }// end GuessTheNumberGUI

   //The buildGUI method builds the GUI by getting the content pane, and then calls the methods to build the three panels.
   private void buildGUI()
   {
      contentPane = getContentPane(); //Gets the content pane
      buildNorthPanel();
      buildCenterPanel(); //Calls the buildCenterPanel method
      buildEastPanel();
      buildWestPanel();
      buildSouthPanel(); //Calls the buildSouthPanel method
      	
      return;
   }//Ends buildGUI method.
   
   private void buildNorthPanel()
   {
      JPanel northPanel;
      
      northPanel = new JPanel();
      
      blankSpace = new JLabel();
      
      northPanel.add(blankSpace);
      contentPane.add("North", northPanel);
   }

   //Builds North Panel
   private void buildCenterPanel()
   {
      JPanel centerPanel; //Declares North Panel
      
      centerPanel = new JPanel(); //Instantiates North Panel as a new JPanel
      centerPanel.setLayout(new GridLayout(0, 1));
      playAgainButton = new JButton("Play Again");
      playAgainButton.addActionListener(this);
      playAgainButton.setActionCommand("Menu");
      
      //Adds the North Panel to the Content Pane
      centerPanel.add(playAgainButton);
      
      contentPane.add("Center", centerPanel);
   }
   
   private void buildEastPanel()
   {
      JPanel eastPanel;
      
      eastPanel = new JPanel();
      
      blankSpace = new JLabel();
      
      eastPanel.add(blankSpace);
      contentPane.add("East", eastPanel);
   }   
   
   private void buildWestPanel()
   {
      JPanel westPanel;
      
      westPanel = new JPanel();
      
      blankSpace = new JLabel();
      
      westPanel.add(blankSpace);
      contentPane.add("West", westPanel);
   }
   
   private void buildSouthPanel()
   {
      JPanel southPanel;
      
      southPanel = new JPanel();
      
      exitButton = new JButton("Exit");      
      exitButton.addActionListener(this);
      exitButton.setEnabled(true);
      
      southPanel.add(exitButton);
      
      contentPane.add("South", southPanel);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      String menu = e.getActionCommand();
      
      if(menu.equals("Menu"))
      {
         dispose();
         new ShapeShuffleGUIIntro("Shape Shuffle GUI");
      }
   }
}   