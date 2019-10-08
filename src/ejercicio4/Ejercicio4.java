/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author oracle
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           DataInputStream leer =new DataInputStream(new BufferedInputStream(new FileInputStream("/home/oracle/Desktop/ProbaExer4/texto3.txt")));
            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
            DataOutputStream escribir =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/oracle/Desktop/ProbaExer4/texto3.txt")));
            //Ver si hay algo con el metodo available
            int c;
            //Hay que escribir primero para luego leer. No es como en los ficheros de los ej. anteriores
            escribir.writeUTF("o tempo está xélido");
            escribir.writeUTF("o tempo está xélido");
            escribir.close();
            //Mientras tenga algo que leer que escriba
            while ((c = leer.available())>0 ) {
               //Que lea todo lo que acabamos de añadir
               String cadea = leer.readUTF();     
                System.out.println(cadea);
            } 
            leer.close();
            
        } catch (Exception e) {
        }
    }
    
}
