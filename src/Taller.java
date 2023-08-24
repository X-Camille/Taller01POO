import java.util.Scanner;
import java.util.Random;

public class Taller {
    public static void main(String[] args) {
        String[][] matriz = crearMatrizCartas();
        System.out.println(matriz[0][0]);
    }

    public static String[][] crearMatrizCartas() {
        String[][] matriz = new String[2][12];
        //matriz = agregarCartas(matriz);
        return matriz;

    }

    public static String[][] agregarCartas(String[][] matriz, String nombre, String numero) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null) {
                matriz[i][0] = nombre;
                matriz[i][1] = numero;
            }
        }

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


      public static void inicializarCartasJuegos(){
        
      }

      public static int obtenerCartas(){
        // Método que le entregará una carta aleatoria
        Random random = new Random();

        // Buscará un índice aleatoria para la carta con fila=1 y columna de 1 a 10
        int columna_aleatoria = random.nextInt(11)+1;

        return columna_aleatoria;
      }

      public static void jugar(){
        // Son 3 intentos por lo que se realizará un bucle for
          for(int i=0; i<2; i++) {
              //obtenerCartas()
          }
      }

      public static void mostrarOpciones(){
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        System.out.println("Ingrese una opción: ");
      }


      public static void menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido");
        mostrarOpciones();
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                jugar();
                break;
            case 2:
                break;
            default:
                System.out.println("Opción inválida");
        }

      }
    }