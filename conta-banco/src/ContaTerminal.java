import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO: conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite seu nome completo: ");
        String nomecompleto = scanner.nextLine();

       System.out.println("Informe o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.println("Informe o valor do depósito: ");
        double deposito = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha pendente
        

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomecompleto + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é "+ agencia + ", conta "+ conta +" e seu saldo R$ "+ deposito + " já está disponível para saque.");
    }
}
