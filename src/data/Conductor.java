/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author LUIS FELIPE DAVILA GOYENECHE
 */
public class Conductor extends Usuario{
// Atributos
    private String Placa;
    private Image Licencia;
    private double Precio;
    private ArrayList<Universidad> Disponibilidad;
    private Viaje viaje; 
// Constructor;

    public Conductor(String Placa, Image Licencia, double Precio, String Nombre, int Documento, Account account, Image Foto, Universidad universidad,  String direccion) throws IOException {
        super(Nombre, Documento, account, Foto, universidad, direccion);
        this.Placa = Placa;
        this.Licencia = Licencia;
        this.Precio = Precio;
        this.Disponibilidad = new ArrayList<>();
        this.viaje = null;
    }
    
// Metodos
    @Override
    public void SolicitarViaje(String Categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void finalizarViaje() {
      this.viaje = null;
    }
    @Override
    public File getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void CrearViajeC(String horaSalida, int cantidad){
    this.viaje = new ViajeC(this,horaSalida,cantidad); 
    }
    
    public void CrearViajeU(Conductor conductor, String horaSalida, int cantidad){
    this.viaje = new ViajeU(this, horaSalida, cantidad);
    }
    
    public boolean ConsolidarViaje(){ // Se consolida un viaje cuando exista un pasajero almenos
     if(this.viaje.cuposLlenos > 0){
    this.viaje.setEstado(true);
    this.Historial.add(this.viaje);
     return true;
     }else{
     return false;  // Se debe mostrar en pantalla que aun no hay pasajeros realxciondos al viaje.
     }
    }
  
 
}
