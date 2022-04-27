/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop10;

/**
 * Clase que indica las funciones y metodos de 
 * un intrumento de viento esta hereda de la 
 * clase IntrumentoViento
 * @author alumno
 */
public class Flauta extends IntrumentoViento{
    
    /**
     * contructor vacio
     */
    public Flauta() {
    }
    /**
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    public String TipoIntrumento(){
        return "Flauta";
    }
}
