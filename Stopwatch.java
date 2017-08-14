
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class Stopwatch  
{
   static int interval;
   static Timer timer;
   boolean zero=false;

   public boolean Stopwatch(String secs, JLabel t) 
   {
      
      int delay = 1000;
      int period = 1000;
      timer = new Timer();
      interval = Integer.parseInt(secs);
      t.setText(secs);
      timer.scheduleAtFixedRate
      (new TimerTask() 
         {
         
            public void run() 
            {
               t.setText(String.valueOf(setInterval()));
            
            }
         }, delay, period);
      return zero;
   }

   private final int setInterval() 
   {
      if (interval == 1)
         timer.cancel();
         timerEnd();
      return --interval;
   }
   
   public void stopTimer()
   {
      timer.cancel();
   }
   public void timerEnd()
   {
      zero = true;
   }
}