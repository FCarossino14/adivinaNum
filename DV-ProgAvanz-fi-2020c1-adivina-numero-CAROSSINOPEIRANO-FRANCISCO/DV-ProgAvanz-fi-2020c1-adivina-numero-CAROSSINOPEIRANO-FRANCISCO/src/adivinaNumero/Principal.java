package adivinaNumero;

import adivinaNumero.modelo.Modelo;
import adivinaNumero.vistas.*;

public class Principal {

    public static void main(String[] args) {
        
        IVista vista = new VistaSwing();
        Modelo modelo = new Modelo();
        Controlador c = new Controlador(vista, modelo);
        c.iniciar();
    }

}
