package test;

import modelo.*;

public class Test {
    public static void main(String[] args) {
        
        
        PuedeCantar cantantes[] = new PuedeCantar[3];
        
        PuedeCantar pepe = new Persona();
        cantantes[0]=pepe;
        
        PuedeCantar claudio = new Gallo();
        cantantes[1]=claudio;
        
        PuedeCantar piolin = new Canario();
        cantantes[2]=piolin;
        
        MostrarCantantes(cantantes);
    }
    
    public static void MostrarCantantes(PuedeCantar cantante[]){
        for(PuedeCantar p: cantante){
            p.cantar();
        }
    }
}
