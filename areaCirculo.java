import javax.swing.*;

public class areaCirculo {
    public static void main(String[] args) {
        String salida="";
        double r2=0.0;
        double r=0.0;
        final double pi=3.1416;
        r=Double.parseDouble(JOptionPane.showInputDialog("introduce un numero:"));

        r2=pi*Math.pow(r,2);
        salida="la area del circulo con radio de 10 es"+r2;

        JOptionPane.showMessageDialog(null, salida);



    }
}
