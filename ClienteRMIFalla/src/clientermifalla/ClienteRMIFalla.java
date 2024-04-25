package clientermifalla;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servrmifalla.InterfazConvertidor;
/**
 *
 * @author jpala
 */
public class ClienteRMIFalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",1025);
            InterfazConvertidor objRemoto = (InterfazConvertidor) registro.lookup("convi");
            System.out.println("La suma es: "+objRemoto.s_suma(25,5));
            System.out.println("La resta es: "+objRemoto.r_resta(25,5));
            System.out.println("La division es: "+objRemoto.d_divi(10,2));
            System.out.println("La multiplicacion es: "+objRemoto.m_multi(2,2));
        } catch (Exception e) {
            System.out.println("Error"+ e.getMessage());
        }
    }
    
}
