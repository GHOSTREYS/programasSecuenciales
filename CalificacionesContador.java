import javax.swing.*;

public class CalificacionesContador {
    public static void main(String[] args) {
        //declaracion
        int numAprobados = 0;
        int numReprobado = 0;
        int numCalificaiones = 0;
        double calif = 0.0;
        numCalificaiones = Integer.parseInt(JOptionPane.showInputDialog("cuantas calificaciones se vana evaluar"));

        for (int i = 1; i <= numCalificaiones; i++) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("introduce la califiacion" + i));
            if (calif > 7.0) {
                //contador de numeros de aprobados
                numAprobados++;
            } else {
                numReprobado++;
            }


        }//cierre de for
        JOptionPane.showMessageDialog(null, "el numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobado);

        int i = 1;
        //reinicio
        numAprobados = 0;
        numReprobado = 0;

        while (i <= numCalificaiones) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("introduce la calficacion" + i));

            if (calif > 7.0) {
                //contador de numeros de aprobados
                numAprobados++;
            } else {
                numReprobado++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "el numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobado);


        //reinicio
        numAprobados = 0;
        numReprobado = 0;
        i = 0;
        do {
            calif = Double.parseDouble(JOptionPane.showInputDialog("introduce la calficacion" + i));

            if (calif > 7.0) {
                //contador de numeros de aprobados
                numAprobados++;
            } else {
                numReprobado++;
            }
            i++;

        } while (i <= numCalificaiones);
        JOptionPane.showMessageDialog(null, "el numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobado);

    }
}
