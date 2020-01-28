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
public class Metodos {

    public static int elementos() {
        return PedirDato.pedirInt("Numero de xogadores en el equipo = ");
    }

    public Xogador[] crearArarray(Xogador[] xogadores) {
        String nom;
        int dor;
        for (int i = 0; i < xogadores.length; i++) {
            nom = PedirDato.pedirNome("Nome = ");
            dor = PedirDato.pedirInt("Dorsal = ");
            xogadores[i] = new Xogador(nom, dor);
//            xogadores[i] = new Xogador (PedirDato.pedirNome(),PedirDato.pedirInt());
        }
        return xogadores;

    }

    public void amosaArray(Xogador[] lista) {
        for (Xogador elemento : lista) {
            System.out.println(elemento);
        }
    }

}
