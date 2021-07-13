package segurosbolivar.taller13.controller;


import org.springframework.web.bind.annotation.*;
import segurosbolivar.taller13.model.Detalles;
import segurosbolivar.taller13.model.Factura;
import segurosbolivar.taller13.repository.FacturaRepository;
import segurosbolivar.taller13.services.FacturaService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FacturaController {
    private final FacturaService facturaService;
    private final FacturaRepository facturaRepository;

    public FacturaController(FacturaService facturaService, FacturaRepository facturaRepository) {
        this.facturaService = facturaService;
        this.facturaRepository = facturaRepository;
    }

    @GetMapping(value = "/factura/{idc}")
    public Optional<Factura> GetDetallesId(@PathVariable Long idc)
    {
        return facturaService.GetFacturaId(idc);
    }

    @GetMapping(value = "/factura/all")
    public List<Factura> GetDetallesCAll()
    {
        return facturaService.GetAllFactura();
    }

    @DeleteMapping("/factura/borrar/{id}")
    String deleteFactura(@PathVariable Long id)
    {
        facturaRepository.deleteById(id);
        return "Borrado con exito";
    }
}
