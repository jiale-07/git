package Controlador;
import Vista.Consola;
import Modelo.Monitores;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args) {
        Consola a = new Consola();
        ArrayList<Monitores> arrMonitor = new ArrayList<Monitores>();
        
        for(int i = 0; i<3; i++){
            arrMonitor.add(a.pidedatos());
        }
        
        for (Monitores m : arrMonitor){
            a.mostrardatos(m);        
        }
    }
    
}
