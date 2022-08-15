public class Main {

    public static void main(String[] args) {

        Cliente brendon = new Cliente();
        brendon.setNome("Brendon");

        Conta cc = new ContaCorrente(brendon);
        Conta poupanca = new ContaPoupanca(brendon);
        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
