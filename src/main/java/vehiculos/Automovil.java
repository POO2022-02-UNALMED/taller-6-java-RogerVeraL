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
public class Automovil extends Vehiculo{
    private int puestos;
    private static int autos;
    private static ArrayList<Automovil> listado = new ArrayList<Automovil>();
    
    //constructor
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int CantidadVehiculos,int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante, CantidadVehiculos);
        this.puestos = puestos;
        autos++;
        listado.add(this);
    }

    //getter & setter

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    
    }

    public static int getAutos() {
        return autos;
    }



}
