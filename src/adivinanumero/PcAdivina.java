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
    int nuevoValor = 0;
    private Random r = new Random();
    private int contadorMayor = 0;
    private int contadorMenor = 0;
    
    
    public int inicializar(){
        numero = r.nextInt(101);
         //Cada vez que inicio el juego el programa genera un nuevo valor al azar entre 0 y 100 para que alguien adivine
        return numero;
    }
    
    public int mayor(int valor){
       if(contadorMayor == 0)
           contadorMayor++;
       if(contadorMayor>=5){
           nuevoValor = valor + 5;
           contadorMayor++;
       }
       if(contadorMayor>=10){
           nuevoValor = valor + 1;
           contadorMayor++;
       }
       else{
           nuevoValor = valor + (20/contadorMayor);
           contadorMayor++;
       }
       return nuevoValor; 
    }
    
    public int menor(int valor){
       if(contadorMenor == 0)
           contadorMenor++;
       if(contadorMenor>=5){
           nuevoValor = valor - 5;
           contadorMenor++;
       }
       if(contadorMenor>=10){
           nuevoValor = valor - 1;
           contadorMenor++;
       }
       else{
           nuevoValor = valor - (20/contadorMenor);
           contadorMenor++;
       }
       return nuevoValor;
    }
    
    public void igual(){
        contadorMayor = 0;
        contadorMenor = 0;
    }

    public int getContadorMayor() {
        return contadorMayor;
    }

    public int getContadorMenor() {
        return contadorMenor;
    }
    
    
}
