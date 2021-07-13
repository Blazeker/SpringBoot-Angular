package segurosbolivar.taller13.controller;


import segurosbolivar.taller13.model.Archivos;
import org.springframework.web.bind.annotation.*;
import segurosbolivar.taller13.repository.ArchivosRepository;
import segurosbolivar.taller13.services.ArchivosService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ArchivosController {
    private final ArchivosService archivosService;
    private final ArchivosRepository archivosRepository;

    public ArchivosController(ArchivosService archivosService, ArchivosRepository archivosRepository) {
        this.archivosService = archivosService;
        this.archivosRepository = archivosRepository;
    }


    @GetMapping(value = "/archivo/{idc}")
    public Archivos GetCuentaId(@PathVariable Long idc)
    {
        return archivosService.GetById(idc);
    }

    @GetMapping(value = "/archivo/all")
    public List<Archivos> GetCuentaAll()
    {
        return archivosService.GetAll();
    }


}
