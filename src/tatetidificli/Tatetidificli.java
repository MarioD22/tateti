/*
 * TATETI DINAMICO.
 */
package tatetidificli;

import java.util.Scanner;

/**
 *
 * @Mario_Cena
 *
 */
public class Tatetidificli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del TATETI");
        int tamaño = entrada.nextInt();
        int cant_posibilidades = tamaño * tamaño;
        System.out.println("Posibilidades: " + cant_posibilidades);

        int tateti[][] = new int[tamaño][tamaño];

        System.out.println("            TATETI!!!");
        System.out.println("*******************************");

        for (int fila = 0; fila < tateti.length; fila++) {

            for (int col = 0; col < tateti.length; col++) {

                System.out.printf("     |%d%d|", fila, col);

            }
            System.out.println(" ");
        }
        System.out.println("*******************************");

        System.out.println("empieza el juego!!! ");

        int hubplayer1 = 1;
        int hubplayer2 = 2;
        boolean tatet = false;
        int jugador;
        String respuesta;
        int posibilidad = 0;

        do {
            System.out.println("Ingrese Jugador 1 o 2");
            System.out.print(">>>>>");
            jugador = entrada.nextInt();

            if (jugador == 1) {
                System.out.println("Ingrese la hubicacion Fila y despues Columna");
                System.out.print("Fila : ");
                int fila = entrada.nextInt();
                System.out.print("Columna : ");
                int col = entrada.nextInt();

                tateti[fila][col] = hubplayer1;

                for (int fila2 = 0; fila2 < tateti.length; fila2++) {

                    for (int col2 = 0; col2 < tateti.length; col2++) {

                        System.out.printf("| %d |", tateti[fila2][col2]);

                    }
                    System.out.println(" ");

                }
            } else {
                System.out.println("Ingrese la hubicacion Fila y despues Columna");
                System.out.print("Fila : ");
                int fila = entrada.nextInt();
                System.out.print("Columna : ");
                int col = entrada.nextInt();
                tateti[fila][col] = hubplayer2;
                for (int fila2 = 0; fila2 < tateti.length; fila2++) {

                    for (int col2 = 0; col2 < tateti.length; col2++) {

                        System.out.printf("| %d |", tateti[fila2][col2]);

                    }
                    System.out.println(" ");
                }
            }
            /**
             * Verificador Tateti Horizontal jugador 1
             */
            int c = 0;

            for (int fila2 = 0; fila2 < tateti.length; fila2++) {

                for (int col2 = 0; col2 < tateti.length; col2++) {

                    if (tateti[fila2][col2] == hubplayer1) {
                        c++;
                        if (c == tamaño) {
                            System.out.println("Tateti Jugador 1!!!");
                            tatet = true;
                        }

                    }
                }
                c = 0;
            }

            /**
             * Verificador Tateti Vertical jugador 1
             */
            int c1 = 0;
            int Col2 = 0;
            while (Col2 != tamaño) {

                for (int fila2 = 0; fila2 < tateti.length; fila2++) {
                    if (tateti[fila2][Col2] == hubplayer1) {
                        c1++;
                        if (c1 == tamaño) {
                            System.out.println("Tateti Jugador 1!!!");
                            tatet = true;
                        }

                    }

                }
                c1 = 0;
                Col2++;
            }

            /**
             * Verificador TETETI Diagonal Jugador 1
             */
            int c3 = 0;

            for (int x = 0; x < tamaño; x++) {
                if (tateti[x][x] == hubplayer1) {
                    c3++;
                    if (c3 == tamaño) {
                        System.out.println("Tateti Jugador 1!!!");
                        tatet = true;
                    }
                }
            }
            /**
             * Verificador TETETI segunda Diagonal Jugador 1
             */

            int cont4 = 0;
            int aux1 = 0;
            for (int x = tamaño - 1; x >= 0; x--) {

                if (tateti[x][aux1] == hubplayer1) {
                    cont4++;
                    if (cont4 == tamaño) {
                        System.out.println("Tateti Jugador 1!!!");
                        tatet = true;
                    }
                }
                aux1++;
            }

            //***********************************************************//
            /**
             * JUGADOR 2
             */
            /**
             * Verificador Tateti Horizontal jugador 2
             */
            int cont2a = 0;

            for (int fila2 = 0; fila2 < tateti.length; fila2++) {

                for (int col2 = 0; col2 < tateti.length; col2++) {

                    if (tateti[fila2][col2] == hubplayer2) {
                        cont2a++;
                        if (cont2a == tamaño) {
                            System.out.println("Tateti Jugador 2!!!");
                            tatet = true;
                        }

                    }
                }
                cont2a = 0;
            }

            /**
             * Verificador Tateti Vertical jugador 2
             */
            int cont2b = 0;
            int Col = 0;
            while (Col != tamaño) {

                for (int fila2 = 0; fila2 < tateti.length; fila2++) {
                    if (tateti[fila2][Col] == hubplayer2) {
                        cont2b++;
                        if (cont2b == tamaño) {
                            System.out.println("Tateti Jugador 2!!!");
                            tatet = true;
                        }

                    }

                }
                cont2b = 0;
                Col++;
            }

            /**
             * Verificador TETETI Diagonal Jugador 1
             */
            int cont3b = 0;

            for (int x = 0; x < tamaño; x++) {
                if (tateti[x][x] == hubplayer2) {
                    cont3b++;
                    if (cont3b == tamaño) {
                        System.out.println("Tateti Jugador 2!!!");
                        tatet = true;
                    }
                }
            }
            /**
             * Verificador TETETI segunda Diagonal Jugador 1
             */

            int cont4b = 0;
            int aux = 0;
            for (int x = tamaño - 1; x >= 0; x--) {

                if (tateti[x][aux] == hubplayer2) {
                    cont4b++;
                    if (cont4b == tamaño) {
                        System.out.println("Tateti Jugador 2!!!");
                        tatet = true;
                    }
                }
                aux++;
            }

            posibilidad++;
            System.out.println("Cantidad de pisibilidades disponibles: "
                    + (cant_posibilidades - posibilidad));
            if (posibilidad == cant_posibilidades) {
                System.out.println("Empatados!!!");
            }

        } while (tatet
                == false && (posibilidad < cant_posibilidades));

        System.out.println(
                "Gracias Por Jugar!!!");
    }
}
