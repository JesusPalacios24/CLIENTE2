package servrmifalla;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
/**
 *
 * @author jpala
 */

public class Convertidor 
        extends UnicastRemoteObject 
         implements InterfazConvertidor
{
    public Convertidor() throws RemoteException{
        super();
    }

    @Override
    public double s_suma (double num1, double num2) throws RemoteException {
        double s_resul;
        s_resul = num1 + num2;
        return s_resul;
    }

    @Override
    public double r_resta (double num1, double num2) throws RemoteException {
        double r_resul;
        r_resul = num1 - num2;
        return r_resul;
    }
    
    @Override
    public double d_divi(double num1, double num2) throws RemoteException {
        double d_resul;
        d_resul = num1 / num2;
        return d_resul;
    }
    
    @Override
    public double m_multi (double num1, double num2) throws RemoteException {
        double m_resul;
        m_resul = num1 * num2;
        return m_resul;
    }
}
