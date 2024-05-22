import java.util.Scanner;

public class TerminalConta {
    public static void main(String[] args) throws Exception {
        // TODO: CONHECER E IMPORTAR A CLASS SCANNER
        Scanner scanner = new Scanner(System.in);

        // TODO EXIBIR AS MENSAGENS PARA O NOSSO USUÁRIO
        System.out.println("Digite um valor a ser depositado: R$ ");

        // OBTER PELA CLASSE SCANNER OS VALORES DIGITADOS NO TERMINAL
        Double valorDeposito;

        valorDeposito = scanner.nextDouble();

        // EXIBIR A MENSAGEM DA CONTA CRIADA
        System.out.printf("Conta criada com Sucesso! Foi depositado o valor de %.2f%n", valorDeposito);


    }
}
