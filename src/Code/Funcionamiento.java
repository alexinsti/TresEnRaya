/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author damm
 */
public class Funcionamiento {
    
    private static String[] nombreFotos;
    private static boolean enJuego;
    private static String nombreJugador1;
    private static String nombreJugador2;
    private static boolean Turno1;
    private static int tipoJuego;//4 en raya, 4 en raya etc
    private static String[][] campo;

    public static String[] getNombreFotos() {
        return nombreFotos;
    }

    public static void setNombreFotos(String[] nombreFotos) {
        //recorro el la carpeta images listando elementos y los meto
        Funcionamiento.nombreFotos = nombreFotos;
    }

    public int getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(int tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public static String[][] getCampo() {
        return campo;
    }

    public static void setCampo(String[][] campo) {
        Funcionamiento.campo = campo;
    }

    public static boolean isEnJuego() {
        return enJuego;
    }

    public static void setEnJuego(boolean enJuego) {
        Funcionamiento.enJuego = enJuego;
    }

    public static String getNombreJugador1() {
        return nombreJugador1;
    }

    public static void setNombreJugador1(String nombreJugador1) {
        Funcionamiento.nombreJugador1 = nombreJugador1;
    }

    public static String getNombreJugador2() {
        return nombreJugador2;
    }

    public static void setNombreJugador2(String nombreJugador2) {
        Funcionamiento.nombreJugador2 = nombreJugador2;
    }

    public static boolean isTurno1() {
        return Turno1;
    }

    public static void setTurno1(boolean Turno1) {
        Funcionamiento.Turno1 = Turno1;
    }
    
    public static boolean compruebaFilas(){
        boolean resultado = false;
        for(String[] fila : Funcionamiento.campo){
            resultado=Funcionamiento.compruebaArray(fila);
            if(resultado){
                break;
            }
        }
        return resultado;
    }
    
    private static boolean compruebaArray(String[] fila){
        boolean resultado=true;
        String valorFila=Funcionamiento.valorArray(fila);
        for(String casilla : fila){
            if(!valorFila.equals("inicial") && !valorFila.equals(casilla)){
                resultado=false;
                break;
            }
        }
        return resultado;
    
    }
    
    private static String valorArray(String[] fila){
        String resultado="inicial";
        for(String casilla : fila){
                if(casilla!=null){
                    resultado=casilla;
                }
            }
        return resultado;
    }
    
    private static String[][] ExtraeColumnas(){
        String[][] columnas=campo;
        //es una matriz cuadrada así que la recorro entera así
        for(int i = 0 ; i<Funcionamiento.tipoJuego; i++){
            //recorro el array para darle valores
            for(int j = 0 ; i<Funcionamiento.tipoJuego; i++){
                columnas[i][j]=campo[j][i];
            }
        }
        
        return columnas;
    }
    
    private static String[][] ExtraeDiagonales(){
        String[][] diagonales=campo;
        int contadorI=0;
        int contadorJ=0;
        //es una matriz cuadrada así que la recorro entera así
        for(int i = 0 ; i<Funcionamiento.tipoJuego; i++){
            //recorro el array para darle valores
            for(int j = 0 ; i<Funcionamiento.tipoJuego; i++){
                diagonales[i][j]=campo[contadorI][contadorJ];
                contadorI++;
                contadorJ++;
            }
        }
        
        return diagonales;
    }
}
