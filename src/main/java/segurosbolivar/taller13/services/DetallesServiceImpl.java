package segurosbolivar.taller13.services;

import org.springframework.stereotype.Service;
import segurosbolivar.taller13.model.Clientes;
import segurosbolivar.taller13.model.Detalles;
import segurosbolivar.taller13.repository.DetallesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesServiceImpl implements DetallesService{
    private final DetallesRepository detallesRepository;

    public DetallesServiceImpl(DetallesRepository detallesRepository) {
        this.detallesRepository = detallesRepository;
    }

    @Override
    public Optional<Detalles> GetDetallesId(Long idc)
    {
        return detallesRepository.findById(idc);
    }

    @Override
    public List<Detalles> GetAllDetalles()
    {
        return detallesRepository.findAll();
    }
}
