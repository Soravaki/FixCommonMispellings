import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.util.TreeMap;

public class Main {
    Map<String, String> misspellings;
    public Main() throws IOException {
        Scanner m = new Scanner(System.in);
        System.out.println("Input Sentence:");
        String s = m.nextLine();
        Misspelling(s);
    }

    public void Misspelling(String s) throws IOException {
        Hashmap();
        String[] line = s.split(" ");
        for (int i=0;i<line.length;i++){
            if (misspellings.containsKey(line[i])){
                
            }
        }
    }

    public void Hashmap() throws IOException {

        misspellings = new TreeMap<>();
        Scanner sc = new Scanner(new File("mispellings.txt"));
        while (sc.hasNextLine()){
            String[] words = sc.nextLine().split(" ");
            misspellings.put(words[0], words[1]);
        }
    }
}
