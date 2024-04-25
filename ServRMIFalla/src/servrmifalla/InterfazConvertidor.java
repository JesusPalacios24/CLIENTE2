package servrmifalla;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jpala
 */
public interface InterfazConvertidor extends Remote{
    double s_suma(double num1, double num2) throws RemoteException;
    double r_resta(double num1, double num2) throws RemoteException;
    double d_divi(double num1, double num2) throws RemoteException;
    double m_multi(double num1, double num2) throws RemoteException;
}
