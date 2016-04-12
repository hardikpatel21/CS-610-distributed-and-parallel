package rmiclient;

import java.rmi.Remote;

public interface Project3ServerInterface extends Remote {
	public int calculateSum(int n ) throws java.rmi.RemoteException;
}
