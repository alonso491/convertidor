import java.util.Scanner;

public class PaginaPrincipal {
    public static void main(String[] args) {
        int opcion = 0;
        String moneda ="";
        String cambio="";
        String cantidad;
        ConsultaMoneda consulta = new ConsultaMoneda();
        TipoMoneda convertidor;
        double a=0;

        String menu = """
                ********************************************
                ** Escriba el número de la opción al que deseada convertir: **
                1 - Dólar =>> Peso argentino
                2 - Peso argentino =>> Dólar
                3 - Dólar =>> Real brasileño
                4 - Real brasileño =>> Dólar
                5 - Dólar =>> Peso colombiano
                6 - Peso colombiano =>> Dólar
                7 - Salir
                ********************************************
                """;
        Scanner teclado = new Scanner(System.in);


        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    moneda="usd";
                    cambio="ars";
                    System.out.println("Escribe la cantidad a cambiar de Dolar a Peso argentino");
                    cantidad= String.valueOf(teclado.nextDouble());
                   convertidor= consulta.BuscaConsulta(moneda,cambio,cantidad);
                    a= convertidor.conversion_result();
                    System.out.println("El valor "+ cantidad +"[USD] corresponde al valor final de =>> " + a + "[ARS]\n\n");
                    //System.out.println(ConsultaMoneda.direccion1);
                    break;

                case 2:
                    moneda="ars";
                    cambio="usd";
                    System.out.println("Escribe la cantidad a cambiar de Peso argentino =>> Dólar");
                    cantidad= String.valueOf(teclado.nextDouble());
                     convertidor= consulta.BuscaConsulta(moneda,cambio,cantidad);
                     a= convertidor.conversion_result();
                    System.out.println("El valor "+ cantidad +"[ARS] corresponde al valor final de =>> " + a + "[USD]\n\n");
                    //System.out.println(ConsultaMoneda.direccion1);
                    break;

                case 3:
                    moneda="usd";
                    cambio="brl";
                    System.out.println("Escribe la cantidad a cambiar de Dolar =>> Real brasileño");
                    cantidad= String.valueOf(teclado.nextDouble());
                     convertidor= consulta.BuscaConsulta(moneda,cambio,cantidad);
                    a= convertidor.conversion_result();
                    System.out.println("El valor "+ cantidad +"[USD] corresponde al valor final de =>> " + a + "[BRL]\n\n");
                    //System.out.println(ConsultaMoneda.direccion1);
                    break;

                case 4:
                    moneda="brl";
                    cambio="usd";
                    System.out.println("Escribe la cantidad a cambiar de Real brasileño =>> Dolar");
                    cantidad= String.valueOf(teclado.nextDouble());
                     convertidor= consulta.BuscaConsulta(moneda,cambio,cantidad);
                     a= convertidor.conversion_result();
                    System.out.println("El valor "+ cantidad +"[BRL] corresponde al valor final de =>> " + a + "[USD]\n\n");
                    //System.out.println(ConsultaMoneda.direccion1);
                    break;

                case 5:
                    moneda="usd";
                    cambio="cop";
                    System.out.println("Escribe la cantidad a cambiar de Dolar =>> Peso colombiano");
                    cantidad= String.valueOf(teclado.nextDouble());
                     convertidor= consulta.BuscaConsulta(moneda,cambio,cantidad);
                    a= convertidor.conversion_result();
                    System.out.println("El valor "+ cantidad +"[USD] corresponde al valor final de =>> " + a + "[COP]\n\n");
                    //System.out.println(ConsultaMoneda.direccion1);
                    break;

                case 6:
                    moneda="cop";
                    cambio="usd";
                    System.out.println("Escribe la cantidad a cambiar de Peso colombiano =>> Dolar");
                    cantidad= String.valueOf(teclado.nextDouble());
                    convertidor= consulta.BuscaConsulta(moneda,cambio,cantidad);
                    a= convertidor.conversion_result();
                    System.out.println("El valor "+ cantidad +"[COP] corresponde al valor final de =>> " + a + "[USD]\n\n");
                    //System.out.println(ConsultaMoneda.direccion1);
                    break;
                case 7:

                    break;
            }

        }
    }
}