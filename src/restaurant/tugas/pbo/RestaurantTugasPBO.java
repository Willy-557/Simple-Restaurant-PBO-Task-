package restaurant.tugas.pbo;

import java.util.Scanner;

public class RestaurantTugasPBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] arrNamaUser = new String[100];
        String[] arrPassUser = new String[100];

        int ctr_user = 0;
        
        while (true) {
            System.out.println("---------------------Landing---------------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            
            System.out.print(">> ");
            int pilihan1 = scanner.nextInt();
            
            if (pilihan1 == 3) {
                System.out.println("Terimakasih!");
                break;
            }
            else if (pilihan1 > 3 || pilihan1 < 1) {
                System.out.println("Anda harus memilih menu 1 - 3!, tidak bisa menu lain");                
            }
            else {
                if (pilihan1 == 1) {
                    System.out.println("--------------------Register----------------------");
                    
                    scanner.nextLine();
                    System.out.print("Masukan nama : ");
                    String namaUserBaru = scanner.nextLine();
                            
                    
                    System.out.print("Masukan password : ");
                    String passUserBaru = scanner.nextLine();
                    
                    boolean akunSudahAda = false;
                    
                    for (int i = 0; i < ctr_user; i++) {
                        if (arrNamaUser[i].equals(namaUserBaru)) {
                            akunSudahAda = true;
                            break;
                        }
                    }

                    if (akunSudahAda) {
                        System.out.println("Akun sudah ada di sistem, silahkan login ulang!");
                    }
                    else {
                        arrNamaUser[ctr_user] = namaUserBaru;
                        arrPassUser[ctr_user] = passUserBaru;
                        ctr_user += 1;
                        System.out.println("Berhasil menambahkan akun bernama '" + namaUserBaru + "' ke dalam sistem!");
                    }       
                }
                else if (pilihan1 == 2) {
                    System.out.println("------------------Login-------------------------");
                    
                    scanner.nextLine();
                    
                    System.out.print("Masukan username / nama :");
                    String namaLogin = scanner.nextLine();
                    
                    System.out.print("Masukan password :");
                    String passLogin = scanner.nextLine();

                    if (namaLogin.equals("admin") && passLogin.equals("admin")) {
                        System.out.println(".");
                    } 
                    else {
                        for (int i = 0; i < ctr_user; i++) {
                            
                        }
                    }
                }
            }
        }
    }
}
