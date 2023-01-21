import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("While e Do-while");

      /*
      * CICLO WHILE:
      *
      * - Cos'è un ciclo?
      * - A cosa serve un ciclo?
      *
      * - Ciclo While
      *
      * - Ciclo Do While
       */

/*-------------------------------------------------------------------------------------------------------*/

        // COS'è UN CICLO?

/*Il ciclo è un blocco di codice che ci permette di ripetere anche all'infinito (se non diamo delle condizioni
 diverse.*/

/*---------------------------------------------------------------------------------------------------------*/

        // A COSA SERVE UN CICLO?

/* Un ciclo serve a ripetere una determinata azione, dopo aver inserito delle specifiche condizioni non ci
interesseremo più di come verrà fatto, perché quando troverà la condizione necessaria andrà a svolgere il
suo compito sino a quando ciò rimarrà verificato all'interno delle condizioni, quando questo non lo sarà più
il programma si arresterà o passerà oltre */

/*----------------------------------------------------------------------------------------------------------*/

        // CICLO WHILE:

/* Il ciclo while esegue una istruzione o un blocco di codice finché rimane verificata una certa condizione
---- La condizione viene valutata all’inizio del ciclo e dopo ogni iterazione.
Il ciclo termina appena la condizione assume il valore di “falso”.
Quindi While si utilizza in genere con condizioni generiche o cicli infiniti */

        int i = 0; // Contatore dello step--> i= iteratore

        while (i < 5){ // while= mentre--> la condizione è verificata eseguirà le istruzioni
            System.out.println(i); // stampa della i = 0;
            i++; /* Serve ad incrementare il valore di ciclo che in partenza è 0, così partirà il ciclo
                        e verrà stampato dallo 0 al 4 */
        }

        // CICLO Do-While:

        int j = 0;

        do{ /* Il do fa prima eseguire la riga di codice, poi successivamente passa a controllare
               la condizione.
               In sostanza farà un primo ciclo a dispetto di qualsiasi condizione dopo imposta */

            System.out.println(); // Spazio vuoto di stampa
            System.out.println(j);
            j++; // Incremento per ciclare
        }while (j<0); /*  Questo mostrerà che la prima condizione, cioè il primo numero 0 verrà cmq
                               eseguito nonostante la condizione non sia soddisfatta */

        /* Ogni ciclo do deve essere completato dal While con la condizione appena fuori dalla sua parentesi
           altrimenti ci darà errore */
    }
}