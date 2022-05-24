
package com.mycompany.atmprogrami;

import java.util.Scanner;


public class Atm {
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("BANKAMIZA HOSGELDINIZ");
        System.out.println("*****************************");
        System.out.println("KULLANICI GIRISI");
        System.out.println("*****************************");
        int giris_hakki=3;
        while(true){
            if (login.login(hesap)){
                System.out.println("GIRIS BASARILI");
                break;  
            }
            else{
                System.out.println("GIRIS BASARISIZ!!!!");
                giris_hakki--;
                System.out.println("kalan giris hakki"+giris_hakki);
            
            }
            if (giris_hakki==0){
                System.out.println("giris hakkiniz bitti");
                return;
                
            }
            
                    
        }
        System.out.println("*******************************");
        String islemler="1. BAKIYE GOSTER"
                +"2. PARA YATIR"
                +"3. PARA CEK"
                +"CIKIS ICIN q YA BASIN.....";
        System.out.println(islemler);
        System.out.println("*********************************");
        while(true){
            System.out.println("ISLEMI SECINIZ:");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("PROGRAMDAN CIKILIYOR....");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("BAKIYENIZ:"+ hesap.getBakiye());
                
            }
            else if (islem.equals("2")){
                System.out.println("YATIRMAK ISTEDIGINIZ TUTAR:");
                int miktar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(miktar);
                
                
            }
            else if (islem.equals("3")){
                System.out.println("");
                int miktar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraÇek(miktar);
    
            }
            else{
                System.out.println("gecersiz islem.............");
                
            }
        
    }
}
}
