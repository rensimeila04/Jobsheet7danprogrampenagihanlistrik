package saranbahan2resep;

import java.util.Scanner;

public class SaranBahan2Resep {


    public static void main(String[] args) {
        // Initial Commit
        String identitas = "Rensi Meila Yulvinata / XR2 / 31";
        System.out.println("Identitas : "+ identitas);
        
        System.out.print("\nSaran resep dari Bahan Milik Anda\n");
        
        // TambahInputBahan1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. telur");
        System.out.println("Masukkan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
                
        
        // TambahInputBahan2
        if (bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak Ada");
            }else {
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.print("Masukkan no pilihan anda :");
            int bahan2 = scanner.nextInt();
            
            
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan,  "
                    + "tidak dapat memberikan saran resep");
        // Tambah Tampil Resep
        int bahan2 = scanner.nextInt();
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Anda dapat membuat milk shake banana"); break;
                    case 2: System.out.println(
                            "Anda dapat membuat pisang goreng");
                    case 3: System.out.println(
                            "Anda dapat mebuat pisang rebus");
           
                }
            else
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Anda dapat membuat telur mata sapi"); break;
                    case 2: System.out.println(
                            "Anda dapat membuat telur sandwich telur"); break;
                    case 3: System.out.println(
                            "Anda dapat membuat telur rebus"); break;
                }
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan,"
                + "tidak dapat memberikan saran resep");
    }
}


