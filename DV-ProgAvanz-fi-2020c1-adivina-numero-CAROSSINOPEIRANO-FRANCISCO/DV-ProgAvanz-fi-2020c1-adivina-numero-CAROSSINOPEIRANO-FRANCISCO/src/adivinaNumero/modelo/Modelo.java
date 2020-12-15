package adivinaNumero.modelo;

import static adivinaNumero.modelo.Estado.*;
import excepciones.NumeroFueraDeRangoException;
import java.util.Random;


public class Modelo {
    
    private final int NUM_MAX = 100;
    private final int NUM_MIN = 1;
    private final int NUM_TURNOS = 7;
    private int numSistema;
    private int contadorTurnos;
    private final String MENSAJE_INFO = "Usted debe adivinar un número entre 1 y 100 en un maximo de 7 intentos. En cada intento, la máquina informa si se ha logrado adivinar el número o si fue mayor o menor al esperado. Si el usuario no lograr adivinar en un máximo de 7 intentos, el juego termina. Pista: Si usted pone el numero que divide al intervalo (donde podria estar el numero) al medio, no puede perder nunca, ya que 2 (dividir por dos) elevado a la 7 (turnos) da 128 que es el numero maximo que se puede adivinar 100% de las veces con 7 turnos.";
    private Estado estado;
    private boolean sePuedeSeguir;
    
    public void iniciar(){
        generarNumero();
        contadorTurnos = 0;
        sePuedeSeguir = true;
        estado = INICIO;
    }
    
    public void reiniciar() {
        generarNumero();
        contadorTurnos = 0;
        sePuedeSeguir = true;
        estado = INICIO;
    }
    
    public void adivinar(String input){
            revisarInputUsuario(input);
            contadorTurnos ++;
            cambiarEstado(pasarInputANum(input));
    }
    
    private void cambiarEstado(int num){
        if (numSistema == num){
            estado = IGUAL;
        }else if(this.contadorTurnos >= NUM_TURNOS){
            estado = SIN_TURNOS;
        }else if (numSistema > num){
            estado = MAYOR;
        }else{
            estado = MENOR;
        }
    }
    
    public void revisarEstado(Estado estado){
        if (estado == IGUAL || estado == SIN_TURNOS){
            sePuedeSeguir = false;
        }
    }
    
    private void revisarInputUsuario(String input) throws NumeroFueraDeRangoException {
        if (pasarInputANum(input) < NUM_MIN || pasarInputANum(input) > NUM_MAX) {
            throw new NumeroFueraDeRangoException("Ingrese un número del 1 al 100.");
        }
    }
    
    private int pasarInputANum(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("\"" + input + "\" no es un número. Ingrese un número del 1 al 100.");
        }
    }
    
    private void generarNumero() {
        Random rnd = new Random();
        numSistema = rnd.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;
    }
        
    public int getTurnos(){
        return contadorTurnos;
    }
    
    public int getNumero(){
        return numSistema;
    
    }
    
    public String getMsjInfo(){
        return MENSAJE_INFO;
    
    }
    
    public Estado getEstado(){
        return estado;
    
    }

    public boolean getSePuedeSeguir() {
        return sePuedeSeguir;
    }
}
