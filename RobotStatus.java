import java.util.Observable;
import java.util.Observer;

/**
 * Abstract class RobotStatus - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

 public class RobotStatus 
{
    Observable observable;
    private String Location;
    private int battery;
    private String JobCompleted;
    
    public RobotStatus(){
        this.battery = battery;
        //Battery bt = new Battery();
        JobCompleted jb = new JobCompleted();
        
    }
    
    public void getBattery(){
         Battery bt;
        }
        
     public void getLocation(){
         Location loc;
        }
        
    public void getUpdate() {
        //bt.getState();
    }
    
    public void checkRobotStatus(){
            
    }
    
    public void update() {
        //bt.getState();
    }
   
   
}
