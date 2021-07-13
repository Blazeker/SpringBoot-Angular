package segurosbolivar.taller13.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import segurosbolivar.taller13.model.Detalles;
import segurosbolivar.taller13.repository.DetallesRepository;
import segurosbolivar.taller13.services.DetallesService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DetallesController {
    private final DetallesService detallesService;
    private final DetallesRepository detallesRepository;

    public DetallesController(DetallesService detallesService, DetallesRepository detallesRepository) {
        this.detallesService = detallesService;
        this.detallesRepository = detallesRepository;
    }

    @GetMapping(value = "/detalles/{idc}")
    public Optional<Detalles> GetDetallesId(@PathVariable Long idc)
    {
        return detallesService.GetDetallesId(idc);
    }

    @GetMapping(value = "/detalles/all")
    public List<Detalles> GetDetallesCAll()
    {
        return detallesService.GetAllDetalles();
    }
}
