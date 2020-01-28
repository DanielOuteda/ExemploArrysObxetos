/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysobxetos;

/**
 *
 * @author doutedasolla
 */
public class ExemploArraysObxetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador[] futbol = new Xogador[Metodos.elementos()];
        Metodos obx = new Metodos();
        futbol = obx.crearArarray(futbol);
        obx.amosaArray(futbol);
    }

}
