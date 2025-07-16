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
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getARS());
                        System.out.println(cantidad + " USD son " + res + " ARS" );
                        break;
                    case 2:
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getARS());
                        System.out.println(cantidad + " ARS son " + res + " USD" );
                        break;
                    case 3:
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getBRL());
                        System.out.println(cantidad + " USD son " + res + " BRL" );
                        break;
                    case 4:
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getBRL());
                        System.out.println(cantidad + " BRL son " + res + " USD" );
                        break;
                    case 5:
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getCOP());
                        System.out.println(cantidad + " USD son " + res + " COP" );
                        break;
                    case 6:
                        res = resultado.convertir(opcion, cantidad, moneda.conversion_rates().getCOP());
                        System.out.println(cantidad + " COP son " + res + " USD" );
                        break;
                    default:
                        break;
                }
            } else if (opcion != 7){
                System.out.println("Opcion no válida");
            } else {
                System.out.println("Hasta luego!");
            }
        }
    }
}
