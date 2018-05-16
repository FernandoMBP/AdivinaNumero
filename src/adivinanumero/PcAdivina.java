/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

import java.util.Random;

/**
 Clase que posee los metodos para adivinar el numero pensado por la persona 
 */
public class PcAdivina {
    
    private int numero=0;
    private Random r = new Random();
    
    
    public int inicializar(){
        numero = r.nextInt(101);
        return numero;
    }
    
    public int mayor(int valor){
       int nuevoValor = 0; 
       return nuevoValor; 
    }
    
    public int menor(int valor){
       int nuevoValor = 0; 
       return nuevoValor;
    }
    
    public void igual(){
        
    }
}
