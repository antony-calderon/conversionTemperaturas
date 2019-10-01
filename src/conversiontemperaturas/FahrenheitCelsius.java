
package conversiontemperaturas;

import javax.swing.JOptionPane;


public class FahrenheitCelsius implements IConvertir{
        double fahrenheit;
        double celsius;
        
    
    @Override
    public void convertir() {
        fahrenheit=Double.parseDouble(JOptionPane.showInputDialog("Ingresa unidades en Fahrenheit"));
        
        celsius=(fahrenheit-32)*(5.0/9.0);
        
        JOptionPane.showMessageDialog(null, "Resultados al convertir en Celsius: "+celsius);
    }
    
}
