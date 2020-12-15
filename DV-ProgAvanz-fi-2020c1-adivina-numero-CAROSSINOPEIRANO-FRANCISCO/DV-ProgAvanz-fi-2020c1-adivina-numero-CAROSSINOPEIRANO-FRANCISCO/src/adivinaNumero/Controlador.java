package adivinaNumero;

import adivinaNumero.modelo.Modelo;
import adivinaNumero.vistas.*;
import excepciones.NumeroFueraDeRangoException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    private IVista vista;
    
    private Modelo modelo;

    public Controlador(IVista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar() {
        this.modelo.iniciar();
        this.vista.iniciar();
        this.vista.mostrarTurnos(this.modelo.getTurnos());
        this.vista.addHandlerAdivinar(new HandlerAdivinar());
        this.vista.addHandlerReiniciar(new HandlerReiniciar());
        this.vista.addHandlerMostrarInfo(new HandlerMostrarInfo());
    }

    private void adivinar() {
        try{
            this.modelo.revisarEstado(this.modelo.getEstado());
            if(this.modelo.getSePuedeSeguir()){
                this.modelo.adivinar(this.vista.getTextUsuario());
                this.vista.adivinar(this.modelo.getEstado().getMensaje());
            }else{
                this.vista.noSePuedeSeguir(this.modelo.getNumero(), this.modelo.getEstado().getMensaje());
            }
        } catch (NumeroFueraDeRangoException e) {
            this.vista.mostrarMensajeError(e.getMessage());
        } catch (NumberFormatException e) {
            this.vista.mostrarMensajeError(e.getMessage());
        }
            this.vista.mostrarTurnos(this.modelo.getTurnos());
    }

    private void reiniciar() {
        this.modelo.reiniciar();
        this.vista.reiniciar();
        this.vista.mostrarTurnos(this.modelo.getTurnos());
    }

    private void mostrarInfo() {
        this.vista.mostrarMensajeInfo(this.modelo.getMsjInfo());
    }

    private class HandlerAdivinar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            adivinar();
        }

    }

    private class HandlerReiniciar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            reiniciar();
        }

    }

    private class HandlerMostrarInfo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            mostrarInfo();
        }

    }

}
