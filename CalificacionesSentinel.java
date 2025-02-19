import javax.swing.*;

public class CalificacionesSentinel {
    public static void main(String[] args) {
        final int Setinel=-1;
        double calif=0.0;
        int numAprobados=0;
        int numReprobados=0;
        int i=1;

        JOptionPane.showMessageDialog(null, "este programa cuenta el numero de calificaciones aprobadorias y reprobatorias"+i);

        while (calif!=Setinel){
            calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"+i));

            if(calif!=Setinel){
                if(calif>=7.0){
                    numAprobados++;
                }else{
                    numReprobados++;
                }
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "el numero de aprobados:" + numAprobados +
                "\nEl numero de reprobados es: " + numReprobados);
    }
}
