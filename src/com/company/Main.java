package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   String username, Password;
        Scanner input = new Scanner(System.in);
        int right=3;
        int Balance=1500;
        int control=0;
        int price=0;
        while (right > 0){
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");
            username=input.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz:");
            Password=input.nextLine();
            if(username.equals("patika")&&Password.equals("Dev123")){

                while (control!=4) {
                    if(control!=4){
                        System.out.println("1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
                        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçin:");
                        control=input.nextInt();
                    }
                    else System.out.println("Tekrardan Görüşmek Üzere");
                    switch (control) {


                        case 1:
                            System.out.println("Lütfen Yatırmak İstediğiniz Miktarı Giriniz:");
                            price = input.nextInt();
                            Balance += price;
                            System.out.println("Mevcut Bakiye:" + Balance);
                            break;


                        case 2:
                            System.out.print("Lütfen Çekmek İstediğiniz Miktarı Girin:");
                            price = input.nextInt();
                            if (price > Balance) {
                                System.out.println("Bakiye Yetersiz Lütfen Tekrar Deneyin");
                            }
                            Balance -= price;
                            System.out.println("Mevcut Bakiyeniz: " + Balance);
                            break;

                        case 3:
                            System.out.println("Bakiyeniz:" + Balance);
                            break;

                        case 4:

                            System.out.println("Tekrar görüşmek üzere...");
                            break;
                    }
                }
                break;

            }
            else{
                right--;
                if (right==0) System.out.println("Program Kapanıyor, Hesabınız bloke oldu Lütfen Bankayla iletişime geçin...");
                else System.out.println("Lütfen Tekrardan Deneyiniz, Kalan Hakkınız:"+right);
            }

        }





    }
}
