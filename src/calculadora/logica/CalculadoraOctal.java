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
public class CalculadoraOctal extends Calculadora {

    @Override
    public void sumar() {
        resultado=Integer.toOctalString(Integer.valueOf(operando1,8)+Integer.valueOf(operando2,8));
    }

    @Override
    public void restar() {
        resultado=Integer.toOctalString(Integer.valueOf(operando1,8)-Integer.valueOf(operando2,8));
    }

    @Override
    public void multiplicar() {
        resultado=Integer.toOctalString(Integer.valueOf(operando1,8)*Integer.valueOf(operando2,8));
    }

    @Override
    public void dividir() {
        resultado=Integer.toOctalString(Integer.valueOf(operando1,8)/Integer.valueOf(operando2,8));
    }
    
}


