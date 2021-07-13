package segurosbolivar.taller13.repository;

import segurosbolivar.taller13.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,Long>  {
}
