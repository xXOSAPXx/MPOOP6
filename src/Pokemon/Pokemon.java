/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

/**
 *
 * @author Galba
 */
public class Pokemon {
    private String color;
    private String nombre;
    private String especie;
    private int dificultad;
    private int tamanio;
    

    /**
     * Constructor vacío que inicializa un Pokémon sin parámetros.
     */
    public Pokemon() {
    }

    /**
     * Constructor que inicializa un Pokémon con las características básicas.
     *
     * @param color      Color del Pokémon.
     * @param nombre     Nombre del Pokémon.
     * @param especie    Especie o tipo del Pokémon (e.g., agua, fuego, roca).
     * @param dificultad Nivel de dificultad para capturarlo (0 a 100).
     * @param tamanio    Tamaño del Pokémon en centímetros.
     */
    public Pokemon(String color, String nombre, String especie, int dificultad, int tamanio) {
        this.color = color;
        this.nombre = nombre;
        this.especie = especie;
        this.dificultad = dificultad;
        this.tamanio = tamanio;
    }

    /**
     * Obtiene el color del Pokémon.
     *
     * @return El color del Pokémon.
     */
    public String getColor() {
        return color;
    }

    /**
     * Modifica el color del Pokémon.
     *
     * @param color Nuevo color del Pokémon.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la especie del Pokémon.
     *
     * @return La especie del Pokémon.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Modifica la especie del Pokémon.
     *
     * @param especie Nueva especie del Pokémon (e.g., agua, fuego, roca).
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtiene el nivel de dificultad para capturar al Pokémon.
     *
     * @return La dificultad para capturarlo.
     */
    public int getDificultad() {
        return dificultad;
    }

    /**
     * Modifica la dificultad para capturar al Pokémon.
     *
     * @param dificultad Nueva dificultad para capturarlo (debe estar entre 0 y
     *                   100).
     */
    public void setDificultad(int dificultad) {
        if (dificultad < 0) {
            System.out.println("Dificultad inválida");
        } else if (dificultad > 100) {
            System.out.println("");
        } else {
            this.dificultad = dificultad;
        }
    }

    /**
     * Obtiene el nombre del Pokémon.
     *
     * @return El nombre del Pokémon.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del Pokémon.
     *
     * @param nombre Nuevo nombre del Pokémon.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tamaño del Pokémon.
     *
     * @return El tamaño del Pokémon en centímetros.
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * Modifica el tamaño del Pokémon.
     *
     * @param tamanio Nuevo tamaño del Pokémon en centímetros.
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Realiza la acción de ataque.
     */
    public void atacar() {
        System.out.println(nombre + " ataca");
    }

    /**
     * Realiza la acción de defensa.
     */
    public void defender() {
        System.out.println(nombre + " se defiende");
    }

    /**
     * Realiza la acción de curarse.
     */
    public void curarse() {
        System.out.println(nombre + " se curó");
    }

    /**
     * Realiza la acción de retirarse.
     */
    public void retirarse() {
        System.out.println(nombre + " se retiró");
    }
}
