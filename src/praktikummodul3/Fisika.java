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
public class Fisika extends Mapel {

    private String n = "Bp. Diaur Rahman";
    private String p = "tentang usaha dan energi";

    protected void namaGuru() {
        System.out.println();
        System.out.println("Nama Guru Fisika     : " + n);
    }
    protected void materi(){
        System.out.println("Materi               : " + p);
    }
}
