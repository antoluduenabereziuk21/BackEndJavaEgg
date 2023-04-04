/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjExtras;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Juego {

    private int numero1;
    private int numero2;
    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void iniciar_juego() {
        int cont, contV1 = 0, contV2 = 0;
        boolean win = true;
        String pal;
        do {
            cont = 3;
            System.out.println("jugador 1 ingresa el numero a adivinar: ");
            numero1 = leer.nextInt();
            do {
                System.out.println("jugador 2 ingresa el numero  : ");
                numero2 = leer.nextInt();
                if (numero1 == numero2) {
                    System.out.println("Ganaste tuviste exito.....");
                    contV2++;
                    break;
                } else if (numero1 > numero2) {
                    System.out.println("mas alto");
                } else {
                    System.out.println("mas bajo");
                }
                cont--;
            } while (cont > 0);
            if (cont == 0) {
                contV1++;
                System.out.println("Que mira bobo");
                
            }
            System.out.println("Desea continuar ? S /n ");
            pal = leer.next().toLowerCase();
            if (pal.equals("n")) {
                win = false;
            } 
        } while (win);

        System.out.println("jugador 1 gano : " + contV1);
        System.out.println("jugador 2 gano : " + contV2);
    }
}
