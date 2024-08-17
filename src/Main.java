public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João");

        ContaCorrente cc = new ContaCorrente(joao);
        cc.depositar(100.0);

        ContaPoupanca cp = new ContaPoupanca(joao);
        cp.depositar(200.0);
        cc.transferir(50.0, cp);
        cp.sacar(200.00);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
