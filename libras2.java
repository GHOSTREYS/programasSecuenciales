import javax.swing.*;

public class libras2 {
    public static void main(String[] args) {
        //declaracion de variable de tres numeros numeros dobles
        double numero=00.0;
        double numero2=00.0;
        double numero3=00.0;
        //slicitar los tres  numeros

        numero=Double.parseDouble(JOptionPane.showInputDialog("introduce el valor"));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("introduce el valor"));
        numero3=Double.parseDouble(JOptionPane.showInputDialog("introduce el valor"));

        //constante
        final double libras =0.454;
        String salida="";



        salida=numero + "kilogramos"+ " en libras es "+ String.format("%.3f",numero/libras)+
                "\n"+ numero2 + "kilogramos " + " en libras es "+ String.format("%.3f",numero2/libras)+
                "\n"+ numero3 + "kilogramos " + " en libras es "+ String.format("%.3f",numero3/libras);

        JOptionPane.showMessageDialog(null,salida);


    }

}
