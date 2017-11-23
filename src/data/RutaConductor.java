/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author acer
 */
public class RutaConductor {
    private String origen;
    private String Destino;
    private String Ruta;
    private boolean Desvio;
    private int puestosLibres;
    private float precio;
    private Date horaSalida;

    public RutaConductor(String origen, String Destino, String Ruta, boolean Desvio, int puestosLibres, float precio, Date horaSalida) {
        this.origen = origen;
        this.Destino = Destino;
        this.Ruta = Ruta;
        this.Desvio = Desvio;
        this.puestosLibres = puestosLibres;
        this.precio = precio;
        this.horaSalida = horaSalida;
    }
    
            }