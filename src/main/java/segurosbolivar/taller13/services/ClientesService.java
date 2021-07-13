package segurosbolivar.taller13.services;

import segurosbolivar.taller13.model.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesService {
    Optional<Clientes> GetClienteId(Long idc);
    List<Clientes> GetAllClientes();
}
