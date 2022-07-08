package assignment;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.util.ArrayList;  
   
public class Q46 {  
      
    public static void main(String[] args) throws Exception {  
        String line, word = "";  
        int count = 0, maxCount = 0;  
        ArrayList<String> words = new ArrayList<String>();  
          
        //Opens file in read mode  
        String fileReadPath = "C:/Users/bhatt/Desktop/demo1.txt ";
        FileReader file = new FileReader(fileReadPath);  
        BufferedReader br = new BufferedReader(file);  
        String[] arrOfStr = fileReadPath.split("[, ?.@]+");
        
        for (String a : arrOfStr)
            System.out.println(a);
        //Reads each line  
        while((line = br.readLine()) != null) {  
            String string[] = line.toLowerCase().split("C:/Users/bhatt/Desktop/demo1.txt /");  
            //Adding all words generated in previous step into words  
            for(String s : words){  
                //words.add(s);  
            }  
        }  
          
        //Determine the most repeated word in a file  
        for(int i = 0; i < words.size(); i++){  
            count = 1;  
            //Count each word in the file and store it in variable count  
            for(int j = i+1; j < words.size(); j++){  
                if(words.get(i).equals(words.get(j))){  
                    count++;  
                }   
            }  
            //If maxCount is less than count then store value of count in maxCount   
            //and corresponding word to variable word  
            if(count > maxCount){  
                maxCount = count;  
                word = words.get(i);  
            }  
        }  
          
        System.out.println("Most repeated word: " + word);  
        br.close();  
    }  
}  