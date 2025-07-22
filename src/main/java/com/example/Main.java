package com.example;

public class Main {
    public static void main(String[] args) {

        Estadio estadio1 = new Estadio();
        estadio1.nombre = "Estadio Metropolitano";
        estadio1.ubicacion = "Barranquilla";
        estadio1.capacidad = 68000;

        Estadio estadio2 = new Estadio();
        estadio2.nombre = "Estadio El Campín";
        estadio2.ubicacion = "Bogotá";
        estadio2.capacidad = 36000;
        
        estadio1.mostrarInformacion();
        System.err.println();
        estadio2.mostrarInformacion();

        JugadorFutbol jugador1 = new JugadorFutbol();
        jugador1.nombre = "Carlos Bacca";
        jugador1.edad = 32;
        jugador1.posicion = "Delantero";
        jugador1.golesMarcados = 18;

        JugadorFutbol jugador2 = new JugadorFutbol();
        jugador2.nombre = "James Rodríguez";
        jugador2.edad = 30;
        jugador2.posicion = "Centrocampista";
        jugador2.golesMarcados = 10;

        JugadorFutbol jugador3 = new JugadorFutbol();
        jugador3.nombre = "David Ospina";
        jugador3.edad = 34;
        jugador3.posicion = "Portero";
        jugador3.golesMarcados = 0;

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        jugador1.cambiarPosicion("Extremo Izquierdo");
        jugador2.cambiarPosicion("Delantero");
        jugador3.cambiarPosicion("Defensa");
    }
}

