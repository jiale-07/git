package Vista;
import Modelo.Monitores;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Consola {
        
    public int pidentero(String pregunta){
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(pregunta);
        num = teclado.nextInt();
        
        return num;
    }
    
    public String pidecadena(String pregunta){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(pregunta);
        String datos = teclado.nextLine();
        
        return datos;
    }
    
    public Monitores pidedatos(){
        Scanner teclado = new Scanner(System.in);
        Monitores monitor = new Monitores();
        
        monitor.setMarca(pidecadena("Dime la marca de Monitor: "));
        monitor.setModelo(pidecadena("Dime el modelo del Monitor: "));
        monitor.setColor(pidecadena("Dime el color del Monitor: "));
        monitor.setPulgadas(pidentero("Dime las pulgadas del monitor: "));
        System.out.println();
        
        return monitor;
    }
    
    public void mostrardatos(Monitores monitor){
        System.out.println("Marca: " + monitor.getMarca());
        System.out.println("Modelo: " + monitor.getModelo());
        System.out.println("Color: " + monitor.getColor());
        System.out.println("Pulgadas: " + monitor.getPulgadas());
        System.out.println("=======================================");
        
    }
    
}
