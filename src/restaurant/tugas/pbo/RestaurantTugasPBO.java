package restaurant.tugas.pbo;

import java.util.Scanner;

public class RestaurantTugasPBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] arrNamaUser = new String[100];
        String[] arrPassUser = new String[100];
        int[] arrSaldoUser = new int[100];
        
        String[] arrKeranjangMenuMakanan = new String [100];
        int[] arrKeranjangHargaMakanan = new int [100];

        int[] arrPorsiPesanan = new int[100];
        
        String[] arrMenuMakanan = new String[100];
        int[] arrHargaMakanan = new int[100];

        int ctr_user = 0;
        int ctr_makanan = 0;
        int ctr_keranjang = 0;
        
        arrMenuMakanan[ctr_makanan] = "Nasgor";
        arrHargaMakanan[ctr_makanan] = 10000;
        ctr_makanan++;

        
        arrMenuMakanan[ctr_makanan] = "Nasi Campur";
        arrHargaMakanan[ctr_makanan] = 20000;
        ctr_makanan++;

        
        arrMenuMakanan[ctr_makanan] = "Ayam Goreng";
        arrHargaMakanan[ctr_makanan] = 15000;
        ctr_makanan++;

        
        arrMenuMakanan[ctr_makanan] = "Es Teh";
        arrHargaMakanan[ctr_makanan] = 3000;
        ctr_makanan++;
        
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
                        arrSaldoUser[ctr_user] = 0;
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
                    int indexAkun = -1;
                    
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
                                else if (pilihanAdmin1 == 2) {
                                    while (true) {
                                        System.out.println("\n%%%%%%%%%% Lihat Menu%%%%%%%%%%%%%");
                                    
                                        for (int i = 0; i < ctr_makanan; i++) {
                                            System.out.println( (i+1) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                        }
                                        
                                        System.out.println("00. Kembali");
                                        System.out.println("01. Ubah Menu");
                                        System.out.println("02. Hapus Menu");
                                        
                                        System.out.print(">> ");
                                        int pilihanAdmin2 = scanner.nextInt();
                                        
                                        if (pilihanAdmin2 == 00) {
                                            System.out.println("Akan dikembali ke menu admin, terimakasih!");
                                            break;
                                        }
                                        else if (pilihanAdmin2 == 01) {
                                            while (true) {
                                                System.out.println("\n%%%%%%%%%% Ubah Menu%%%%%%%%%%%%%");
                                                for (int i = 0; i < ctr_makanan; i++) {
                                                    
                                                    System.out.println( (i+1) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                                }
                                                System.out.println("00. Kembali");
                                                
                                                System.out.print("Masukan nomor menu yang mau diubah: ");
                                                int noMenuYangMauDiubah = scanner.nextInt();
                                                
                                                if (noMenuYangMauDiubah == 00) {
                                                    System.out.println("Akan dikembalikan ke halaman 'Lihat Menu', Terimakasih!");
                                                    break;
                                                }
                                                else {
                                                    if (noMenuYangMauDiubah > ctr_makanan) {
                                                        System.out.println("No menu tidak valid, silahkan diulang!");
                                                        continue;
                                                    }
                                                    else {
                                                        int noMenuFix = noMenuYangMauDiubah - 1 ;
                                                        
                                                        System.out.println("\n%%%%%%%%%% Ubah Menu%%%%%%%%%%%%%");
                                                        
                                                        scanner.nextLine();
                                                        
                                                        System.out.print("Ubah nama menu : ");
                                                        String namaMenuBaruDiubah = scanner.nextLine();
                                                        
                                                        System.out.print("Ubah harga menu : ");
                                                        int hargaMenuBaruDiubah = scanner.nextInt();
                                                        
                                                        arrMenuMakanan[noMenuFix] = namaMenuBaruDiubah;
                                                        arrHargaMakanan[noMenuFix] = hargaMenuBaruDiubah;
                                                        
                                                        System.out.println("Nama menu dan harga pada menu ke-" + noMenuYangMauDiubah + " berhasil diubah!");
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        else if (pilihanAdmin2 == 02) {   
                                            System.out.println("%%%%%%%%%% Hapus Menu%%%%%%%%%%%%%");
                                            for (int i = 0; i < ctr_makanan; i++) {
                                                System.out.println( (i+1) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                            }
                                            System.out.println("00. Batal");
                                            
                                            System.out.print("Masukan nomor menu yang mau dihapus : ");
                                            int noMenuYangAkanDihapus = scanner.nextInt();
                                                
                                            int noMenuFixDihapus = noMenuYangAkanDihapus - 1;
                                            
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
                                indexAkun = i;
                            }
                        }
                    }
                    
                    if (akunTersedia) {
                        while (true) {
                            
                            int Total = 0;
                            
                            System.out.println("***********************CUSTOMER***********************");
                            System.out.println("Hai, [" + namaLogin +  "]");
                            System.out.println("Saldo : Rp " + arrSaldoUser[indexAkun]);
                            System.out.println("1. Pesan makanan");
                            System.out.println("2. Lihat pesanan");
                            System.out.println("3. Bayar");
                            System.out.println("4. Top up");
                            System.out.println("5. Keluar");

                            System.out.print(">> ");
                            int pilihanUser = scanner.nextInt();

                            if (pilihanUser == 1) {
                                while (true) {
                                    System.out.println("***********************Pesan Makanan*********************");
                                    for (int i = 0; i < ctr_makanan; i++) {
                                        System.out.println( (i+1) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                    }
                                    System.out.println("00. Kembali");

                                    System.out.print("Pilih menu yang mau dipesan : ");
                                    int menuDipesan = scanner.nextInt();

                                    if (menuDipesan == 00) {
                                        System.out.println("Pesanan berhasil ditambahakan ke keranjang!");
                                        System.out.println("Akan dikembali ke menu utama, Terimkasih!");
                                        break;
                                    }
                                    else {
                                        if (menuDipesan > ctr_makanan) {
                                            System.out.println("Nomor menu tidak valid, silahkan diulangi lagi!");
                                            continue;
                                        }
                                        else {
                                            int nomorMenuFixYangDipesan = menuDipesan - 1;
                                            
                                            arrKeranjangMenuMakanan[ctr_keranjang] = arrMenuMakanan[nomorMenuFixYangDipesan];
                                            arrKeranjangHargaMakanan[ctr_keranjang] = arrHargaMakanan[nomorMenuFixYangDipesan];
                                            arrPorsiPesanan[nomorMenuFixYangDipesan] += 1;
                                            ctr_keranjang += 1;
                                        }                                        
                                    }  
                                }                                
                            }
                            else if (pilihanUser == 2) {
                                while (true) {
                                    System.out.println("***********************Lihat Pesanan*********************");
                                    for (int i = 0; i < ctr_keranjang; i++) {
                                        System.out.println((i+1) + ". " + arrKeranjangMenuMakanan[i] + " - " + arrKeranjangHargaMakanan[i]);
                                    }
                                    int tempTotal = 0;
                                    for (int i = 0; i < ctr_keranjang; i++) {
                                        tempTotal += (arrKeranjangHargaMakanan[i] * arrPorsiPesanan[i]);
                                    }
                                    Total = tempTotal;
                                    System.out.println("Total : Rp" + tempTotal);
                                    System.out.println("00. Kembali");
                                    System.out.println("01. Batalkan pesanan");
                                    
                                    System.out.print(">> ");
                                    int pilihanUser1 = scanner.nextInt();
                                    
                                    if (pilihanUser1 == 00) {
                                        System.out.println("Akan dikembalikan ke menu utama, Terimakasih!");
                                        break;
                                    }
                                    else if (pilihanUser1 == 01) {
                                        System.out.println(".");
                                    }
                                    else {
                                        System.out.println("Harap memasukkan antara menu '00' atau '01' !");
                                        continue;
                                    }
                                }                                
                            }
                            else if (pilihanUser == 3) {
                                if (arrSaldoUser[indexAkun] >= Total) {
                                    int sisaSaldo = arrSaldoUser[indexAkun] - Total;
                                    System.out.println("Pesanan berhasil dipesan, sisa kembalian saldo adalah Rp [" + sisaSaldo + "]");
                                }
                                else {
                                    System.out.println("Pesanan gagal dipesan, lakukan top up terlebih dahulu");
                                }
                            }
                            
                        }
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
