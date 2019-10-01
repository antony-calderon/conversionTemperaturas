
package conversiontemperaturas;


public class Programa {

   
    public static void main(String[] args) {
        // TODO code application logic here
        CelsiusFahrenheit cel=new CelsiusFahrenheit();
        convertir(cel);
        
        FahrenheitCelsius fah=new FahrenheitCelsius();
        convertir(fah);
        
        KelvinCelsius kel=new KelvinCelsius();
        convertir(kel);
        
    }
    public static void convertir(IConvertir ic){
        ic.convertir();
    }
    
}
