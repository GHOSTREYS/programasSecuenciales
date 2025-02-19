import javax.swing.*;

public class CalificacionesSentinel2 {
    public static void main(String[] args) {

        boolean Setinel=true;
        double calif=0.0;
        int numAprobados=0;
        int numReprobados=0;
        int i=1;

        JOptionPane.showMessageDialog(null, "este programa cuenta el numero de calificaciones aprobadorias y reprobatorias"+i);

        while (Setinel) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion" + i));

            if (calif != -1) {
                if (calif >= 7.0) {
                    numAprobados++;
                } else {
                    numReprobados++;
                }
                i++;
            }else {
                Setinel=false;
            }

        }
        JOptionPane.showMessageDialog(null, "el numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
    }
}
