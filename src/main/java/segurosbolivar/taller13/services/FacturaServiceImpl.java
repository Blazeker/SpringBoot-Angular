package segurosbolivar.taller13.services;

import org.springframework.stereotype.Service;
import segurosbolivar.taller13.model.Detalles;
import segurosbolivar.taller13.model.Factura;
import segurosbolivar.taller13.repository.FacturaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService{
    private final FacturaRepository facturaRepository;

    public FacturaServiceImpl(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @Override
    public Optional<Factura> GetFacturaId(Long idc)
    {
        return facturaRepository.findById(idc);
    }

    @Override
    public List<Factura> GetAllFactura()
    {
        return facturaRepository.findAll();
    }

    public Factura saveFactura(Factura factura)
    {
        return facturaRepository.saveAndFlush(factura);
    }
}
