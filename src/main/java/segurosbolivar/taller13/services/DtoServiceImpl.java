package segurosbolivar.taller13.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import segurosbolivar.taller13.model.Clientes;
import segurosbolivar.taller13.model.Factura;

public class DtoServiceImpl {

    @Autowired
    private DtoService dtoService;

    @Autowired
    private ModelMapper modelMapper;

    public void getClienteById(Clientes clientes, Factura factura)
    {
        /*
        ClientesDTO dto = new ClientesDTO();
        dto.setIdCliente(clientes.getIdCliente());
        dto.setSaldoPendiente(clientes.getSaldoPendiente());
        dto.setConvenio(clientes.getConvenio());
        dto.setValorPagado(factura.getValorPagado());
        dto.setTipoComision(factura.getTipoComision());

        return dto;
        */
    }

}
