package segurosbolivar.taller13.services;

import segurosbolivar.taller13.model.Archivos;
import org.springframework.stereotype.Service;
import segurosbolivar.taller13.repository.ArchivosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivosServiceImpl implements ArchivosService{
    private final ArchivosRepository archivosRepository;

    public ArchivosServiceImpl(ArchivosRepository archivosRepository) {
        this.archivosRepository = archivosRepository;
    }

    @Override
    public Archivos GetById(Long idc)
    {
        return archivosRepository.getOne(idc);
    }

    @Override
    public List<Archivos> GetAll()
    {
        return archivosRepository.findAll();
    }
}
