package segurosbolivar.taller13.dto;



import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ClientesDTO implements Serializable {
    Long idCliente;
    Long saldoPendiente;
    Boolean convenio;
    Long valorPagado;
    Long comisionTotal;
    Long tipoComision;

    public ClientesDTO() {
    }

    public ClientesDTO(Long idCliente, Long saldoPendiente, Boolean convenio, Long valorPagado, Long comisionTotal, Long tipoComision) {
        this.idCliente = idCliente;
        this.saldoPendiente = saldoPendiente;
        this.convenio = convenio;
        this.valorPagado = valorPagado;
        this.comisionTotal = comisionTotal;
        this.tipoComision = tipoComision;
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

    public Boolean getConvenio() {
        return convenio;
    }

    public void setConvenio(Boolean convenio) {
        this.convenio = convenio;
    }

    public Long getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(Long valorPagado) {
        this.valorPagado = valorPagado;
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
}
