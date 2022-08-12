import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int numeroIf = 2;
        if (numeroIf < 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es numero negativo");
        } else if (numeroIf == 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es 0");
        } else {
            System.out.println("La variable numeroIf " + numeroIf + " es posiotivo");
        }

        int numeroWhile = 1;
        while (numeroWhile < 3) {
            System.out.println("La variable numeroWhile ahora vale " + numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 3;
        do {
            System.out.println("La variable numeroDoWhile ahora vale " + numeroDoWhile);
            numeroDoWhile++;
        }while (numeroWhile < 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("La variable numeroFor ahora vale " + numeroFor);
        }

        var estacion = "verano";
        switch (estacion) {
            case "verano":
            System.out.println("Estamos en verano");
            break;
            case "invierno":
            System.out.println("Estamos en invierno");
            break;
            case "otoño":
            System.out.println("Estamos en otoño");
            break;
            case "primavera":
            System.out.println("Estamos en primavera");
            break;
            default:
                System.out.println("No es una estacion");

        }
    }


}

