/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gt.edu.umg.GrupoII;

import gt.edu.umg.Ventanas.ventanaMenu;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Grupo2 {

    public static void main(String[] args) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("1. Arboles binarios");
            System.out.println("2. XX");
            System.out.println("3. YY");
            System.out.println("4. Salir");

            try {
                opc = sc.nextInt();
                sc.nextLine();
                switch(opc){
                    case 1: { System.out.println("Entro en case 1");
                        ventanaMenu ventana = new ventanaMenu();
                    ventana.setVisible(true);
                    ventana.doLayout();
                    
                    break;
                    }
                    
                }
            } catch (InputMismatchException e) {

                System.out.println("Se esperaba una entrada numerica.");
                sc.nextLine();
            } catch (Exception e) {

                System.out.println("Ha ocurrido una excepción.");
            } finally {
               
                
            }

        } while (opc != 4);
        {
            System.out.println("Prueba finalizada");

        }

    }
}
