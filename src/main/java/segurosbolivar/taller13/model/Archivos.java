package segurosbolivar.taller13.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Archivos {
    @Id
    @Column(name = "ID_ARCHIVOS")
    Long idArchivos;
    @Column(name = "ID_CLIENTE")
    Long idCliente;
    @Column(name = "PAGOS_REALIZADOS")
    Long pagosRealizados;
    @Column(name = "MONTO_TOTAL")
    Long montoTotal;
    @Column(name = "PAGOS_INCOSISTENTES")
    String pagosIncosistentes;
    @Column(name = "FECHA_PAGO")
    Date fecha;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false, insertable = false, updatable = false)
    private Clientes clientes;



    public Archivos() {
    }

    public Archivos(Long idArchivos, Long ida, Long idCliente, Long pagosRealizados, Long montoTotal, String pagosIncosistentes, Date fecha) {
        this.idArchivos = idArchivos;
        this.idCliente = idCliente;
        this.pagosRealizados = pagosRealizados;
        this.montoTotal = montoTotal;
        this.pagosIncosistentes = pagosIncosistentes;
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Archivos{" +
                "idArchivos=" + idArchivos +
                ", idCliente=" + clientes +
                ", pagosRealizados=" + pagosRealizados +
                ", montoTotal=" + montoTotal +
                ", pagosIncosistentes='" + pagosIncosistentes + '\'' +
                ", fecha=" + fecha +
                ", clientes=" + clientes +
                '}';
    }


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getPagosRealizados() {
        return pagosRealizados;
    }

    public void setPagosRealizados(Long pagosRealizados) {
        this.pagosRealizados = pagosRealizados;
    }

    public Long getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Long montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getPagosIncosistentes() {
        return pagosIncosistentes;
    }

    public void setPagosIncosistentes(String pagosIncosistentes) {
        this.pagosIncosistentes = pagosIncosistentes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getIdArchivos() {
        return idArchivos;
    }

    public void setIdArchivos(Long idArchivos) {
        this.idArchivos = idArchivos;
    }
}
