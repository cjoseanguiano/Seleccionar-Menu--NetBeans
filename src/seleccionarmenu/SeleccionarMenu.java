/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionarmenu;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SeleccionarMenu {

    /**
     * @param args the command line arguments
     */
    public static int num1 = 0, num2 = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static int seleccion = -1;
    public static int saliendo;

    public static void main(String[] args) {
        while (seleccion != 0) {
            try {
                //JOptionPane.showInputDialog("Elige tu opcion"
                //int numero=Integer.parseInt(JOptionPane.showInputDialog

                seleccion = Integer.parseInt(JOptionPane.showInputDialog("Elige tu opcion"
                        + "\n 1 .-Suma"
                        + "\n 2 .-Restar"
                        + "\n 3 .-Multiplicar"
                        + "\n 4 .-Dividir"
                        + "\n 5 .-Salir"));

                //seleccion = Integer.parseInt(scanner.nextLine());
                switch (seleccion) {
                    case 1:
                        pideNumero();
                        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        pideNumero();
                        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        pideNumero();
                        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        pideNumero();
                        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 / num2));
                        break;
                    case 5:
                        salir();
                        break;
                    default:
                        if (seleccion > 5) {
                            JOptionPane.showMessageDialog(null, "Numero no reconocido");
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("Fallo");
            }
        }
    }

    public static void pideNumero() {

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa A numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa B numero"));

    }

    public static void salir() {
        System.exit(0);
    }

}
