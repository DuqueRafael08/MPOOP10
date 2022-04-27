/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop10;

/**
 *
 * @author alumno
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     * Archivo principal main
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flauta flauta =new Flauta();
        System.out.println(flauta.TipoIntrumento());
        
        IntrumentoMusical intrumento = flauta;
        intrumento.tocar();
        intrumento.afinar();
        double pi = Math.PI;
        double e = Math.E;
        System.out.println(pi);
        System.out.println(e);
        System.out.println(Math.abs(-100));
        
        System.out.println("El mes "+Meses.NUEVE+" corresponde a "+Meses.NOMBRES_MESES[Meses.NUEVE]);   
    }
}
