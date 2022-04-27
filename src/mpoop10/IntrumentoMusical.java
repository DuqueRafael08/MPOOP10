/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mpoop10;

/**
 * 
 * @author alumno
 */
public interface IntrumentoMusical {
    /**
     * por defecto todos los métodos definidos dentro
     * de una interfaz son publicos y abstractos
     */
    
    /**
     * afinar y tocar  
     * sin funcionalidad (abstractos)
     */
    void afinar();
    void tocar();
    /**
     * Modificar o sobreescribe 
     * el comportamiento de los métodos
     * @return 
     */
    String tipoIntrumento();
    
}