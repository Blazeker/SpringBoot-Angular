package segurosbolivar.taller13.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import segurosbolivar.taller13.model.Archivos;
import segurosbolivar.taller13.model.Clientes;
import segurosbolivar.taller13.repository.ClientesRepository;
import segurosbolivar.taller13.services.ClientesService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ClientesController {
    private final ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    @GetMapping(value = "/clientes/{idc}")
    public Optional<Clientes> GetClientesId(@PathVariable Long idc)
    {
        return clientesService.GetClienteId(idc);
    }

    @GetMapping(value = "/clientes/all")
    public List<Clientes> GetClientesAll()
    {
        return clientesService.GetAllClientes();
    }
}
