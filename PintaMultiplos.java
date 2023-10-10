package multiplos;

/**
 * @author Eva H
 */

//esta clase sólo tiene el método syncronizado....
public class PintaMultiplos{
   
     public synchronized void hallaMultiplo(){
        System.out.println ("Soy el hilo " + Thread.currentThread().getName() + " los primeros multiplos son: "); 
        
        for (int i = 1; i < 6; i++) {
            System.out.println ("Multiplo[" + i +"]: " + Integer.parseInt(Thread.currentThread().getName())*i);  
        }
        System.out.println ("Fin de los multiplos de " + Thread.currentThread().getName()); 
    } 
    
    
}



    

