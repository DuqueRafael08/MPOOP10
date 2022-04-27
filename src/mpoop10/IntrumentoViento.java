/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop10;

/**
 * Clase que indica las funciones y metodos de 
 * un intrumento de viento esta hereda de la 
 * clase IntrumentoMusical
 * @author alumno
 */
public class IntrumentoViento extends Object implements IntrumentoMusical{
    
    /**
     * metodo que afina el intrumento de viento
     */
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }
    /**
     * metodo que imprime cuando tocas un intrumento de viento
     */
    @Override
    public void tocar() {
        System.out.println("Tocando intrumento de viento");
    }
    /**
     * metodo que imprime un intrumento de viento
     * @return 
     */
    @Override
    public String tipoIntrumento() {
        return"intrumento de viento";
    }
    
}
