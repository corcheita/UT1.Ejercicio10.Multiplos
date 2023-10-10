package multiplos;

/**
 * @author Eva H
 */
public class Principal {

    public static void main(String[] args) {
        PintaMultiplos pm = new PintaMultiplos();
        
            ClaseHilos th1 = new ClaseHilos(pm);
            th1.setName(String.valueOf(1));
            ClaseHilos th2 = new ClaseHilos(pm);
            th2.setName(String.valueOf(2));
            ClaseHilos th3 = new ClaseHilos(pm);
            th3.setName(String.valueOf(3));

           
            th1.start();
            th2.start();
            th3.start();
          
  
                
           
       
       
        }
       
    }
    

