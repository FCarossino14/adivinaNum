
package excepciones;

public class NumeroFueraDeRangoException extends NumberFormatException{
    
    public NumeroFueraDeRangoException(String mensaje) {
            super(mensaje);
        }
    
}
