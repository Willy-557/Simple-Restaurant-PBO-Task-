/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.tugas.pbo;

import java.util.Scanner;

public class RestaurantTugasPBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        while (true) {
            System.out.println("---------------------Landing---------------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            
            System.out.print(">> ");
            int pilihan1 = scanner.nextInt();
            
            if (pilihan1 > 3 || pilihan1 < 1) {
                System.out.println("Anda harus memilih menu 1 - 3!, tidak bisa menu lain");
            }

        }
    }
    
}
