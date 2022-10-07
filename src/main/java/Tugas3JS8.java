//Created by 21343033_Nicholas Ryan Jonathan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Tugas3JS8 {
    public static void main(String[] args) {
        String[][] alamat = {
            { "Florence", "735-1234", "Manila" },
            { "Joyce", "983-3333", "Quezon City" },
            { "Becca", "456-3322", "Manila" }
        };
        for (int i = 0; i < alamat.length; i++) {
            System.out.println("Name    : " + alamat[i][0]);
            System.out.println("Tel. #  : " + alamat[i][1]);
            System.out.println("Adress  : " + alamat[i][2]);
            System.out.println("");
        }
    }
}
