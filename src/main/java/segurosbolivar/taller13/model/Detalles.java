package segurosbolivar.taller13.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Detalles {
    @Id
    @Column(name = "ID_DETALLES")
    Long idDetalles;
    @Column(name = "ID_CLIENTE")
    Long idCliente;
    @Column(name = "NRO_FACTURA")
    String nroFactura;
    @Column(name = "VALOR_PAGADO")
    Long valorPagado;
    @Column(name = "FECHA_PAGO")
    Date fechaPago;
    @Column(name = "FORMA_PAGO")
    String formaPago;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false, insertable = false, updatable = false)
    private Clientes clientes;

    public Detalles() {
    }

    public Detalles(Long idDetalles, Long idCliente, String nroFactura, Long valorPagado, Date fechaPago, String formaPago) {
        this.idDetalles = idDetalles;
        this.idCliente = idCliente;
        this.nroFactura = nroFactura;
        this.valorPagado = valorPagado;
        this.fechaPago = fechaPago;
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Detalles{" +
                "idDetalles=" + idDetalles +
                ", idCliente=" + clientes +
                ", nroFactura='" + nroFactura + '\'' +
                ", valorPagado=" + valorPagado +
                ", fechaPago=" + fechaPago +
                ", formaPago='" + formaPago + '\'' +
                ", clientes=" + clientes +
                '}';
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Long getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(Long valorPagado) {
        this.valorPagado = valorPagado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Long getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(Long idDetalles) {
        this.idDetalles = idDetalles;
    }

}
