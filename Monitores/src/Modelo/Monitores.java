package Modelo;

/**
 *
 * @author Gabriel Estevez
 */
public class Monitores {
    
    public int Pulgadas;
    public String Modelo;
    public String Marca;
    public String Color;
    
    public Monitores(){
        this.Color = "";
        this.Marca = "";
        this.Modelo = "";
        this.Pulgadas = 0;
    }
    
    public Monitores (String Modelo, String Marca, String Color, int Pulgadas){
        this.Color = Color;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Pulgadas = Pulgadas;
    }

    public int getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(int Pulgadas) {
        this.Pulgadas = Pulgadas;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    
}
