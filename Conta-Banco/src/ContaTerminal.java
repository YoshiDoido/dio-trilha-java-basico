import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String agencia;
        int numero;
        String nomeCliente;
        float saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sejam bem-vindos ao Sistema de Cadastro de Conta Bancária.\n");

        System.out.print("Por favor, digite o número da Conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite a Agência (ex: 197-3): ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s e sua conta é %d.\n", nomeCliente, agencia, numero);

        sc.close();
    }
}
