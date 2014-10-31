/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jplayground;

/**
 *
 * @author georgvogiatzis
 */
public class KlasseAB {

    public static void main(String[] args) {
        KlasseA einA = new KlasseA();
        KlasseB einB = new KlasseB();

        einA.setName("Vogiatzis");
        einA.setVorname("Georg");
        einB.setAdresse("Wetzikon");
        System.out.println("Hallo " + einA.getVorname() + " " + einA.getName() + " aus " + einB.getAdresse());

        if (einB instanceof KlasseA) {
            System.out.println("true");
        }
    }
}
