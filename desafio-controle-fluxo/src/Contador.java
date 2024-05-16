import java.util.Scanner;

class ParametrosInvalidosException extends Exception {}

public class Contador {
	public static void main(String[] args){

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        terminal.close();

        try {
		    //chamando o método contendo a lógica de contagem
           contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        // validando se o parâmetro um é maior que o parâmetro dois        
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        } else{
            int subtracao = parametroDois - parametroUm;

            //exibindo os números no console após a subtração dos parâmetros
            for (int i = 1; i <= subtracao; i ++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}