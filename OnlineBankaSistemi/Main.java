package OnlineBankaSistemi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<kullanıcı> kullanıcıList = new ArrayList<>();
        kullanıcı k1 = new kullanıcı(123,"asd",1000,200,100);
        kullanıcı k2 = new kullanıcı(1233,"aasdsd",1500,600,200);
        kullanıcı k3 = new kullanıcı(1243,"asdsad",1600,100,400);
        kullanıcı k4 = new kullanıcı(1253,"asfdsd",1700,300,500);
        kullanıcıList.add(k1);
        kullanıcıList.add(k2);
        kullanıcıList.add(k3);
        kullanıcıList.add(k4);

        System.out.print("T.C Giriniz: ");
        int tc = input.nextInt();
        System.out.print("Sifrenizi Giriniz: ");
        String pass = input.next();
        for (int i =0; i< kullanıcıList.size();i++) {
            if (kullanıcıList.get(i).getTc() == tc & kullanıcıList.get(i).getPass().equals(pass)){
                System.out.println("Sisteme Giris Yaptiniz.");
                System.out.println("-----------------------------------");
                System.out.println("1- Para Transfer Et.\n2- Kredi Odemesi Yap.\n3- Kredi Karti Ekstersi Ode.\n4- Cikis Yap.");
                System.out.print("Secim Yapin: ");
                int secim = input.nextInt();
                switch (secim){
                    case 1:
                        System.out.print("Transfer Etmek Istedigini Miktari Giriniz: ");
                        int transfer = input.nextInt();
                        System.out.print("T.C Giriniz: ");
                        int transTC= input.nextInt();
                        for (int j =0; j< kullanıcıList.size();j++){
                            if (kullanıcıList.get(j).getTc()==transTC){
                                int yeniPara= kullanıcıList.get(i).getMoney()-transfer;
                                kullanıcıList.get(i).setMoney(yeniPara);
                                kullanıcıList.get(j).setMoney(transfer+kullanıcıList.get(j).getMoney());
                                System.out.println("Yeni Bakiyeniz: "+ kullanıcıList.get(i).getMoney());

                            }
                        }
                    break;
                    case 2:
                        int yeniPara = kullanıcıList.get(i).getMoney()-kullanıcıList.get(i).getKredi();
                        kullanıcıList.get(i).setMoney(yeniPara);
                        System.out.println("Kredi Odemeniz Yapildi");
                        System.out.println("Yeni Bakiyeniz: "+ kullanıcıList.get(i).getMoney());
                        break;
                    case 3:
                        int yeniPara1 = kullanıcıList.get(i).getMoney()-kullanıcıList.get(i).getEkstre();
                        kullanıcıList.get(i).setMoney(yeniPara1);
                        System.out.println("Kredi Karti Ekstre Odemesi Yapildi");
                        System.out.println("Yeni Bakiyeniz: "+ kullanıcıList.get(i).getMoney());
                        break;
                    case 4:
                        break;
                }

            }

        }

    }
}
