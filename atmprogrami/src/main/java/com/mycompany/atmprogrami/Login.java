
package com.mycompany.atmprogrami;

import java.util.Scanner;


public class Login {
    
    public boolean login(Hesap hesap){
        Scanner scanner= new Scanner(System.in);
        String kullaniciadi;
        String parola;
        
        System.out.println("Kullanici adi:");
        kullaniciadi=scanner.nextLine();
        System.out.println("Parola:");
        parola=scanner.nextLine();
        
        
        
        if (hesap.getKullaniciadi().equals(kullaniciadi)&&hesap.getParola().equals(parola)){
            return true;
        }
        else{
            System.out.println("yanlis giris........");
            return false;
        }
       
    }
    
}
