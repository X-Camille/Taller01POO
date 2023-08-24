import java.util.Scanner;
import java.util.Random;

public class Taller {
    public static void main(String[] args) {
        String[][] matriz = crearMatrizCartas();
        mostrarMatriz(matriz);
    }

    public static String[][] crearMatrizCartas() {
        String[][] matriz = new String[2][12];
        matriz = agregarCartas(matriz);
        return matriz;

    }

    public static String[][] agregarCartas(String[][] matriz) {
        matriz[0][1] = "As";
        matriz[0][2] = "Dos";
        matriz[0][3] = "Tres";
        matriz[0][4] = "Cuatro";
        matriz[0][5] = "Cinco";
        matriz[0][6] = "Seis";
        matriz[0][7] = "Siete";
        matriz[0][8] = "Ocho";
        matriz[0][9] = "Nueve";
        matriz[0][10] = "Jota/Reina/Rey";

        matriz[1][1] = "11";
        matriz[1][2] = "2";
        matriz[1][3] = "3";
        matriz[1][4] = "4";
        matriz[1][5] = "5";
        matriz[1][6] = "6";
        matriz[1][7] = "7";
        matriz[1][8] = "8";
        matriz[1][9] = "9";
        matriz[1][10] = "10";
        return matriz;
      }

      public static void mostrarMatriz(String[][] matriz){
        for(int i=0; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println(matriz[i][j] + " ,");
            }
            System.out.println();
        }
      }

    }