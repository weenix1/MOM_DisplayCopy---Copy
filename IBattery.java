import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Write a description of interface IBattery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IBattery extends Remote
{
    public int getState() throws RemoteException;
    public int getDuration() throws RemoteException;
    public boolean getBatteryLevel() throws RemoteException;
    //public boolean update() throws RemoteException;
}
