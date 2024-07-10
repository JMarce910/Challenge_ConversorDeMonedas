
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;

        while (opcion != 7){
        System.out.println("~~~~~~ BIENVENIDO/A AL CONVERSOR DE MONEDAS ~~~~~~\n");

        String menu = """
                Escriba el número de la opción deseada:\n
                1 - Convertir Dólar a Peso colombiano
                2 - Convertir Peso colombiano a Dólar
                3 - Convertir Dólar a Real brasilero 
                4 - Convertir Real brasilero a Dólar
                5 - Convertir Dolar a Peso argentino
                6 - Convertir Peso argentino a Dólar
                7 - Salir 
                """;


            System.out.println(menu);
            opcion = read.nextInt();
            read.nextLine();


            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "COP", consulta, read);
                    break;
                case 2:
                    ConvertirMoneda.convertir("COP", "USD", consulta, read);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, read);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, read);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, read);
                    break;
                case 6:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, read);
                case 7:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
