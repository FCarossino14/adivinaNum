package adivinaNumero.vistas;

import java.awt.Color;
import java.awt.event.ActionListener;

public interface IVista {

    void addHandlerAdivinar(ActionListener al);

    void addHandlerReiniciar(ActionListener al);

    void addHandlerMostrarInfo(ActionListener al);

    void activarBotonAdivinar(boolean flag);

    void iniciar();

    void reiniciar();

    void adivinar(String mensajeInfo);

    void mostrarTurnos(int numeroTurnos);

    void mostrarMensaje(String mensaje);

    void mostrarMensajeInfo(String mensaje);

    void mostrarMensajeError(String mensaje);

    String getTextUsuario();

    void cambiarColorInfo(Color co);

    void noSePuedeSeguir(int numero, String mensaje);

}
