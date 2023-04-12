public class conta {
    public static void main(String[] args) {
        knabBank pedro = new knabBank();

        pedro.titular = "Pedro";
        pedro.agencia = 1;
        pedro.NumeroDaConta = 523;
        pedro.saldo = 500;

        System.out.println("Titular: " + pedro.titular + "\n" + "Agencia: " + pedro.agencia + "\n" + "Conta: " + pedro.NumeroDaConta + "\n" + "Saldo: " + pedro.saldo);

        
        pedro.saldo += 200;

        System.out.println("Saldo atual: " + pedro.saldo);

        knabBank henrique = pedro;

        henrique.saldo = 100;

        System.out.println("\n" + "Titular: " + henrique.titular + "\n" + "Agencia: " + henrique.agencia + "\n" + "Conta: " + henrique.NumeroDaConta + "\n" + "Saldo: " + henrique.saldo);
    }
}
