package segurosbolivar.taller13.services;

import segurosbolivar.taller13.model.Detalles;

import java.util.List;
import java.util.Optional;

public interface DetallesService {
    Optional<Detalles> GetDetallesId(Long idc);
    List<Detalles> GetAllDetalles();
}
