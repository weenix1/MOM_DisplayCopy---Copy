import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
/**
 * Abstract class Checker - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
 public abstract class Checker extends Observable //implements DisplayData
{
    private ArrayList<Observer> observes;
    //private String state;
    //private String robotStatus;
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Checker() {
     
    }
    
    
    public void attach(Observer obs){
        //observers.add(obs);
    }
    
    public void getLocation(){
    }
     
    public boolean getJobCompleted(){
      return true;
    }
    
    public void detach(Observer obs){
       //observers.remove(obs);
    }
    
   public void getUpdate(){
       
    }
    
}
