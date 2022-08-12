import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int numeroIf = 2;
        if (numeroIf < 0) {
            System.out.println("Es numero negativo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero es positivo");
        }

        int numeroWhile = 1;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 1;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroWhile < 2);

        int numeroFor = 0;
        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "verano";
        switch (estacion) {
            case "verano":
            System.out.println("Es verano");
            break;
            case "invierno":
            System.out.println("Es invierno");
            break;
            case "otoño":
            System.out.println("Es otoño");
            break;
            case "primavera":
            System.out.println("Es primavera");
            break;
            default:
                System.out.println("No es una estacion");

        }
    }


}

