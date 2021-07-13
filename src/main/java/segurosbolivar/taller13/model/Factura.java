package segurosbolivar.taller13.model;

import javax.persistence.*;


@Entity
public class Factura {
    @Column(name = "NOMBRE_ENTIDAD")
    String nombreEntidad;
    @Column(name = "NRO_FACTURA")
    Long nroFactura;
    @Column(name = "PAGOS_REALIZADOS")
    Long pagosRealizados;
    @Column(name = "MES_FACTURADO")
    Long mesFacturado;
    @Column(name = "VALOR_PAGADO")
    Long valorPagado;
    @Column(name = "PAGOS_INCONSISTENTES")
    Long pagosInconsistentesTotal;
    @Column(name = "COMISION_TOTAL")
    Long comisionTotal;
    @Id
    @Column(name = "TIPO_COMISION")
    Long tipoComision;
    String convenio;

    public Factura(String nombreEntidad, Long nroFactura, Long pagosRealizados, Long mesFacturado, Long valorPagado, Long pagosInconsistentesTotal, Long comisionTotal, Long tipoComision, String convenio) {
        this.nombreEntidad = nombreEntidad;
        this.nroFactura = nroFactura;
        this.pagosRealizados = pagosRealizados;
        this.mesFacturado = mesFacturado;
        this.valorPagado = valorPagado;
        this.pagosInconsistentesTotal = pagosInconsistentesTotal;
        this.comisionTotal = comisionTotal;
        this.tipoComision = tipoComision;
        this.convenio = convenio;
    }

    public String getTipoEntidad() {
        return nombreEntidad;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.nombreEntidad = tipoEntidad;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getnombreEntidad() {
        return nombreEntidad;
    }

    public void setnombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
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

    public Long getMesFacturado() {
        return mesFacturado;
    }

    public void setMesFacturado(Long mesFacturado) {
        this.mesFacturado = mesFacturado;
    }

    public Long getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(Long valorPagado) {
        this.valorPagado = valorPagado;
    }

    public Long getPagosInconsistentesTotal() {
        return pagosInconsistentesTotal;
    }

    public void setPagosInconsistentesTotal(Long pagosInconsistentesTotal) {
        this.pagosInconsistentesTotal = pagosInconsistentesTotal;
    }

    public Long getComisionTotal() {
        return comisionTotal;
    }

    public void setComisionTotal(Long comisionTotal) {
        this.comisionTotal = comisionTotal;
    }

    public Long getTipoComision() {
        return tipoComision;
    }

    public void setTipoComision(Long tipoComision) {
        this.tipoComision = tipoComision;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nombreEntidad='" + nombreEntidad + '\'' +
                ", nroFactura=" + nroFactura +
                ", pagosRealizados=" + pagosRealizados +
                ", mesFacturado=" + mesFacturado +
                ", valorPagado=" + valorPagado +
                ", pagosInconsistentesTotal=" + pagosInconsistentesTotal +
                ", comisionTotal=" + comisionTotal +
                ", tipoComision=" + tipoComision +
                ", convenio='" + convenio + '\'' +
                '}';
    }



    public Factura() {
    }


}
