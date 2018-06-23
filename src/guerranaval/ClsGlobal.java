
package guerranaval;

class ClsGlobal {

    //MultiJugador true = 2 jugadores, false = 1 jugador
    static boolean MultiJugador;
    //Confirmacion1 true = El jugador 1 ya puso sus barcos, false = el jugador 1 no ah puesto sus barcos
    static boolean Confirmacion1;
    //Confirmacion2 true = El jugador 2 ya puso sus barcos, false = el jugador 2 no ah puesto sus barcos
    static boolean Confirmacion2;
    /*
    Matriz1 es una matriz de 10x10 en la que guardamos el mapa del jugador1
    estados
    0 = no hay barco en esta posicion
    1 = si hay barco en esta posicion
    2 = disparo acertado
    3 = disparo no acertado
    */
    static int[][] Matriz1 = new int[10][10];
    /*
    Matriz2 es una matriz de 10x10 en la que guardamos el mapa del jugador2
    estados
    0 = no hay barco en esta posicion
    1 = si hay barco en esta posicion
    2 = disparo acertado
    3 = disparo no acertado
    */
    static int[][] Matriz2 = new int[10][10];
    
    
}
