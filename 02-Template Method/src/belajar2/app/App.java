package belajar2.app;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan karakter pembentuk : ");
        String charInput = input.next();

        System.out.print("Masukkan tinggi : ");
        int height = input.nextInt();
        System.out.print("Masukkan lebar : ");
        int width = input.nextInt();

        BlockTemplate a = new BlockTemplate();
        a.BlockShow(charInput,height,width);

    }
}
