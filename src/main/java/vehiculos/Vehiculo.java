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
public class Vehiculo {
    private String placa;
    private int puertas,velocidadMaxima;
    private String nombre;
    private int precio,peso;
    private String traccion;
    private Fabricante fabricante;
    private int CantidadVehiculos; 
    private static ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
     
     //constructor

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int CantidadVehiculos) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        this.CantidadVehiculos = CantidadVehiculos;
        listado.add(this);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public void setCantidadVehiculos(int CantidadVehiculos) {
        this.CantidadVehiculos = CantidadVehiculos;
    }
    
    public static String vehiculosPorTipo(){       
        String cad =  "Automoviles: " + Automovil.getAutos()+
                "\nCamionetas: "+Camioneta.getCamionetas()+
                "\nCamiones: "+Camion.getCamiones();
        return cad;
    }
    
    //metodos
    
    public static Vehiculo fabricaMayorVentas() {
        Vehiculo fabMventas = listado.get(7);
        for (Vehiculo p : listado) {
            if (p.getCantidadVehiculos()>fabMventas.getCantidadVehiculos()){
                fabMventas=p;
            }
        }return fabMventas;
    }

    public static Pais paisMasVendedor() {
	Vehiculo fabM_ventas = fabricaMayorVentas();
	return fabM_ventas.getFabricante().getPais();
	}       
     
}
