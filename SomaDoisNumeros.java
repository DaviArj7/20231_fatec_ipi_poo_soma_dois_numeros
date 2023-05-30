//fully qualifed name: javax.swing.JOptionPane
//name: JOptionPane
import javax.swing.JOptionPane;
public class SomaDoisNumeros{
    static public void main(String args []){
        
        //declarar variaveis
        double numero1, numero2;
        double resultado;
        //float double
       
        //entrada
        //classe JOptionPane  (usa GUI (Graphical User In))
        //operador de acesso a membro:
        //classes empacotadoras (wrapper)
        numero1 =
            Double.parseDouble(
                JOptionPane.showInputDialog("Digite o primeiro numero"
        )); 
        numero2 =
            Double.parseDouble(
                JOptionPane.showInputDialog("Digite o segundo numero"
        ));

        resultado = numero1 + numero2;

        JOptionPane.showMessageDialog(
            null,
            " O resultado eh" + resultado
        );



        //classe Scanner (linha de comando)

        //processamento

        //entrada
    }
}