package homework12;

// Вывести список файлов и каталогов выбранного каталога на диске.
// Файлы и каталоги должны быть распечатаны отдельно.

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Part3T36 {
    public static void main(String[] args) {

        ArrayList<String> files = new ArrayList<>();
        ArrayList<String> roots = new ArrayList<>();

        File file = new File("D:\\Download");

        for (File f : Objects.requireNonNull(file.listFiles())) {
            if (f.isFile()) {
                files.add(f.getAbsolutePath());
            } else if (f.isDirectory()) {
                roots.add(f.getAbsolutePath());
            }
        }

        System.out.println("FILES:");
        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i));
        }

        System.out.println("ROOTS");
        for (int i = 0; i < roots.size(); i++) {
            System.out.println(roots.get(i));
        }

    }
}
