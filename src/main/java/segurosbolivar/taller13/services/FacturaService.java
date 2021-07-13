package segurosbolivar.taller13.services;

import segurosbolivar.taller13.model.Factura;

import java.util.List;
import java.util.Optional;

public interface FacturaService {
    Optional<Factura> GetFacturaId(Long idc);
    List<Factura> GetAllFactura();
    public Factura saveFactura(Factura factura);
}
