package segurosbolivar.taller13.services;

import segurosbolivar.taller13.model.Archivos;

import java.util.List;
import java.util.Optional;

public interface ArchivosService {
    Archivos GetById(Long idc);
    List<Archivos> GetAll();
}
