package restaurant.tugas.pbo;

import java.util.Scanner;

public class RestaurantTugasPBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] arrNamaUser = new String[100];
        String[] arrPassUser = new String[100];
        
        String[] arrMenuMakanan = new String[100];
        int[] arrHargaMakanan = new int[100];

        int ctr_user = 0;
        int ctr_makanan = 0;
        
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
                    
                    System.out.print("Masukan username / nama : ");
                    String namaLogin = scanner.nextLine();
                    
                    System.out.print("Masukan password : ");
                    String passLogin = scanner.nextLine();

                    boolean akunTersedia = false;
                    
                    if (namaLogin.equals("admin") && passLogin.equals("admin")) {
                        while (true) {
                            System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println("ADMIN");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println("Selamat datang admin");
                            System.out.println("Kas : ");
                            System.out.println("1. Tambah Menu");
                            System.out.println("2. Lihat Menu");
                            System.out.println("3. Keluar");

                            System.out.print(">> ");
                            int pilihanAdmin1 = scanner.nextInt();
                            
                            if (pilihanAdmin1 == 3) {
                                System.out.println("Terimakasih!");
                                break;
                            }
                            else if (pilihanAdmin1 > 3 || pilihanAdmin1 < 1) {
                                System.out.println("Harap masukkan menu 1 - 3!");
                                continue;
                            }
                            else {
                                if (pilihanAdmin1 == 1) {
                                    
                                    boolean Pemberhenti = false;
                                    
                                    while (!Pemberhenti) {
                                        System.out.println("\n%%%%%%%%%% Tambah Menu%%%%%%%%%%%%%");
                                    
                                        scanner.nextLine();
                                        System.out.print("Nama Menu : ");
                                        String namaMenuBaru = scanner.nextLine();
                                        
                                        if (namaMenuBaru.equals("stop")) {
                                            Pemberhenti = true;
                                        }
                                        else {
                                            System.out.print("Harga Menu : ");
                                            int hargaMenuBaru = scanner.nextInt();
                                            
                                            arrMenuMakanan[ctr_makanan] = namaMenuBaru;
                                            arrHargaMakanan[ctr_makanan] = hargaMenuBaru;
                                            ctr_makanan += 1;
                                        }
                                    }
                                    
                                    
                                }
                            }
                        }
  
                    } 
                    else {
                        for (int i = 0; i < ctr_user; i++) {
                            if (arrNamaUser[i].equals(namaLogin) && arrPassUser[i].equals(passLogin)) {
                                akunTersedia = true;
                            }
                        }
                    }
                    
                    if (akunTersedia) {
                        System.out.println("tes123");
                    }
                    else {
                        System.out.println("Username yang anda masukkan tidak ada di sistem!, silahkan register terlebih dahulu.");
                        continue;
                    }
                }
            }
        }
    }
}
