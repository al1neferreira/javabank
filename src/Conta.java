package src;
public class Conta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    void deposita (double valor) {
        this.saldo = this.saldo + valor;
    }

    saca (double valor);

}
