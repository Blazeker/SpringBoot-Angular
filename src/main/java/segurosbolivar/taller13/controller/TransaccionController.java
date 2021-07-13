package segurosbolivar.taller13.controller;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import segurosbolivar.taller13.exceptions.ResourceNotFoundException;
import segurosbolivar.taller13.model.Clientes;
import segurosbolivar.taller13.model.Factura;
import segurosbolivar.taller13.repository.TransaccionesRepository;
import segurosbolivar.taller13.services.ClientesService;


import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


@Transactional
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TransaccionController {
    private final TransaccionesRepository transaccionesRepository;
    private final ClientesService clientesService;

    public TransaccionController(TransaccionesRepository transaccionesRepository, ClientesService clientesService) {
        this.transaccionesRepository = transaccionesRepository;
        this.clientesService = clientesService;
    }

    @PutMapping("/transacciones/incremental/")
    public void incremental(@RequestParam("idCliente") Long idCliente)
    {
        try
        {
            transaccionesRepository.comisionIncremental(idCliente);
        }
        catch (ResourceNotFoundException e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente no encontrado", e);
        }
        catch (NegativeArraySizeException e)
        {

        }
    }



    @PostMapping("/archivo/recibir")
    public void cargarArchivo(@RequestParam(name = "File") MultipartFile archivo) throws IOException {
        InputStream initialStream = archivo.getInputStream();
        byte[] buffer = new byte[initialStream.available()];
        initialStream.read(buffer);
        int incremento = 1;
        String[] test = null;
        ArrayList<String> datos = new ArrayList<>();
        ArrayList<String> informacion = new ArrayList<>();
        File targetFile = new File("H:\\Me\\Archivo\\test1.txt");
        while(targetFile.exists())
        {
            incremento++;
            targetFile = new File("H:\\Me\\Archivo\\test1" + incremento + ".txt");
        }
        try (OutputStream outStream = new FileOutputStream(targetFile)) {
            outStream.write(buffer);
        }
        try {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader(targetFile));
            String line = reader.readLine();
            while (line != null)
            {
                    if(line.equals(""))
                    {
                        line = reader.readLine();
                        continue;
                    }
                    test = line.split(":\\s");
                    informacion.add(test[0]);
                    datos.add(test[1]);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        String[] arrayInfo = informacion.toArray(new String[0]);
        String[] arrayData = new String[datos.size()];
        arrayData = datos.toArray(arrayData);
        Factura factura = new Factura();
        Long [] arr = new Long [arrayData.length];
        int x = 0;
        for (String i: arrayData)
        {
            try{
                arr[x] = Long.parseLong(i);
            } catch(NumberFormatException ex) {
                System.out.println("Es un string");
            }
            x++;
        }
        x = 0;
        List<Clientes> clientes;
        clientes = clientesService.GetAllClientes();
        int inconsistencias = 0;
        boolean encontrado = false;
        for (Long i: arr)
        {
            if(arrayInfo[x].equals("id cliente"))
            {
                for (Clientes clientesDB : clientes)
                {
                    if(i.equals(clientesDB.getIdCliente()))
                    {
                        encontrado = true;
                        break;
                    }
                    else
                    {
                        encontrado = false;
                    }
                }
                if (encontrado == false)
                {
                    inconsistencias += 1;
                }
            }
            if (arrayInfo[x].equals("numero factura"))
            {
                for (Clientes clientesDB : clientes)
                {
                    if(i.equals(clientesDB.getNroFactura()))
                    {
                        System.out.println("super buena crack");
                        encontrado = true;
                        break;
                    }
                    else
                    {
                        encontrado = false;
                    }
                }
                if (encontrado == false)
                {
                    inconsistencias += 1;
                }
            }
            if(arrayInfo[x].equals("registro pagos"))
            {
                factura.setPagosRealizados(i);
            }
            if(arrayInfo[x].equals("valor pagado"))
            {
                factura.setValorPagado(i);
            }
            if(arrayInfo[x].equals("mes facturado"))
            {
                factura.setMesFacturado(i);
            }
            if(arrayInfo[x].equals("entidad recaudo"))
            {
                factura.setTipoComision(i);
                if(i == 1){
                    factura.setnombreEntidad("Bancaria");
                    factura.setConvenio("Si");
                }
                if(i == 2)
                {
                    factura.setnombreEntidad("Virtual");
                    factura.setConvenio("Si");
                }
                if(i == 3)
                {
                    factura.setnombreEntidad("Movil");
                    factura.setConvenio("No");
                }
            }
            x++;
        }
        System.out.println(inconsistencias);
        // factura.setComisionTotal(0L);
        // return facturaService.saveFactura(factura);
    }


}
