import javax.swing.*;
import java.util.jar.JarOutputStream;

public class CalculadoraSencilla {
    public static void main(String[] args) {
        //Declaracion
        String menu= "";
        double resultado=0.0;
        int opcion=0;
        double numero=0.0;
        double numero2=0.0;


        menu= "menu principal \n"+
                "1)sumar \n2)restar\n"+
                "3)dividir\n" +
                "4)multiplicar\n" +
                "5)modulo\n"+
                "elegir una opcion";

        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

        JOptionPane.showMessageDialog(null,opcion);

        numero=Double.parseDouble(JOptionPane.showInputDialog("introduce el primer valor"));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("introduce el primer valor"));
        if(numero2>0.0){
            switch (opcion){
                case 1:
                    resultado= numero + numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es"+resultado);
                    break;
                case 2:
                    resultado= numero - numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es"+resultado);
                    break;
                case 3:
                    resultado= numero / numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es"+resultado);
                    break;
                case 4:
                    resultado= numero * numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es"+resultado);
                    break;
                case 5:
                    resultado= numero + numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es"+resultado);
                    break;
                default:

            }

        }

    }
}
