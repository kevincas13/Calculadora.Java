/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.logica;

/**
 *
 * @author Estudiantes
 */
public abstract class Calculadora {

    String operando1;
    String operando2;
    String resultado;

    public void setOperando1(String valor) {
        operando1 = valor;
    }

    public void setOperando2(String valor) {
        operando2 = valor;
    }

    public String getresultado() {
        return resultado;
    }
    
    public abstract void sumar();
    
    public abstract void restar();
    
    public abstract void multiplicar();
    
    public abstract void dividir();

}
