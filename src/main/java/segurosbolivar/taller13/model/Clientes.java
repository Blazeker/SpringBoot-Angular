package segurosbolivar.taller13.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Clientes {
    @Id
    @Column(name = "ID_C")
    Long idCliente;
    @Column(name = "SALDO_PENDIENTE")
    Long saldoPendiente;
    @Column(name = "DIR_COBRO")
    String dirCobro;
    @Column(name = "PAGOS_REALIZADOS")
    Long pagosRealizados;
    @Column(name = "VALOR_TOTAL")
    Long valorTotal;
    @Column(name = "SALDO_FAVOR")
    Long saldoFavor;
    @Column(name = "NUMERO_FACTURA")
    Long nroFactura;
    String nombre;

    @OneToMany(mappedBy = "idCliente")
    private Set<Archivos> archivos;

    @OneToMany(mappedBy = "idCliente")
    private Set<Detalles> detalles;



    public Clientes(Long idCliente, Long saldoPendiente, String dirCobro, Long pagosRealizados, Long valorTotal, Long saldoFavor, Long nroFactura, String nombre) {
        this.idCliente = idCliente;
        this.saldoPendiente = saldoPendiente;
        this.dirCobro = dirCobro;
        this.pagosRealizados = pagosRealizados;
        this.valorTotal = valorTotal;
        this.saldoFavor = saldoFavor;
        this.nroFactura = nroFactura;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "idCliente=" + idCliente +
                ", saldoPendiente=" + saldoPendiente +
                ", dirCobro='" + dirCobro + '\'' +
                ", pagosRealizados=" + pagosRealizados +
                ", valorTotal=" + valorTotal +
                ", saldoFavor=" + saldoFavor +
                ", nroFactura=" + nroFactura +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(Long saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public String getDirCobro() {
        return dirCobro;
    }

    public void setDirCobro(String dirCobro) {
        this.dirCobro = dirCobro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Long getPagosRealizados() {
        return pagosRealizados;
    }

    public void setPagosRealizados(Long pagosRealizados) {
        this.pagosRealizados = pagosRealizados;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getSaldoFavor() {
        return saldoFavor;
    }

    public void setSaldoFavor(Long saldoFavor) {
        this.saldoFavor = saldoFavor;
    }


    public Clientes() {
    }
}
