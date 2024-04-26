package clientermifalla;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servrmifalla.InterfazConvertidor;
import servrmifalla.ServRMIFalla;
/**
 *
 * @author 
 
 Andrea Morales Chávez 21550747
Jesús Emanuel Palacios Mendias 21550764
Adrián Fernando Quintana Venegas 21550763
Karen Adriana Mendoza Aragón C20061169

 * 
 * 
 */
public class INICIO {

    /**
Andrea Morales Chávez 21550747
Jesús Emanuel Palacios Mendias 21550764
Adrián Fernando Quintana Venegas 21550763
Carmen Alejandra Ortega Solís 21550751
Karen Adriana Mendoza Aragón C20061169

     */
    public static void main(String[] args) {
        
        ServRMIFalla.main(args);
      
        ClienteFrame c = new ClienteFrame();
        
        c.setVisible(true);
        
        
        /* try {
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",1025);
            InterfazConvertidor objRemoto = (InterfazConvertidor) registro.lookup("convi");
            System.out.println("La suma es: "+objRemoto.s_suma(25,5));
            System.out.println("La resta es: "+objRemoto.r_resta(25,5));
            System.out.println("La division es: "+objRemoto.d_divi(10,2));
            System.out.println("La multiplicacion es: "+objRemoto.m_multi(2,2));
        } catch (Exception e) {
            System.out.println("Error"+ e.getMessage());
        }
        */
    }
    
}
