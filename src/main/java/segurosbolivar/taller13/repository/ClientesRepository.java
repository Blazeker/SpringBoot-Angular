package segurosbolivar.taller13.repository;

import segurosbolivar.taller13.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository <Clientes,Long> {
}
