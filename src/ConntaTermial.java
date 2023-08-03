import java.math.BigDecimal;
import java.util.Scanner;

public class ConntaTermial {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scan.next();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String cliente = scan.next();

        System.out.println("Por favor, digite o Saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta + " e seu saldo R$:" + saldo +
                ", já está disponível para saque.");

        scan.close();
    }

}
