public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dado;
        //dado= Integer.parseInt(JOptionPane.showInputDialog("lanza los dados "));
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;

        int resp = JOptionPane.showConfirmDialog(null, "Dado 1 = " + dado1
                + " y " + "Dado 2 = " + dado2 + "\n Lanzar de nuevo?", "JD MESSAGE",
                 JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        while (JOptionPane.OK_OPTION == resp) {

            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            resp = JOptionPane.showConfirmDialog(null, "Dado 1 = " + dado1
                    + " y " + "Dado 2 = " + dado2 + "\n Lanzar de nuevo?", "JD MESSAGE",
                     JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (dado1 == 6 && dado2 == 4) {
                JOptionPane.showMessageDialog(null, "eres un afortunado!!!");
            }

        }
        if (JOptionPane.OK_OPTION != resp) {
            JOptionPane.showMessageDialog(null, " inténtalo de nuevo!!!");
        }

    }

}
