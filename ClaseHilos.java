package multiplos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Eva H
 */
public class ClaseHilos extends Thread {
    //se crea obtjeto de la otra clase, para pasar el método en el run
    PintaMultiplos pinta;
    
    public ClaseHilos (PintaMultiplos p){  //constructor
        this.pinta=p;
    }
    
        @Override
    public void run(){   
      pinta.hallaMultiplo();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClaseHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }  

}  