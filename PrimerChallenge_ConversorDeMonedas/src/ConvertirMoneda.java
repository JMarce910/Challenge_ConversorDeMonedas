
import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaFinal, ConsultarMoneda consulta, Scanner read){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaFinal);
        System.out.println("La tasa de conversion actual es: " + monedaBase + " = " + monedas.conversion_rate()+" "+monedaFinal);
        System.out.println("Ingrese la cantidad de " +monedaBase);
        cantidad = Double.parseDouble(read.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = "+cantidadConvertida+ " " + monedas.target_code());
    }
}
