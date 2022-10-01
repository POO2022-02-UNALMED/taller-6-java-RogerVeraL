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
public class Fabricante {
    private String nombre;
    private Pais pais;
    public static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
    
    //constructor

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    //getter & setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public static void agregarFabricante(Fabricante fabricante) {
		listado.add(fabricante);
	}
}
