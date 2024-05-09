import java.util.Locale;
import java.util.Scanner;

 /* 
    * to do: conhecer a classe scanner
    * exibir as mensagens para o usuário
    * obter pela classe scanner os valores digitados no terminal
    * por fim, exibir a mensagem final da conta criada
    * 
*/

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu número:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");   
    }
}
