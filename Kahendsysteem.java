/* Teata, kas sisestatud neljakohaline arv koosneb vaid ühtedest ja nullidest.
* Kui tingimus on tõene, väljasta selle kahendsüsteemi arvu väärtus kümnendsüsteemis.
* Võrreldes eelmisega võib sisestatud kahendsüsteemi arv olla kuni kümnekohaline. 
Eraldi kuvatase välja, millisele väärtusele iga "üks" selles arvus vastab.*/ 

import java.util.Scanner;
public class Kahendsysteem{

    public static void main(String[] args) {
        String num;

        //Kasutaja sisestab arvu
        Scanner in = new Scanner(System.in);  
        System.out.println("Sisestage 4-kohaline arv kahendsüsteemis (arv peab sisaldama ainult 1 ja/või 0)");
        num = in.next();

        //Kontrollitakse, kas sisestatud arv on binaararv (sisaldab ainult 0 ja 1).
        if (num.matches("[01]+")) {
            System.out.println("Tegemist on binaararvuga");

        //Kümnendarvu teisendamine
            System.out.println("Kümnendarvuna on antud arv: " + Integer.parseInt(num, 2));
        }else{
            System.out.println("See ei ole binaararv!");
          
        }


       
    }
}


        
