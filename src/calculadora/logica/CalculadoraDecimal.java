
package calculadora.logica;
public class CalculadoraDecimal extends Calculadora{ 
        
    @Override
    public void sumar(){ 
        resultado=String.valueOf(Integer.valueOf(operando1,10)+Integer.valueOf(operando2,10));
    }
    @Override
    public void restar(){
        resultado=String.valueOf(Integer.valueOf(operando1,10)-Integer.valueOf(operando2,10));
    }
    @Override
    public void multiplicar(){
        resultado=String.valueOf(Integer.valueOf(operando1,10)*Integer.valueOf(operando2,10));
    }
    @Override
    public void dividir(){
        resultado=String.valueOf(Integer.valueOf(operando1,10)/Integer.valueOf(operando2,10));
    }
    }

    

