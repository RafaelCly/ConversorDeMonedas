import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 1;
        Scanner lectura = new Scanner(System.in);
        while( opcion != 7) {
            System.out.println("*******************************");
            System.out.println("Bienvenido al conversor de monedas :D");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar ");
            System.out.println("3) Dólar => Real Brasileño");
            System.out.println("4) Real Brasileño => Dólar ");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("*******************************");
            ConsultaAPI consulta = new ConsultaAPI();
            System.out.println("Ingrese una opcion: ");
            opcion = Integer.valueOf(lectura.nextLine());
            Monedas moneda = consulta.conversorMoneda();
            if ( opcion > 0 && opcion < 7) {
                System.out.println("Ingrese la cantidad: ");
                double cantidad = Double.parseDouble(lectura.nextLine());
                Conversor resultado = new Conversor();
                double res = 0;
                switch (opcion) {
                    case 1:
                        System.out.println(moneda.conversion_rates().getARS());
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getARS());
                        break;
                    case 2:
                        System.out.println(moneda.conversion_rates().getARS());
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getARS());
                        break;
                    case 3:
                        System.out.println(moneda.conversion_rates().getBRL());
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getBRL());
                        break;
                    case 4:
                        System.out.println(moneda.conversion_rates().getBRL());
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getBRL());
                        break;
                    case 5:
                        System.out.println(moneda.conversion_rates().getCOP());
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getCOP());
                        break;
                    case 6:
                        System.out.println(moneda.conversion_rates().getCOP());
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getCOP());
                        break;
                    default:
                        break;
                }
                if (opcion != 7) {
                    System.out.println("El resultado es " + res);
                }
            } else if (opcion != 7){
                System.out.println("Opcion no válida");
            } else {
                System.out.println("Hasta luego!");
            }
        }
    }
}
