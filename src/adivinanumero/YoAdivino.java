/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

import java.util.Random;
/**
 Clase encargada de pensar un numero para que nosotros adivininemos 
 */
public class YoAdivino {
    private int numero=0;
    private Random r = new Random();
    
    
    public int inicializar(){
        numero = r.nextInt(101);
        //Cada vez que inicio el juego el programa genera un nuevo valor al azar entre 0 y 100 para que alguien adivine
        return numero;
    }
    
    public int evaluarNumero(int numeroPensado, int numeroPersona){
        if(numeroPensado > numeroPersona)
            return 1;
        if(numeroPensado < numeroPersona)
            return -1;
        if(numeroPensado == numeroPersona)
            return 0;
        else
            return 10;
    }
    
}
