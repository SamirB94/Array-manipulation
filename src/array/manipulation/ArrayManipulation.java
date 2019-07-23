
package array.manipulation;

import java.util.Arrays;


public class ArrayManipulation {

    public static void main(String[] args) {
        
          int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
    Arrays.sort(array);
    int ukupnoPozitivnih = 0;
    int ukupnoNegativnih = 0;
    
    for(int i = 0; i<array.length; i++){
        if(array[i] > 0){
            ukupnoPozitivnih++;
        }
        if(array[i]<0){
            ukupnoNegativnih++;
        }
    }
    
     
     int[] pozitivni = new int[ukupnoPozitivnih]; //nakon prebrojavanja znamo koliko ima pozitivnih...
     
     int pozicijaPozitivni = 0;
       
     int[] negativni = new int[ukupnoNegativnih]; //nakon prebrojavanja znamo koliko ima pozitivnih...
     int pozicijaNegativni = 0;
       
       
        for(int i=0; i<array.length; i++){
            //ako je vrijednost veca od 0 unesi je u 'pozitivni' i uvecaj 'pozicijaPozitivni'...
            if(array[i]>0){
                pozitivni[pozicijaPozitivni] = array[i];
                pozicijaPozitivni ++;
            }
           
            //ako je manja veca od 0 unesi je u 'negativni' i uvecaj 'pozicijaNegativni'...
            if(array[i] < 0 ){
                negativni[pozicijaNegativni] = array[i];
                pozicijaNegativni ++;
            }
        }
       
 
        System.out.println("Pozitivni brojevi: ");
        //u nizu 'pozitivni' dodali smo toliko elemenata koliko je vrijednost 'pozicijaPozitivni'...
        for(int i = 0; i < pozicijaPozitivni; i++){
            System.out.print(pozitivni[i] + ",");
        }
       
        System.out.println(" ");
        System.out.println(" ");
       
       
        System.out.println("Negativni brojevi: ");
        //u nizu 'negativni' dodali smo toliko elemenata koliko je vrijednost 'pozicijaNegativni'...
        for(int i = 0; i < pozicijaNegativni; i++){
            System.out.print(negativni[i] + ",");
        }
       
        System.out.println(" ");
        System.out.println(" ");
             
  
        
     for(int i=1; i<array.length; i++){
         if(array[i-1]==array[i]){
             System.out.println("Duplikat je: " + array[i]);
         }
     }
         
        
        
    }
    
}
