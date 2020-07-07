package JavaCollections.OptionalTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class listToCatalog {
    static ArrayList<File> dir = new ArrayList<>();

    public static void main(String[] args) {
        File myDir = new File("src");
        try {
            dir = list(myDir);
        } catch (IOException e) {
        }
        int s = dir.size();
        System.out.println("Список из элементов каталога ["+myDir+"] и его подкаталогов:");
        for (int i = 0; i < dir.size(); i++) {
            System.out.println(dir.get(i).getPath());
        }
    }
    public static ArrayList<File> list(File file) throws IOException {
        File[] currentSeekingFolderContent = file.listFiles();
        for (int i = 0; i < currentSeekingFolderContent.length; i++) {
            if (currentSeekingFolderContent[i].isDirectory()) {
                dir.add(currentSeekingFolderContent[i]);
                list(currentSeekingFolderContent[i]);
            }
        }
        return dir;
    }
}
