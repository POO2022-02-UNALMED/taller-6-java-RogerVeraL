/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
import java.util.ArrayList;
/**
 *
 * @author Roger Vera
 */
public class Camioneta extends Vehiculo{
    private boolean volco;
    private static int camionetas;
    private static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
    
    //constructor
    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int CantidadVehiculos, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante, CantidadVehiculos);
        this.volco = volco;
        camionetas++;
        listado.add(this);
    }
    
    //getter & setter

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCamionetas() {
        return camionetas;
    }
    
    
}
