package modelo;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.List;

public class ConsultaSaldo extends Transaccion {

    private List<Cuenta> cuentas;

    public ConsultaSaldo(float registroValor, EstadoTransaccion estadoTansaccion, LocalDateTime hora, LocalDateTime fecha, List<Cuenta>cuentas) {
        super(registroValor, estadoTansaccion, hora, fecha);
        this.cuentas=cuentas;
    }

    public Cuenta buscarCuenta( String numeroCuenta) {


        Objects.requireNonNull(numeroCuenta, " el numero de cuenta no puede estar vacio");

        return cuentas.stream()

                .filter((cuentas) -> cuentas.getNumeroCuenta().equals(numeroCuenta)
                )
                // encontrar el primero
                .findFirst()
                // si no lo encuentra me va arrojar vacio
                .orElse(null);

    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
}
