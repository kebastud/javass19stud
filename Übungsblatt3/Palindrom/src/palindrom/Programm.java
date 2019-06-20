package palindrom;
import java.util.Scanner;
public class Programm {
    public static void main(String[] args){
        String wort;
        Palindrom a = new Palindrom();
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie ein Wort ein: ");
        wort = input.next();
        a.isPalindrom(wort);
}
}
