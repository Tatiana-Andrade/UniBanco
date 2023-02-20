package modelo;

import java.time.LocalDateTime;

public class Transaccion extends Banco{
    private float registroValor;
    private EstadoTransaccion estadoTransaccion;
    private LocalDateTime hora;
    private LocalDateTime fecha;

    public Transaccion(float registroValor, EstadoTransaccion estadoTansaccion, LocalDateTime hora, LocalDateTime fecha) {
        this.registroValor = registroValor;
        this.estadoTransaccion = estadoTransaccion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public float getRegistroValor() {
        return registroValor;
    }

    public EstadoTransaccion getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setRegistroValor(float registroValor) {
        this.registroValor = registroValor;
    }

    public void setEstadoTransaccion(EstadoTransaccion estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }
}
