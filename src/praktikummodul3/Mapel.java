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
public class Mapel extends Sekolah {

    private String f = "a. Fisika";
    private String m = "b. Matematika";

    protected void mapel() {
        System.out.println("Daftar Mapel         : " + f + "\n" 
                + "                       " + m);
    }

}
