                 
package guerranaval;

class ClsGlobal {

    //MultiJugador true = 2 jugadores, false = 1 jugador
    static boolean MultiJugador;
    //Confirmacion1 true = El jugador 1 ya puso sus barcos, false = el jugador 1 no ah puesto sus barcos
    static boolean Confirmacion1;
    //Confirmacion2 true = El jugador 2 ya puso sus barcos, false = el jugador 2 no ah puesto sus barcos
    static boolean Confirmacion2;
    //Arma ametralladora jugador 1
    static int Ametralladora1;
    //Arma Misil jugador 1
    static int Misil1;
    //Arma Bomba Nuclear jugador 1
    static int BombaNuclear1;
    
    //Arma ametralladora jugador 2
    static int Ametralladora2;
    //Arma Misil jugador 2
    static int Misil2;
    //Arma Bomba Nuclear jugador 2
    static int BombaNuclear2;
    /*
    Matriz1 es una matriz de 10x10 en la que guardamos el mapa del jugador1
    estados
    0 = no hay barco en esta posicion
    1 = disparo no acertado
    Estos van a ser los barcos pequeños en horizontal
    el primer barco pequeño - 101
    el segundo barco pequeño - 102
    el tercero barco pequeño - 103
    el cuarto barco pequeño - 104

    Estos van a ser los barcos pequeños disparados en horizontal
    el primer barco pequeño - 121
    el segundo barco pequeño - 122
    el tercero barco pequeño - 123
    el cuarto barco pequeño - 124

    Estos van a ser los barcos pequeños en vertical
    el primer barco pequeño - 111
    el segundo barco pequeño - 112
    el tercero barco pequeño - 113
    el cuarto barco pequeño - 114

    Estos van a ser los barcos pequeños disparados en vertical
    el primer barco pequeño - 131
    el segundo barco pequeño - 132
    el tercero barco pequeño - 133
    el cuarto barco pequeño - 134

    Estos van a ser los barcos medianos en horizontal
    el primer barco mediano - 201
    el segundo barco mediano - 202
    el tercero barco mediano - 203

    Estos van a ser los barcos medianos disparados en horizontal
    el primer barco mediano - 221
    el segundo barco mediano - 222
    el tercero barco mediano - 223

    Estos van a ser los barcos medianos en vertical
    el primer barco mediano - 211
    el segundo barco mediano - 212
    el tercero barco mediano - 213

    Estos van a ser los barcos medianos disparados en vertical
    el primer barco mediano - 231
    el segundo barco mediano - 232
    el tercero barco mediano - 233

    Estos van a ser los barcos grandes en horizontal
    el primer barco grande - 301
    el segundo barco grande - 302

    Estos van a ser los barcos grandes disparados en horizontal
    el primer barco grande - 321
    el segundo barco grande - 322

    Estos van a ser los barcos grandes en vertical
    el primer barco grande - 311
    el segundo barco grande - 312

    Estos van a ser los barcos grandes disparados en vertical
    el primer barco grande - 331
    el segundo barco grande - 332
    */
    static int[][] Matriz1 = new int[10][10];
    /*
    Matriz2 es una matriz de 10x10 en la que guardamos el mapa del jugador2
    estados
    0 = no hay barco en esta posicion
    1 = disparo no acertado
    Estos van a ser los barcos pequeños en horizontal
    el primer barco pequeño - 101
    el segundo barco pequeño - 102
    el tercero barco pequeño - 103
    el cuarto barco pequeño - 104

    Estos van a ser los barcos pequeños disparados en horizontal
    el primer barco pequeño - 121
    el segundo barco pequeño - 122
    el tercero barco pequeño - 123
    el cuarto barco pequeño - 124

    Estos van a ser los barcos pequeños en vertical
    el primer barco pequeño - 111
    el segundo barco pequeño - 112
    el tercero barco pequeño - 113
    el cuarto barco pequeño - 114

    Estos van a ser los barcos pequeños disparados en vertical
    el primer barco pequeño - 131
    el segundo barco pequeño - 132
    el tercero barco pequeño - 133
    el cuarto barco pequeño - 134

    Estos van a ser los barcos medianos en horizontal
    el primer barco mediano - 201
    el segundo barco mediano - 202
    el tercero barco mediano - 203

    Estos van a ser los barcos medianos disparados en horizontal
    el primer barco mediano - 221
    el segundo barco mediano - 222
    el tercero barco mediano - 223

    Estos van a ser los barcos medianos en vertical
    el primer barco mediano - 211
    el segundo barco mediano - 212
    el tercero barco mediano - 213

    Estos van a ser los barcos medianos disparados en vertical
    el primer barco mediano - 231
    el segundo barco mediano - 232
    el tercero barco mediano - 233

    Estos van a ser los barcos grandes en horizontal
    el primer barco grande - 301
    el segundo barco grande - 302

    Estos van a ser los barcos grandes disparados en horizontal
    el primer barco grande - 321
    el segundo barco grande - 322

    Estos van a ser los barcos grandes en vertical
    el primer barco grande - 311
    el segundo barco grande - 312

    Estos van a ser los barcos grandes disparados en vertical
    el primer barco grande - 331
    el segundo barco grande - 332
    */
    static int[][] Matriz2 = new int[10][10];
    
    
}
