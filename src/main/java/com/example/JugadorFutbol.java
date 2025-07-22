package com.example;

public class JugadorFutbol {
    String nombre;
    int edad;
    String posicion;
    int golesMarcados;

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años, juego como " + posicion + " y he marcado " + golesMarcados + " goles.");
    }

    public void cambiarPosicion(String nuevaPosicion) {
        this.posicion = nuevaPosicion;
        System.out.println(nombre + " ha cambiado su posición a " + nuevaPosicion + ".");
    }

}
