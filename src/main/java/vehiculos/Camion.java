/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
/**
 *
 * @author Roger Vera
 */
public class Camion extends Vehiculo{
    private int ejes;
    private static int camiones;

    //constructor
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante,int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes=ejes;
        camiones++;
    }
    
    //getter & setter

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCamiones() {
        return camiones;
    }
    

    
    
    
}
