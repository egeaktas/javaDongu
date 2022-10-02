/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
ve girilen değerlerden 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, toplam = 0;
        n = input.nextInt();
        while(n%2 == 0){
            if(n%4 == 0){toplam = toplam + n;}
            n = input.nextInt();
        }
        System.out.println(toplam);
    }
}