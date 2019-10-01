
package conversiontemperaturas;

import javax.swing.JOptionPane;


public class KelvinCelsius implements IConvertir{
    double kelvin;
    double celsius;
    
    @Override
    public void convertir(){
        kelvin=Double.parseDouble(JOptionPane.showInputDialog("Ingresa unidades en Kelvin"));
        
        celsius=kelvin-273.15;
        
        JOptionPane.showMessageDialog(null, "Resultado al convertir en Celsius: "+celsius);
    }
    
}
