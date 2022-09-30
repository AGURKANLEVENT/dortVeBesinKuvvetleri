import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int g,l;

        Scanner grkn = new Scanner(System.in);
        System.out.println("4'ün Kuvvetlerini Belirlemek için Lütfen Bir Değer Giriniz : ");
        g = grkn.nextInt();

        for (int i = 1; i <= g; i*=4){
            System.out.println(i);
        }
        System.out.println("5'in Kuvvetlerini Belirlemek için Lütfen Bir Değer Giriniz :");
        l = grkn.nextInt();
        for (int i = 1; i <= l; i *= 5){
            System.out.println(i);
        }

    }
}