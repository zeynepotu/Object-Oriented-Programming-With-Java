
package com.mycompany.atmprogrami;


public class Hesap {
    private String kullaniciadi;
    private String parola;
    private double bakiye;

    public Hesap(String kullaniciadi, String parola, double bakiye) {
        this.kullaniciadi = kullaniciadi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int miktar){
        bakiye+=miktar;
        System.out.println("Yeni Bakiyeniz:"+bakiye);
    }
    public void paraÇek(int miktar){
        if (bakiye-miktar<0){
            System.out.println("Bakiye yetersiz....");
      
        }
        else {
            bakiye-=miktar;
            System.out.println("Yeni bakiyeniz:"+bakiye);
            
        }
    }
 
    
}
