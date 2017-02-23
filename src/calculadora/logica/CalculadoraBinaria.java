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
public class CalculadoraBinaria extends Calculadora{

    @Override
    public void sumar() {
        resultado=Integer.toBinaryString(Integer.valueOf(operando1,2)+Integer.valueOf(operando2,2));
    }

    @Override
    public void restar() {
        resultado=Integer.toBinaryString(Integer.valueOf(operando1,2)-Integer.valueOf(operando2,2));
    }

    @Override
    public void multiplicar() {
        resultado=Integer.toBinaryString(Integer.valueOf(operando1,2)*Integer.valueOf(operando2,2));
    }

    @Override
    public void dividir() {
        resultado=Integer.toBinaryString(Integer.valueOf(operando1,2)/Integer.valueOf(operando2,2));
    }
    
}
