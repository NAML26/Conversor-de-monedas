import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConversionDeMonedas convertidor = new ConversionDeMonedas();

        try {

            Moneda usd = new Moneda("USD", "Dólar estadounidense", 1.0);
            Moneda ars = new Moneda("ARS", "Peso argentino", ApiManager.obtenerTasaCambio("USD", "ARS"));
            Moneda brl = new Moneda("BRL", "Real brasileño", ApiManager.obtenerTasaCambio("USD", "BRL"));
            Moneda cop = new Moneda("COP", "Peso colombiano", ApiManager.obtenerTasaCambio("USD", "COP"));

            while (true) {
                System.out.println("********BIENVENIDO/A********\n" +
                        "Elija una opción:\n" +
                        "1) Dolar =>> Peso Argentino\n" +
                        "2) Peso Argentino =>> Dolar\n" +
                        "3) Dolar =>> Real brasileño\n" +
                        "4) Real brasileño =>> Dolar\n" +
                        "5) Dolar =>> Peso colombiano\n" +
                        "6) Peso colombiano =>> Dolar\n" +
                        "7) Salir");

                int opcion = lectura.nextInt();

                if (opcion == 7) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                System.out.println("Ingrese la cantidad a convertir:");
                double cantidad = lectura.nextDouble();
                Conversion conversion = null;

                switch (opcion) {
                    case 1:
                        conversion = convertidor.convertir(usd, ars, cantidad);
                        System.out.println(cantidad + " USD son " + conversion.getConversionResult() + " ARS.");
                        break;
                    case 2:
                        conversion = convertidor.convertir(ars, usd, cantidad);
                        System.out.println(cantidad + " ARS son " + conversion.getConversionResult() + " USD.");
                        break;
                    case 3:
                        conversion = convertidor.convertir(usd, brl, cantidad);
                        System.out.println(cantidad + " USD son " + conversion.getConversionResult() + " BRL.");
                        break;
                    case 4:
                        conversion = convertidor.convertir(brl, usd, cantidad);
                        System.out.println(cantidad + " BRL son " + conversion.getConversionResult() + " USD.");
                        break;
                    case 5:
                        conversion = convertidor.convertir(usd, cop, cantidad);
                        System.out.println(cantidad + " USD son " + conversion.getConversionResult() + " COP.");
                        break;
                    case 6:
                        conversion = convertidor.convertir(cop, usd, cantidad);
                        System.out.println(cantidad + " COP son " + conversion.getConversionResult() + " USD.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lectura.close();
        }
    }
}