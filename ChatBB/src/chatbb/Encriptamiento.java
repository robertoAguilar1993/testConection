/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbb;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author GDB beto
 */
public class Encriptamiento {
    private static ArrayList msjAski =new ArrayList();
    private static ArrayList valorAleatorio = new ArrayList();
    private static boolean statusMensajeNewU1=false;
    private static boolean statusMensajeNewU2=false;
    private static String msjEncriptado;
    
    
    public void setMensaje(String mensaje){
        msjAski.clear();
        valorAleatorio.clear();
        String msjEncriptado="";
        int numeroAleatorio = 0;
        int numeroEncriptado = 0;

        for (int i = 0; i < mensaje.length(); i++) {
            numeroAleatorio = (int) (Math.random()*10)+1;
            numeroEncriptado = numeroAleatorio + (int)mensaje.charAt(i);
            msjEncriptado=msjEncriptado+""+ numeroEncriptado;
            msjAski.add(numeroEncriptado);
            valorAleatorio.add(numeroAleatorio);
            Encriptamiento.msjEncriptado=msjEncriptado;
        }

        
    }
    public String getMensaje(){

        String mensajeDes="";
        
        for (int i = 0; i < msjAski.size(); i++) {
            mensajeDes= mensajeDes+""+((char) ((int)msjAski.get(i)-(int)valorAleatorio.get(i)));                   
        }

        return mensajeDes;
    }

    // para saber si hay mensaje del usuario 1
    public boolean getStatusMsjUsuario1(){
        return statusMensajeNewU1;
    }
    public void setStatusMsjUsuario1(boolean status){
        this.statusMensajeNewU1 = status;
    }
    
    //para saner si hay mensaje del usuario2
     public boolean getStatusMsjUsuario2(){
        return statusMensajeNewU2;
    }
    public void setStatusMsjUsuario2(boolean status){
        this.statusMensajeNewU2 = status;
    }
    
    
    public String getMensajeEncriptado(){
        return msjEncriptado;
    }
    
    

    
    
}
