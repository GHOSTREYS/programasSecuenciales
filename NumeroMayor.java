/*
Evaluar si un numero es mayor de 10 utilizando el operador ternario


(Expresion)?parte true: parte flase



 */


import javax.swing.*;

public class NumeroMayor {
    public static void main(String[] args) {
        //declaracion de variable
        double numero = 0.0;
        String salida = "";
        //entrada
        numero = Double.parseDouble(JOptionPane.showInputDialog("introduce el numero"));
        salida = (numero > 10) ? "el numero es mayor a 10" : "el numero es menor";

        JOptionPane.showMessageDialog(null, salida);
    }
}
