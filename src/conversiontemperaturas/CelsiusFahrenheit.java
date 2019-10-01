
package conversiontemperaturas;

import javax.swing.JOptionPane;


public class CelsiusFahrenheit implements IConvertir{
    double celsius;
    double fahrenheit;
    
    @Override
    public void convertir(){
        celsius=Double.parseDouble(JOptionPane.showInputDialog("Ingresa unidades en Celsius"));
        
        fahrenheit=(celsius*1.8)+32;
        
        JOptionPane.showMessageDialog(null, "Resultado al convertir en Fahrenhei: "+fahrenheit);
    }
    
    
    
}
