package aufgabe07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Rechnung {

    String kundenNummer;
    String kundenName;
    String artikelName;
    double einzelpreis;
    double gesamtpreis;
    int anzahl;
    int rechnungsNummer;

    public Rechnung() {

    }

    public String Inhalt() throws IOException {

        File f =new File("E:\\Java\\Java_Aufgaben\\PT Labor 7\\rechnungen");
        File[] files = f.listFiles();


        /*for (int i= 0; i<files.length;i++){
            System.out.println(files[i].getName());

        }*/

        for (int i=0; i<files.length;i++){

            FileReader fr = new FileReader("E:\\Java\\Java_Aufgaben\\PT Labor 7\\rechnungen\\"+files[i].getName());
            BufferedReader br = new BufferedReader(fr);

            String zeile1 = br.readLine();
            //System.out.println(zeile1);
            String zeile2 = br.readLine();
            //System.out.println(zeile2);
            String zeile3 = br.readLine();
            //System.out.println(zeile3);
            String zeile4 = br.readLine();
            //System.out.println(zeile4);
            String zeile5 = br.readLine();
            //System.out.println(zeile5);
            String zeile6 = br.readLine();
            //System.out.println(zeile6);
            String zeile7 = br.readLine();
            //System.out.println(zeile7);
            String zeile8 = br.readLine();
            //System.out.println(zeile8);

            //Zeile1
            int Zeile1Result = Integer.parseInt(zeile1.replaceAll("Rechnung","").trim());

            //Zeile3
            String[] Zeile3Result = zeile3.split(":");
            String Kundennummer =Zeile3Result[1].trim();

            //Zeile4
            String[] Zeile4Result = zeile4.split(":");
            String Kundenname = Zeile4Result[1].trim();

            //Zeile5
            String[] Zeile5Result = zeile5.split(":");
            String Artikelname = Zeile5Result[1].trim();

            //Zeile6
            String[] Zeile6Result = zeile6.split(":");
            double Einzelpreis = Double.parseDouble(Zeile6Result[1].trim().replaceAll("€","").replace(",","."));

            //Zeile7
            String[] Zeile7Result = zeile7.split(":");
            int Anzahl = Integer.parseInt(Zeile7Result[1].trim().trim()) ;

            //Zeile8
            String[] Zeile8Result = zeile8.split(":");
            double Gesamtpreis = Double.parseDouble(Zeile8Result[1].trim().replaceAll("€","").replace(",","."));




            System.out.println(Zeile1Result+"; "+Kundennummer+"; "+Kundenname+"; "+Artikelname+"; "+Einzelpreis+"; "+Anzahl+"; "+Gesamtpreis);


        }

        return null;
    }






}
