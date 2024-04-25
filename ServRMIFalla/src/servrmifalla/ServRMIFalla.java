package servrmifalla;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author jpala
 */

public class ServRMIFalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry elRegistro = LocateRegistry.createRegistry(1025);
            Convertidor laInstancia = new Convertidor();
            elRegistro.rebind("convi", laInstancia);
            System.out.println("Objeto remoto listo para usarse ...");
        } catch (Exception e) {
        }
    }
    
}
