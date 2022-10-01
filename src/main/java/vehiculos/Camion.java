/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
import java.util.ArrayList;
import vehiculos.Vehiculo;
/**
 *
 * @author Roger Vera
 */
public class Camion extends Vehiculo{
    private int ejes;
    private static int camiones;
    private static ArrayList<Camion> listado = new ArrayList<Camion>();
    
    //constructor
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int CantidadVehiculos,int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante, CantidadVehiculos);
        this.ejes=ejes;
        camiones++;
        listado.add(this);
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
    
    public int camionVentas(){
        //Fabricante fabricaCamion=Vehiculo.getFabricante();
        int Nvehiculos=super.getCantidadVehiculos();
        
        return 0;
    }
    
    
    
}
