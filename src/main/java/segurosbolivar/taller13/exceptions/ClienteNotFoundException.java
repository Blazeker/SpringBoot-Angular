package segurosbolivar.taller13.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cliente no encontrado")
public class ClienteNotFoundException extends Exception{
}
