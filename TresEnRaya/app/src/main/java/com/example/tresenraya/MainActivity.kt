package com.example.tresenraya

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bClick(view:View){

        val botonPulsado = view as Button
        var idCelda = 0
        when (botonPulsado.id){
            R.id.butt1 -> idCelda = 1
            R.id.butt2 -> idCelda = 2
            R.id.butt3 -> idCelda = 3
            R.id.butt4 -> idCelda = 4
            R.id.butt5 -> idCelda = 5
            R.id.butt6 -> idCelda = 6
            R.id.butt7 -> idCelda = 7
            R.id.butt8 -> idCelda = 8
            R.id.butt9 -> idCelda = 9

        }

        playGame(idCelda,botonPulsado)


    }

    var jugador1 = ArrayList<Int>()
    var jugador2 = ArrayList<Int>()

    var turnoJugador = 1

    private fun playGame(cellID: Int, bSelect: Button) {

        if(turnoJugador ==1){
            bSelect.text = "X"
            bSelect.setBackgroundColor(Color.parseColor("#ff5946"))
            jugador1.add(cellID)
            turnoJugador = 2
        }else{
            bSelect.text = "0"
            bSelect.setBackgroundColor(Color.parseColor("#46A4FF"))
            jugador2.add(cellID)
            turnoJugador = 1
        }

        bSelect.isEnabled = false

        comprobarGanador()

    }

    private fun comprobarGanador() {
        var ganador = -1
/* tres en raya primera fila*/
        if(jugador1.contains(1) && jugador1.contains(2) && jugador1.contains(3)){
            ganador = 1
        }
        if(jugador2.contains(1) && jugador2.contains(2) && jugador2.contains(3)){
            ganador = 2
        }

/* tres en raya segunda fila*/
        if(jugador1.contains(4) && jugador1.contains(5) && jugador1.contains(6)){
            ganador = 1
        }
        if(jugador2.contains(4) && jugador2.contains(5) && jugador2.contains(6)){
            ganador = 2
        }

/* tres en raya tercera fila*/
        if(jugador1.contains(7) && jugador1.contains(8) && jugador1.contains(9)){
            ganador = 1
        }
        if(jugador2.contains(7) && jugador2.contains(8) && jugador2.contains(9)){
            ganador = 2
        }


/*tres en raya primera columna*/
        if(jugador1.contains(1) && jugador1.contains(4) && jugador1.contains(7)){
            ganador = 1
        }
        if(jugador2.contains(1) && jugador2.contains(4) && jugador2.contains(7)){
            ganador = 2
        }
/*tres en raya segunda columna*/
        if(jugador1.contains(2) && jugador1.contains(5) && jugador1.contains(8)){
            ganador = 1
        }
        if(jugador2.contains(2) && jugador2.contains(5) && jugador2.contains(8)){
            ganador = 2
        }

/*tres en raya tercera columna*/
        if(jugador1.contains(3) && jugador1.contains(6) && jugador1.contains(9)){
            ganador = 1
        }
        if(jugador2.contains(3) && jugador2.contains(6) && jugador2.contains(9)){
            ganador = 2
        }

/* tres en rayas en diagonal */
        if(jugador1.contains(1) && jugador1.contains(5) && jugador1.contains(9)){
            ganador = 1
        }
        if(jugador2.contains(1) && jugador2.contains(5) && jugador2.contains(9)){
            ganador = 2
        }
        if(jugador1.contains(3) && jugador1.contains(5) && jugador1.contains(7)){
            ganador = 1
        }
        if(jugador2.contains(3) && jugador2.contains(5) && jugador2.contains(7)){
            ganador = 2
        }

/*Anuncio del ganador*/

        if (ganador != -1){
            if (ganador==1){
                Toast.makeText(this," ¡¡¡La victoria es para el Jugador 1!!!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this," ¡¡¡La victoria es para el Jugador 2!!!", Toast.LENGTH_LONG).show()
            }



        }



    }
}
/*TODO
*
* - Conseguir que cuando un jugador gane la partida el juego se pare
*
* - Botón de reiniciado de partida
*
* - Indicador del turno
*
* - Fuente mas grande y que resalte
*
* - Contador de partidas ganadas
*
* - Traducir al inglés
*
*
*
* */

