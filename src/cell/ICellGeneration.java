package cell;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ICellGeneration extends Remote {
    public void setGeneration(List<Cell> cells) throws RemoteException;
    public List<Cell> getGeneration() throws RemoteException;
}
