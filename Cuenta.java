package modelo;

public class Cuenta extends Banco{

    private TipoCuenta tipoCuenta;
    private String numeroCuenta;
    private float saldo;




    public Cuenta(TipoCuenta tipoCuenta, String numeroCuenta, float saldo) {

        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public float getSaldo() {

        return saldo;
    }

    public void setSaldo(float saldo) {

        this.saldo = saldo;
    }
}
