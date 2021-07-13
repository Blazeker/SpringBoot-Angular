package segurosbolivar.taller13.repository;

import segurosbolivar.taller13.model.Detalles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesRepository extends JpaRepository <Detalles,Long> {
}
