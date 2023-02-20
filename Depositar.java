package modelo;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.List;


public class Depositar extends Transaccion {

    private TipoCuenta tipoCuenta;
    private List<Cuenta> cuentas;

    public Depositar(float registroValor, EstadoTransaccion estadoTansaccion, LocalDateTime hora, LocalDateTime fecha, TipoCuenta tipoCuenta) {
        super(registroValor, estadoTansaccion, hora, fecha);
        this.tipoCuenta= tipoCuenta;
    }

    public Cuenta buscarCuenta(String numeroCuenta) {


        Objects.requireNonNull(numeroCuenta, " el numero de cuenta no puede estar vacio");

        return cuentas.stream()

                .filter((cuentas) -> cuentas.getNumeroCuenta().equals(numeroCuenta)
                )
                // encontrar el primero
                .findFirst()
                // si no lo encuentra me va arrojar vacio
                .orElse(null);

    }
    public void depositarSaldo( float registrarValor, String numeroCuenta,  TipoCuenta tipoCuenta){
        Objects.requireNonNull(numeroCuenta, " el numero de cuenta no puede estar vacio");
        Objects.requireNonNull(tipoCuenta, " el tipo de cuenta  no puede estar vacio");
        Objects.requireNonNull(registrarValor, " el saldo no puede ser cero");

        cuentas.add(new Cuenta(tipoCuenta, numeroCuenta, registrarValor));


    }
    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
}