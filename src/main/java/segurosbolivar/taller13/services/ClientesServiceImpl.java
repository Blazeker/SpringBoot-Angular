package segurosbolivar.taller13.services;

import org.springframework.stereotype.Service;
import segurosbolivar.taller13.model.Clientes;
import segurosbolivar.taller13.repository.ClientesRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ClientesServiceImpl implements ClientesService {
    private final ClientesRepository clientesRepository;

    public ClientesServiceImpl(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    @Override
    public Optional<Clientes> GetClienteId(Long idc)
    {
        return clientesRepository.findById(idc);
    }

    @Override
    public List<Clientes> GetAllClientes()
    {
        return clientesRepository.findAll();
    }
}
