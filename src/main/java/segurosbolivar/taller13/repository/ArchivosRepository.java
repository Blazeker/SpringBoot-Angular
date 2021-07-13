package segurosbolivar.taller13.repository;


import segurosbolivar.taller13.model.Archivos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivosRepository extends JpaRepository <Archivos,Long> {
}
