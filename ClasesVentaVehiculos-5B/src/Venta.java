/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axela
 */
public class Venta {
    private int cantidad;
    private Vehiculo vehiculo;
    private Cliente cliente;
    
    public Venta(int cantidad, Vehiculo vehiculo, Cliente cliente){
    this.cantidad=cantidad;
    this.vehiculo=vehiculo;
    this.cliente=cliente;
    }
}
