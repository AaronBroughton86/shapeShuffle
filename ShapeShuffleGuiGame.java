// Due: 
// Email: 
 
import javax.swing.*;	// Swing GUI components 
import java.awt.*;		// Container class
import java.awt.event.*;	// ActionListener
import java.util.Random;




public class ShapeShuffleGuiGame extends JFrame implements ActionListener
{
   Stopwatch countdown = new Stopwatch();
   
   boolean failGame = false;
   private Container contentPane;
   private static String files[]= {"shape1.jpg", "shape2.jpg",
        "shape3.jpg", "shape4.jpg",
        "shape5.jpg", "shape6.jpg", "shape7.jpg", "shape8.jpg"};
   private ImageIcon imagen;
   private static JButton shapesButton[]; //
   private JButton menuButton;
   private int numButtons;
   private ImageIcon picture[];
   private Timer myTimer;
    
   int numClicks = 0;
   int oddClickIndex = 0;
   int currentIndex = 0; 
            
   public ShapeShuffleGuiGame(String title, String time) 
   {
      
      this.buildGUI(time);               //Builds the GUI
      this.setTitle("shape shuffle");         //Sets the title.
      this.setSize(600, 400);        //Sizes the frame's width, and height
      this.setVisible(true);         //Makes GUI appear in window
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // pack();
      setVisible(true);
      myTimer = new Timer(1000, new TimerListener());
      
        
   }

   private void buildGUI(String time) 
   {
      contentPane = getContentPane();
      this.buildNorthPanel(time);
      this.buildSouthPanel();
        
   }

   private void buildNorthPanel(String time) 
   {
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));// set the button to the right of the screen
      JLabel timeLabel = new JLabel(time);
      
      //This isn't doing anything like we want it to. 
      failGame = countdown.Stopwatch(time, timeLabel);
      
      //This Isn't doing anything
      if (failGame)
      {
         dispose();
         new ShapeShuffleGUIWinLose("Shape Shuffle");
       }
       
      buttonPanel.add(timeLabel); 
      contentPane.add("North", buttonPanel);// Adds the exit Panel to the content pane
       
             
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(2,0,10,50));
      imagen = new ImageIcon("closed.JPG");
      numButtons = 5 * 2;
      shapesButton = new JButton[numButtons];
      picture = new ImageIcon[numButtons];
        
      for (int i = 0, j = 0; i < 5; i++) 
      {
         picture[j] = new ImageIcon(files[i]);
         shapesButton[j] = new JButton("");
         shapesButton[j].addActionListener(new ImageButtonListener());
         shapesButton[j].setIcon(imagen);
         panel.add(shapesButton[j++]);
            
            
         picture[j] = picture[j - 1];
         shapesButton[j] = new JButton("");
         shapesButton[j].addActionListener(new ImageButtonListener());
         shapesButton[j].setIcon(imagen);
         panel.add(shapesButton[j++]);
            
      }
        // randomize icons array
      Random gen = new Random();
      for (int i = 0; i < numButtons; i++) 
      {
         int rand = gen.nextInt(numButtons);
         ImageIcon temp = picture[i];
         picture[i] = picture[rand];
         picture[rand] = temp;
      }
      add(panel);
   
   }
        
   private void buildSouthPanel() 
   {
      JPanel buttonPanel2 = new JPanel();
      buttonPanel2.setLayout(new FlowLayout(FlowLayout.LEFT)); // set the button to the left of the screen 
      JButton menuButton = new JButton("Menu");
      menuButton.addActionListener(this);
      menuButton.setActionCommand("Menu");
      buttonPanel2.add(menuButton);
      
      contentPane.add("South",buttonPanel2); // Adds the exit Panel to the content pane
   }
    //in group
    
   public void actionPerformed(ActionEvent e)
   {
      String menu = e.getActionCommand();
      if(menu.equals("Menu"))
      {
         dispose();
         countdown.stopTimer();
         new ShapeShuffleGUIIntro("Shape Shuffle GUI");
      }
     
      
   }

   private class TimerListener implements ActionListener 
   {
   
      public void actionPerformed(ActionEvent e) 
      {
        
         shapesButton[currentIndex].setIcon(imagen);
         shapesButton[oddClickIndex].setIcon(imagen);
         myTimer.stop();
      }
   }
   private class ImageButtonListener implements ActionListener 
   {
   
      public void actionPerformed(ActionEvent e) 
      {
            
           
         if (myTimer.isRunning())
            return;
            
         numClicks++;
            //display the number of clicks in the console
         System.out.println(numClicks);
            
            // which button was clicked?
         for (int i = 0; i < numButtons; i++) 
         {
            if (e.getSource() == shapesButton[i]) 
            {
               shapesButton[i].setIcon(picture[i]);
               currentIndex = i;
            }
         }
            
            // check for even click
         if (numClicks % 2 == 0) 
         {
                // check whether same position is clicked twice!
            if (currentIndex == oddClickIndex) 
            {
               numClicks--;
               return;
            }
                // are two images matching?
            if (picture[currentIndex] != picture[oddClickIndex]) 
            {
                    // show images for 1 sec, before flipping back
               myTimer.start(); 
            }
         } 
         else 
         {
                // we just record index for odd clicks
            oddClickIndex = currentIndex;
         }
            
                           
      }
   }
   
   /*public void itemStateChanged(ItemEvent e) 
   {
      if (e.getSource() == timeLabel)
      {
         if (timeLabel.getText() == "0")
         {
            dispose();
            new ShapeShuffleGUIWinLose("Shape Shuffle");
         }
      }
      
   }*/
   
}