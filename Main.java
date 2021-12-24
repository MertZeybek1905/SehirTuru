import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main{
    public static void İslemler(){
        System.out.println("0 - İşlemleri Görüntüle..");
        System.out.println("1 - Bir sonraki şehre git...");
        System.out.println("2 - Bir önceki şehre git...");
        System.out.println("3 - Uygulamadan Çık.");
    }
    public static void Sehir_Turla(LinkedList<String>sehirler){
        İslemler();
        ListIterator<String>ıterator= sehirler.listIterator();
        Scanner scanner= new Scanner(System.in);
        int secenek;
        System.out.println("Lütfen işlem girin");
        secenek=scanner.nextInt();
        while(!ıterator.hasNext()){
            System.out.println("Gidilecek şehir yok");
        }
        boolean cıkıs=false;
          while(!cıkıs){
            boolean cikis = false;
            boolean ileri = true;
            
            while (!cikis) {
                System.out.println("Bir işlem seçiniz:");
                
                secenek = scanner.nextInt();
                
                switch(secenek) {
                    case 0:
                    İslemler();
                        break;
                    case 1:
                       if(!ileri){
                           if(ıterator.hasNext()){
                               ıterator.next();
                           }
                           ileri=true;
                       }
                        if (ıterator.hasNext()) {
                            
                            System.out.println("Şehre gidiliyor : " + ıterator.next());
                        }
                        else {
                            System.out.println("Gidilecek Şehir Kalmadı...");
                            ileri=true;
                        }
                       
                        break;
                    case 2:
                    if(ileri){
                          if(ıterator.hasPrevious()){
                              ıterator.previous();
                          }
                          ileri=false;
                      }
                        if (ıterator.hasPrevious()) { 
                            System.out.println("Şehre Gidiliyor : " + ıterator.previous());
                        }
                        else {
                            System.out.println("Şehir Turu Başladı....");
                        }
                        break;
                    case 3:
                        cikis = true;
                        System.out.println("Uygulamadan çıkılıyor...");
                        break; 
                }
            }   
        }
          }
    public static void main(String[] args) {
        LinkedList<String>Sehirler= new LinkedList<String>();
        Sehirler.add("istanbul");
        Sehirler.add("bursa");
        Sehirler.add("ankara");
        Sehirler.add("aydın");
        Sehirler.add("eskişehir");
        Sehirler.add("Afyon");
        Sehir_Turla(Sehirler);
    }
}