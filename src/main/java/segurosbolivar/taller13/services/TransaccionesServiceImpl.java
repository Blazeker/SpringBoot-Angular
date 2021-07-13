package segurosbolivar.taller13.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import segurosbolivar.taller13.model.Factura;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
@Repository
public class TransaccionesServiceImpl implements TransaccionesService {

    private SimpleJdbcCall comisionFija = new SimpleJdbcCall(dataSource)
            .withProcedureName("COMISION_FIJA")
            .returningResultSet("factura", new RowMapper<Factura>() {
                @Override
                public Factura mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Factura factura = new Factura();

                    factura.setIdCliente(rs.getLong("idCliente"));
                    factura.setComisionTotal(rs.getLong("comisionTotal"));

                    return factura;
                }
            });


    @Autowired
    public void setDataSourcel(DataSource dataSource)
    {
        this.comisionFija = new SimpleJdbcCall(dataSource).withFunctionName("COMISION_FIJA");
    }

    @Override
    public void comisionFija()
    {
        fullName = comisionFija.executeFunction(void.class);
        fullName;
        Factura factura1

        SqlParameterSource inParams = new MapSqlParameterSource()
                                      .addValue("");
    }


}
*/
