import javax.swing.*;
import java.util.Locale;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        //Declaracion
        String menu= "";
        String resultado="";
        String opcion="";
        double numero=0.0;
        double numero2=0.0;


        menu= "menu principal \n"+
                "a)sumar \nb)restar\n"+
                "c)dividir\n" +
                "d)multiplicar\n" +
                "e)modulo\n"+
                "elegir una opcion";

        opcion=JOptionPane.showInputDialog(menu);

        JOptionPane.showMessageDialog(null,opcion);

        numero=Double.parseDouble(JOptionPane.showInputDialog("introduce el primer valor"));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("introduce el primer valor"));

        opcion=opcion.toUpperCase();
        if(numero2>0.0){
            switch (opcion){
                case "a":
                    resultado="la suma es:"+(numero+numero2);
                    break;
                case "b":
                    resultado="la resta es:"+(numero-numero2);
                    break;
                case "c":
                    resultado="la division es:"+(numero/numero2);
                    break;
                case "d":
                    resultado="la multiplicacion es:"+(numero*numero2);
                    break;
                case "e":
                    resultado="la modulo es:"+(numero%numero2);
                    break;
                default:
                    resultado="caso mo valido";

            }

            JOptionPane.showMessageDialog(null,resultado);}


        }

}
