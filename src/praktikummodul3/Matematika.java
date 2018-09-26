/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikummodul3;

/**
 *
 * @author ASUS
 */
public class Matematika extends Mapel {

    private String n = "Bp. Tulus";
    private String p = "tentang nilai mutlak";

    protected void mat() {
        System.out.println();
        System.out.println("Nama Guru Matematika : " + n);
    }

    protected void mate() {
        System.out.println("Materi               : " + p);
    }

}
