package JavaCollections.OptionalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class fileToList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        File file = new File ("./src/main/resources/collections/file.txt");

        try( Scanner src = new Scanner(file)){
            while (src.hasNextLine()){
                list.push(src.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        try(FileWriter writer = new FileWriter(file))
        {
            int size=list.size();
            for (int i=0; i<size; i++){
                writer.write(list.pop());
                writer.append('\n');
            } }
        catch (IOException e){
            System.out.println(e);
        }
    }
}

