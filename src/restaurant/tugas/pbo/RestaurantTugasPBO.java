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
            System.out.println("\n---------------------Landing---------------------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            
            System.out.print(">> ");
            int pilihan1 = scanner.nextInt();
            
            if (pilihan1 == 3) {
                System.out.println("\nTerimakasih!");
                break;
            }
            else if (pilihan1 > 3 || pilihan1 < 1) {
                System.out.println("\nAnda harus memilih menu 1 - 3!, tidak bisa menu lain");                
            }
            else {
                if (pilihan1 == 1) {
                    System.out.println("\n--------------------Register----------------------");
                    
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
                        System.out.println("\nAkun sudah ada di sistem, silahkan login ulang!");
                    }
                    else {
                        arrNamaUser[ctr_user] = namaUserBaru;
                        arrPassUser[ctr_user] = passUserBaru;
                        arrSaldoUser[ctr_user] = 0;
                        ctr_user += 1;
                        System.out.println("\nBerhasil menambahkan akun bernama '" + namaUserBaru + "' ke dalam sistem!");
                    }       
                }
                else if (pilihan1 == 2) {
                    System.out.println("\n------------------Login-------------------------");
                    
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
                                System.out.println("\nTerimakasih!");
                                break;
                            }
                            else if (pilihanAdmin1 > 3 || pilihanAdmin1 < 1) {
                                System.out.println("\nHarap masukkan menu 1 - 3!");
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
                                    
                                        int Nomorrs = 1;
                                        for (int i = 0; i < ctr_makanan; i++) {
                                            if (arrMenuMakanan[i] == null && arrHargaMakanan[i] == 0) {
                                                continue;
                                            }
                                            else {
                                                System.out.println( (Nomorrs) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                                Nomorrs++;
                                            }

                                        }
                                        
                                        System.out.println("00. Kembali");
                                        System.out.println("01. Ubah Menu");
                                        System.out.println("02. Hapus Menu");
                                        
                                        System.out.print(">> ");
                                        int pilihanAdmin2 = scanner.nextInt();
                                        
                                        if (pilihanAdmin2 == 00) {
                                            System.out.println("\nAkan dikembali ke menu admin, terimakasih!");
                                            break;
                                        }
                                        else if (pilihanAdmin2 == 01) {
                                            while (true) {
                                                System.out.println("\n%%%%%%%%%% Ubah Menu%%%%%%%%%%%%%");
                                                int Nomorr = 1;
                                                for (int i = 0; i < ctr_makanan; i++) {
                                                    if (arrMenuMakanan[i] == null && arrHargaMakanan[i] == 0) {
                                                        continue;
                                                    }
                                                    else {
                                                        System.out.println( (Nomorr) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                                        Nomorr++;
                                                    }
                                                    
                                                }
                                                System.out.println("00. Kembali");
                                                
                                                System.out.print("Masukan nomor menu yang mau diubah: ");
                                                int noMenuYangMauDiubah = scanner.nextInt();
                                                
                                                if (noMenuYangMauDiubah == 00) {
                                                    System.out.println("\nAkan dikembalikan ke halaman 'Lihat Menu', Terimakasih!");
                                                    break;
                                                }
                                                else {
                                                    if (noMenuYangMauDiubah > ctr_makanan) {
                                                        System.out.println("\nNo menu tidak valid, silahkan diulang!");
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
                                                        
                                                        System.out.println("\nNama menu dan harga pada menu ke-" + noMenuYangMauDiubah + " berhasil diubah!");
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        else if (pilihanAdmin2 == 02) {
                                            while (true) {
                                                System.out.println("\n%%%%%%%%%% Hapus Menu%%%%%%%%%%%%%");
                                                int Nomor = 1;
                                                for (int i = 0; i < ctr_makanan; i++) {
                                                    if ((arrMenuMakanan[i] == null) && (arrHargaMakanan[i] == 0)) {
                                                        continue;
                                                    }
                                                    else {
                                                        System.out.println( (Nomor) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                                        Nomor++;
                                                    }
                                                }
                                                System.out.println("00. Batal");

                                                System.out.print("Masukan nomor menu yang mau dihapus : ");
                                                int noMenuYangAkanDihapus = scanner.nextInt();

                                                if (noMenuYangAkanDihapus == 00) {
                                                    System.out.println("\nAkan dikembali ke halaman 'Lihat menu', Terimakasih!");
                                                    break;
                                                }
                                                else {
                                                    if (noMenuYangAkanDihapus > ctr_makanan) {
                                                        System.out.println("\nNo menu tidak valid, silahkan ulang lagi!");
                                                    }
                                                    else {
                                                        int noMenuFixDihapus = noMenuYangAkanDihapus - 1;

                                                        System.out.println("\nMenu bernama '" + arrMenuMakanan[noMenuFixDihapus] + "' berhasil di-hapus!");

                                                        arrMenuMakanan[noMenuFixDihapus] = null;
                                                        arrHargaMakanan[noMenuFixDihapus] = 0;                                                                                                               
                                                    }
                                                }                                                
                                            }
                                        }
                                        else {
                                            System.out.println("\nInput tidak valid, harap memasukkan antara '00' atau '01' atau '02' !");
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
                            System.out.println("\n***********************CUSTOMER***********************");
                            System.out.println("Hai, [" + namaLogin +  "]");
                            System.out.println("Saldo : Rp " + arrSaldoUser[indexAkun]);
                            System.out.println("1. Pesan makanan");
                            System.out.println("2. Lihat pesanan");
                            System.out.println("3. Bayar");
                            System.out.println("4. Top up");
                            System.out.println("5. Keluar");

                            System.out.print(">> ");
                            int pilihanUser = scanner.nextInt();
                            
                            if (pilihanUser == 5) {
                                System.out.println("\nTerimakasih!");
                                
                                for (int j = 0; j < ctr_keranjang; j++) {
                                    arrKeranjangHargaMakanan[j] = 0;
                                    arrPorsiPesanan[j] = 0;
                                    arrKeranjangMenuMakanan[j] = null;
                                }
                                
                                break;
                            }
                            else if (pilihanUser == 1) {
                                while (true) {
                                    System.out.println("\n***********************Pesan Makanan*********************");
                                    int Nomorr = 1;
                                    for (int i = 0; i < ctr_makanan; i++) {
                                        if (arrMenuMakanan[i] == null && arrHargaMakanan[i] == 0) {
                                            continue;
                                        }
                                        else {
                                            System.out.println( (Nomorr) + ". " + arrMenuMakanan[i] + " - " + "Rp " + arrHargaMakanan[i]);
                                            Nomorr++;
                                        }

                                    }
                                    System.out.println("00. Kembali");

                                    System.out.print("Pilih menu yang mau dipesan : ");
                                    int menuDipesan = scanner.nextInt();

                                    if (menuDipesan == 00) {
                                        System.out.println("\nPesanan berhasil ditambahakan ke keranjang!");                                       
                                        break;
                                    }
                                    else {
                                        if (menuDipesan > ctr_makanan) {
                                            System.out.println("\nNomor menu tidak valid, silahkan diulangi lagi!");
                                            continue;
                                        }
                                        else {
                                            int nomorMenuFixYangDipesan = menuDipesan - 1;
                                            
                                            boolean tempCount = false;
                                            int indexKeranjang = -1;
                                            
                                            for (int i = 0; i < ctr_keranjang; i++) {
                                                if (arrKeranjangMenuMakanan[i].equals(arrMenuMakanan[nomorMenuFixYangDipesan])) {
                                                    tempCount = true;
                                                    indexKeranjang = i;
                                                }                                                                                                
                                            }
                                            
                                            if (tempCount) {
                                                arrPorsiPesanan[indexKeranjang] += 1;

                                            }
                                            else {
                                                arrKeranjangMenuMakanan[ctr_keranjang] = arrMenuMakanan[nomorMenuFixYangDipesan];
                                                arrKeranjangHargaMakanan[ctr_keranjang] = arrHargaMakanan[nomorMenuFixYangDipesan];
                                                arrPorsiPesanan[ctr_keranjang] += 1;
                                                ctr_keranjang += 1;
                                            }
                                        }                                        
                                    }  
                                }                                
                            }
                            else if (pilihanUser == 2) {
                                
                                while (true) {
                                    
                                    int tempTotal = 0;
                                    int NomorPesanan = 1;
                                    System.out.println("\n***********************Lihat Pesanan*********************");
                                    for (int i = 0; i < ctr_keranjang; i++) {
                                        if ((arrKeranjangMenuMakanan[i] == null) && (arrPorsiPesanan[i] == 0)) {
                                            continue;
                                        }
                                        else {
                                            System.out.println((NomorPesanan) + ". " + arrKeranjangMenuMakanan[i] + " - " + arrPorsiPesanan[i]);
                                            NomorPesanan++;
                                        }
                                    }
                                    
                                    for (int j = 0; j < ctr_keranjang; j++) {
                                        if ((arrKeranjangMenuMakanan[j] == null) && (arrPorsiPesanan[j] == 0)) {
                                            continue;
                                        }
                                        else {
                                            tempTotal += arrKeranjangHargaMakanan[j] * arrPorsiPesanan[j];                                            
                                        }
                                    }
                                    
                                    System.out.println("Total : Rp" + tempTotal);
                                    System.out.println("00. Kembali");
                                    System.out.println("01. Batalkan pesanan");
                                    
                                    System.out.print(">> ");
                                    int pilihanUser1 = scanner.nextInt();
                                    
                                    if (pilihanUser1 == 00) {
                                        System.out.println("\nAkan dikembalikan ke menu utama, Terimakasih!");
                                        
                                        break;
                                    }
                                    else if (pilihanUser1 == 01) {
                                        
                                        System.out.print("Masukan pesanan yang ingin dibatalkan : ");
                                        int NamaPesananCancel = scanner.nextInt();
            
                                        int indexMakananValid = 0;
                                        
                                        boolean IndexNoMenuMakanan = false;
                                        
                                        for (int i = 0; i < ctr_keranjang; i++) {
                                            if ((arrKeranjangMenuMakanan[i] != null) && (arrPorsiPesanan[i] != 0)) {
                                                indexMakananValid += 1;
                                                
                                                if (NamaPesananCancel == indexMakananValid) {
                                                    
                                                    IndexNoMenuMakanan = true;
                                                    
                                                    System.out.print("Jumlah yang dibatalkan : ");
                                                    int PorsiPesananCancel = scanner.nextInt();
                                                    
                                                    if (PorsiPesananCancel < arrPorsiPesanan[i]) {
                                                        arrPorsiPesanan[i] -= PorsiPesananCancel;
                                                    }
                                                    else if (PorsiPesananCancel == arrPorsiPesanan[i]) {
                                                        arrPorsiPesanan[i] = 0;
                                                        arrKeranjangMenuMakanan[i] = null;
                                                        arrKeranjangHargaMakanan[i] = 0;
                                                    }
                                                    else {
                                                        System.out.println("\nJumlah yang dimasukkan kebesaran dibanding jumlah yang di-inputkan di awal");
                                                    }
                                                    break;
                                                }   
                                            }                                            
                                        }
                                        
                                        if (!IndexNoMenuMakanan) {
                                            System.out.println("\nNo menu tidak valid!");
                                        }   
                                    }
                                    else {
                                        System.out.println("\nHarap memasukkan antara menu '00' atau '01' !");
                                        continue;
                                    }
                                }                                
                            }
                            else if (pilihanUser == 3) {
                                
                                int Total = 0;
                                
                                for (int j = 0; j < ctr_keranjang; j++) {
                                    if ((arrKeranjangMenuMakanan[j] == null) && (arrPorsiPesanan[j] == 0)) {
                                        continue;
                                    }
                                    else {
                                        Total += arrKeranjangHargaMakanan[j] * arrPorsiPesanan[j];
                                    }
                                }
                                
                                if (arrSaldoUser[indexAkun] >= Total) {
                                    arrSaldoUser[indexAkun] -= Total;
                                    System.out.println("\nPesanan berhasil dipesan, sisa kembalian saldo adalah Rp [" + arrSaldoUser[indexAkun] + "]");
                                    
                                    for (int j = 0; j < ctr_keranjang; j++) {
                                        arrKeranjangHargaMakanan[j] = 0;
                                        arrPorsiPesanan[j] = 0;
                                        arrKeranjangMenuMakanan[j] = null;
                                    }
                                }
                                else {
                                    System.out.println("\nPesanan gagal dipesan, lakukan top up terlebih dahulu");
                                }
                            }
                            else if (pilihanUser == 4) {
                                System.out.println("\n***********************Top Up*********************");
                                System.out.print("Masukan jumlah top up : ");
                                int topUp = scanner.nextInt();
                                
                                if (topUp % 50000 != 0) {
                                    System.out.println("\nHanya melayani top-up kelipatan Rp 50.000");
                                }
                                else {
                                    arrSaldoUser[indexAkun] += topUp;
                                    System.out.println("\nTopup sebesar Rp " + topUp + " berhasil di-lakukan!");
                                }
                            }
                            else {
                                System.out.println("\nInput tidak valif, Harus memasukkan antara menu 1 - 5!");
                                continue;
                            }
                        }
                    }
                    else {
                        System.out.println("\nUsername yang anda masukkan tidak ada di sistem!, silahkan register terlebih dahulu.");
                        continue;
                    }
                }
            }
        }
    }
}