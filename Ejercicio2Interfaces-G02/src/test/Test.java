package test;

import modelo.*;

public class Test {
    public static void main(String[] args) {
        
        //IOperacion calculadora = new CalculadoraAutomatica();
        IOperacion calculadora = new CalculadoraManual();

        
        System.out.println("Multiplicacion= " + calculadora.multiplicacion(5, 5));
        System.out.println("Division= " + calculadora.division(25, 5));
        System.out.println("Potencia= " + calculadora.potencia(2, 5));
        
        
    }
}
