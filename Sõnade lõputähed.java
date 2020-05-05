//Taavi Vestel, sõnade lõputähed

import java.util.*;
import java.io.*;

public class KT {

    //skännib failist kõik sõnad, paneb stringi ning toob need kõik välja
    public static void main(String[] args) throws Exception {
        InputStream fileInput = new FileInputStream("E:\\Java\\RndStory.txt");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(fileInput));
        String line = buffer.readLine();
        StringBuilder createString = new StringBuilder();

        while(line != null){
            createString.append(line).append("\n");
            line = buffer.readLine();
        }
        String fileOutput = createString.toString();
        //System.out.println(fileOutput);

        lastChar(fileOutput);



    }


    //võtab välja toodud sõnad ning võtab ainult viimased tähed igast sõnast
    public ArrayList<Character> lastLet = new ArrayList<>();

    static ArrayList<Character> lastChar(String lines){
        for (int i = 1; i < lines.length(); i++) {

            //paneb välja tingimused, mida ei tuua välja loendis

            if (lines.charAt(i) == ' '){
                if(lines.charAt(i - 1) == ','){
                   
                }else if(lines.charAt(i - 1) == '.'){
                    
                }else if(lines.charAt(i - 1) == '!'){

                }else if(lines.charAt(i - 1) == '?'){

                }else if(lines.charAt(i - 1) == ';'){

                }else if(lines.charAt(i - 1) == ':'){
                    
                }else if(lines.charAt(i - 1) == '-'){

                }else if(lines.charAt(i - 1) == '"'){

                }else{
                    System.out.print(lines.charAt(i - 1) + " ");
                }
            }
        }
        final ArrayList<Character> lastChar = new ArrayList<>();

        //toob välja kõik tähed

        return lastChar;       
    
    }
    
}