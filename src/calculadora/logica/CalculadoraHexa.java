
package calculadora.logica;
public class CalculadoraHexa extends Calculadora{ 
        
   @Override
    public void sumar() {
        resultado=Integer.toHexString(Integer.valueOf(operando1,16)+Integer.valueOf(operando2,16));
    }

    @Override
    public void restar() {
        resultado=Integer.toHexString(Integer.valueOf(operando1,16)-Integer.valueOf(operando2,16));
    }

    @Override
    public void multiplicar() {
        resultado=Integer.toHexString(Integer.valueOf(operando1,16)*Integer.valueOf(operando2,16));
    }

    @Override
    public void dividir() {
        resultado=Integer.toHexString(Integer.valueOf(operando1,16)/Integer.valueOf(operando2,16));
    }
    
}

    

