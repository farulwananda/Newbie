import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Newbie {

    public static void main(String[] args) {

        InputStreamReader sR = new InputStreamReader(System.in);
        BufferedReader bR = new BufferedReader(sR);


        System.out.println("Program penjumlahan sangat sederhana");

        int value = 0;
        int anotherValue = 0;
        
        try{
            System.out.print("Masukkan angka pertama : ");
            value = Integer.parseInt(bR.readLine());
            System.out.print("Masukkan angka kedua : ");
            anotherValue = Integer.parseInt(bR.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }

        int result = value + anotherValue;
        System.out.print("Hasilnya adalah "+ result);
    }
}