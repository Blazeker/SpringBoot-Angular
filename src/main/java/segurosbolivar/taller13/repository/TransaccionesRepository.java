package segurosbolivar.taller13.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import segurosbolivar.taller13.model.Factura;

@Repository
public interface TransaccionesRepository extends JpaRepository<Factura,Long> {

    @Autowired
    @Query(value = "{call COMISION_INCREMENTAL_INDIVIDUAL(:idCliente)}", nativeQuery = true)
    void comisionIncremental(@Param("idCliente") Long idCliente);


}
