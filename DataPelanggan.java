import java.util.Scanner;
public class DataPelanggan {
    public static void main(String[] args) {
        Scanner masuk=new Scanner (System.in);
        
        System.out.print("Jumlah Pelanggan Member : ");
        int n=masuk.nextInt();
        
        String pelanggan[][] = new String[n][3];

        for(int i= 0; i<n; i++)
        {
            System.out.println("");
            System.out.println("Data Pelanggan Member ke "+(i+1));

            for(int j=0;j<3;j++)
            {      
                if (j == 0)
                    System.out.print("No.Telp    :");
                else if (j == 1)
                    System.out.print("Nama       : ");
                else
                    System.out.print("Alamat     : ");
                
                System.out.print("");
                pelanggan[i][j] = masuk.next();
            }
        }

        System.out.println("Data pelanggan member yang dimasukan");
        System.out.println("-----------------------------");
        System.out.println("No.Telp \t\t  Nama \t\t  Alamat \t");
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(pelanggan[i][j]+"\t\t");
            }
         System.out.println();
         }
        }
    }