/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Roger Vera
 */
public class Automovil extends Vehiculo{
    private int puestos;
    private static int autos;
    
    //constructor
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante,int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        autos++;
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
