//Created by 21343033_Nicholas Ryan Jonathan
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Tugas2JS8 {
    public static void main(String[] args) {
        int[] nomor = new int[11];
        String[] n = new String[11];
        int terbesar = 0;
        
        for (int i = 1; i < nomor.length; i++) {
            n[i] = JOptionPane.showInputDialog("Masukkan nilai ke-" + i + " : ");
            nomor[i] = Integer.parseInt(n[i]);
            if(terbesar > nomor[i]){
                if (terbesar > nomor[i]){
                    terbesar = terbesar;
                }
            }
            else {
                if(nomor[i] > nomor[i-1]){
                    terbesar = nomor[i];
                }
                else {
                    terbesar = nomor[i-1];
                }
            }
        }
        String hasil = "Terbesar adalah " + terbesar;
        JOptionPane.showMessageDialog(null, hasil);
    }
}
