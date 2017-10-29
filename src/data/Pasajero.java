/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author LUIS FELIPE DAVILA GOYENECHE
 */
public class Pasajero extends Usuario{
// Atributos
    private double contribucion;
    private Viaje viaje;
// Constructor

    public Pasajero(double contribucion, String Nombre, int Documento, Account account, Image Foto, Universidad universidad, String direccion) throws IOException {
        super(Nombre, Documento, account, Foto, universidad, direccion);
        this.contribucion = contribucion;
        this.viaje = null;
        
    }
  
// Metodos

    @Override
    public void SolicitarViaje(String Categoria) {

    }
       @Override
    public void finalizarViaje() {
        this.viaje = null;
    }
       @Override
    public File getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean addViaje(Viaje viaje){
    if(this.viaje == null){
    this.viaje = viaje;
    this.Historial.add(viaje);
    return true;
    }else{
    return false;  // Se debe informar que ya hay un viaje programado
    }
    
    }

 

 
}
