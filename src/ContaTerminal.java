import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaBanco contaBanco;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Conta!");
        Integer numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome do cliente!");
        String nome = sc.next();
        System.out.println("Por favor, digite o valor depositado!");
        Double saldo = sc.nextDouble();
        contaBanco= new ContaBanco(numero,agencia,nome,saldo);
        System.out.println(contaBanco.boasVindas());
        sc.close();
    }
}
