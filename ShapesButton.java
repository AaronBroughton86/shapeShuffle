import java.awt.*;
import javax.swing.*;

// extends JButton or JFrame seems to work, I would actually consider putting this into the file SHapeShuffleGUIGameScreen itself, so we can do what we need to from there with the images. Also to see why they don't load right.... the references are right
public class ShapesButton extends JButton{


 // Instantiates Images and JButtons for ShapeButtons()
   private ImageIcon image1;
   private JButton jButton1;
   private ImageIcon image2;
   private JButton jButton2;
   private ImageIcon image3;
   private JButton jButton3;
   private ImageIcon image4;
   private JButton jButton4;
   private ImageIcon image5;
   private JButton jButton5;
   private ImageIcon image6;
   private JButton jButton6;
   private ImageIcon image7;
   private JButton jButton7;
   private ImageIcon image8;
   private JButton jButton8;
   //private ImageIcon image9;
   //private JButton jButton9;
   // End
    

       
   private void ShapesButton()
   {
     //
     
     image1 = new ImageIcon(getClass().getResource("images/shape1.jpg"));
     
     jButton1 = new JButton(image1);
     add(jButton1);
     
     image2 = new ImageIcon(getClass().getResource("images/shape2.jpg"));
     
     jButton2 = new JButton(image2);
     add(jButton2);
     
     image3 = new ImageIcon(getClass().getResource("images/shape3.jpg"));
     
     jButton3 = new JButton(image3);
     add(jButton3);

     image4 = new ImageIcon(getClass().getResource("images/shape4.jpg"));
     
     jButton4 = new JButton(image4);
     add(jButton4);
     
     image5 = new ImageIcon(getClass().getResource("images/shape5.jpg"));
     
     jButton5 = new JButton(image5);
     add(jButton5);
     
     image6 = new ImageIcon(getClass().getResource("images/shape6.jpg"));
     
     jButton6 = new JButton(image6);
     add(jButton6);
     
     image7 = new ImageIcon(getClass().getResource("images/shape7.jpg"));
     
     jButton7 = new JButton(image7);
     add(jButton7);
     
     image8 = new ImageIcon(getClass().getResource("images/shape8.jpg"));
     
     jButton8 = new JButton(image8);
     add(jButton8);
     
     // image9 = new ImageIcon(getClass().getResource("images/shape9.jpg"));
     
     // jButton9 = new JButton(image9);
     // add(jButton9);

   }



}
// ImageTutorial = ShapesButton

/* Makes the whole Frame the first image and a JButton, but if chance extends JFrame to JButton nothing shows
public class ShapesButton extends JFrame{

   private ImageIcon image1;
   private JButton jButton1;
   private ImageIcon image2;
   private JButton jButton2;
   
   ShapesButton()
   {
     //
     
     image1 = new ImageIcon(getClass().getResource("images/shape1.jpg"));
     
     jButton1 = new JButton(image1);
     add(jButton1);
     
     image2 = new ImageIcon(getClass().getResource("images/shape2.jpg"));
     
     jButton2 = new JButton(image2);
     add(jButton2);
   }
   
   
   public static void main (String args[]){
      ShapesButton gui = new ShapesButton();
      // gui.setDeaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.setVisible(true);
      gui.pack();
      gui.setTitle("Nerds");
   }
   
   
   
}
*/


/* This Code Works, But only brings in the fist image and resizes the window
public class ShapesButton extends JFrame{

   private ImageIcon image1;
   private JLabel label1;
   private ImageIcon image2;
   private JLabel label2;
   
   ShapesButton()
   {
     //
     
     image1 = new ImageIcon(getClass().getResource("images/shape1.jpg"));
     
     label1 = new JLabel(image1);
     add(label1);
     
     image2 = new ImageIcon(getClass().getResource("images/shape2.jpg"));
     
     label2 = new JLabel(image2);
     add(label2);
   }
   
   
   public static void main (String args[]){
      ShapesButton gui = new ShapesButton();
      // gui.setDeaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.setVisible(true);
      gui.pack();
      gui.setTitle("Nerds");
   }
   
   
   
}
*/

































/*
String path=System.getProperty("user.dir")+File.separatorChar+"images"+File.separatorChar+"first.jpg";
try{
URL url=new URL(path);
}
catch(Exception exc){
}

public class ShapesButton extends JButton
{
	
   // ImageIcon A,B,C,D,E,F,G,H;
	
   BufferedImage img;
   
   public ShapesButton(){
   setSize(600, 400);
   setVisible(true);
   loadImage("/images/shape1.jpg");
   
   }
   
	private void loadImages(String str)
   {
      try
      {
        img = ImageIO.read(ShapesButton.class.getResorce(str));
      } 
      catch (IOException e) 
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
	
   protected void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.drawImage(img, 0, 0, 600, 400, this);
   }
   
   
   public static void main(String[] args) 
   {
      // TODO Auto-generated method stub
      SwingUtilities.invokeLater(new Runnable()
      {
      
         @Override
         public void run(){
            //
               JFrame rm = new JFrame();
               frm.setSize
   
   }
   
      
}
   */
   
   
   
   
   
   
   
   
   
