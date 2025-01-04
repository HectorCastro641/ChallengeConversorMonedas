import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String api="483722c3e318b60f2796335d";
        Scanner lectura=new Scanner(System.in);
        Conversiones da=new Conversiones();
        int seleccion=0;

        while(seleccion!=7){
        System.out.println("*******************");
        System.out.println("1-. Dólar =>>>>> Peso Argentino");
        System.out.println("2-. Peso Argentino >>>>>> Dolar");
        System.out.println("3-. Dolar =>>>>> Real Brasileño");
        System.out.println("4-. Real Brasileño =>>>>>> Dolar");
        System.out.println("5-. Dolar =>>>>> Peso Colombiano");
        System.out.println("6-. Peso Colombiano =>>>>>>>>> Dolar");
        System.out.println("7-. Salir");
        System.out.println("*******************");
        seleccion=lectura.nextInt();


            switch (seleccion){
                case 1:
                    System.out.println("A seleccionado la opcion 1");
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    int cantidad=lectura.nextInt();
                    System.out.println();
                    da.conversion(api,cantidad);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("A seleccionado la opcion 2");
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    int cantidad2=lectura.nextInt();
                    System.out.println();
                    da.conversionArsUsd(api,cantidad2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("A seleccionado la opcion 3");
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    int cantidad3=lectura.nextInt();
                    System.out.println();
                    da.conversionUsdBrl(api,cantidad3);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("A seleccionado la opcion 4");
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    int cantidad4=lectura.nextInt();
                    System.out.println();
                    da.conversionBrlUsd(api,cantidad4);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("A seleccionado la opcion 5");
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    int cantidad5=lectura.nextInt();
                    System.out.println();
                    da.conversionUsdCop(api,cantidad5);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("A seleccionado la opcion 6");
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    int cantidad6=lectura.nextInt();
                    System.out.println();
                    da.conversionCopUsd(api,cantidad6);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("*****************************************");
                    System.out.println("Muchas gracias por utilizar el conversor de monedas!!");
                    System.out.println("*****************************************");
                    break;
        }


        }






    }
}
