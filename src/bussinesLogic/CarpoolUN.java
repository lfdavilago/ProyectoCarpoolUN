/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinesLogic;

import data.Conductor;
import data.Universidad;
import data.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import ui.Principal;
import ui.Registro;

/**
 *
 * @author LUIS FELIPE DAVILA GOYENECHE
 */
public class CarpoolUN {
   private ArrayList<Usuario> Usuarios;
   private ArrayList<Universidad> Universidades;
   // no lo termino porque supongo que esto lo hace el sevidor tocara preguntar al profesor
   
   public static void main(String[] arg) throws IOException{
   
   Controlador c = new Controlador();
   c.setCconductor(new Conductor("d",34,null,"ded"));
   Principal   a =  new Principal(c);
   a.main();
   
   }
   public static void RegistrarUsuario(){
   
   
   
   }
   public void addUsuario(Usuario u){
   this.Usuarios.add(u);
   }
}
