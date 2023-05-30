import java.util.Scanner;
public class SomaDoisNumerosComScanner{
    //... se chama varargs (existe desde a versão 5 do java)
    public static void main(String... args){
        //construir um objeto do tipo Scanner 
        //variável de referência
        //new: operador de contrução de objetos 
        //saida padrão java: System.out
        //entrada padrão java: System.in
        Scanner leitor = new Scanner(System.in);
        //declaração de variáveis
        int a,b;
        int r;
        //entrada de dados
        System.out.println("Digite o primeiro numero");
        a = leitor.nextInt();
        System.out.println("Digite o segundo numero");
        b = leitor.nextInt();
        //processamento
        r = a + b;
        //saída
        System.out.printf("O resultado eh: %d\n", r);
    }
}