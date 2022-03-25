import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File Games = new File("C\\Games");

        File temp = new File("C:\\Games\\temp");
        if (temp.mkdir()) {
            System.out.println("Директория temp создана");
        }

        File tempFile = new File("C:\\Games\\temp", "temp.txt");
        try {
            if (tempFile.createNewFile()) {
                System.out.println("Файл temp создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File src = new File("C:\\Games\\src");
        if (src.mkdir()) {
            directMessage(src);
        }

        File saveGames = new File("C:\\Games\\saveGames");
        if (saveGames.mkdir()) {
            directMessage(saveGames);
        }

        File main = new File("C:\\Games\\src\\main");
        if (main.mkdir()) {
            directMessage(main);
        }

        File mainFile = new File("C:\\Games\\src\\main", "main.java");
        try {
            if (mainFile.createNewFile()) fileMessage(mainFile);
        } catch (IOException ex) {
            System.out.println((ex.getMessage()));
        }

        File utilsFile = new File("C:\\Games\\src\\main", "utils.java");
        try {
            if (utilsFile.createNewFile()) {
                fileMessage(utilsFile);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File test = new File("C:\\Games\\src\\test");
        if (test.mkdir()) {
            directMessage(test);
        }

        File res = new File("C:\\Games\\res");
        if (res.mkdir()) {
            directMessage(res);
        }

        File drawables = new File("C:\\Games\\res\\drawables");
        if (drawables.mkdir()) {
            directMessage(drawables);
        }

        File vectors = new File("C:\\Games\\res\\vectors");
        if (vectors.mkdir()) {
            directMessage(vectors);
        }

        File icons = new File("C:\\Games\\res\\icons");
        if (icons.mkdir()) {
            directMessage(icons);
        }
    }

    public static void directMessage(File file) {
        try (FileWriter writer = new FileWriter("C:\\Games\\temp\\temp.txt", true)) {
            writer.write("Директория " + file.getName() + " успешно создана \n    ");
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void fileMessage(File file) {
        try (FileWriter writer = new FileWriter("C:\\Games\\temp\\temp.txt", true)) {
            writer.write("Файл " + file.getName() + " успешно создан\n    ");
            System.out.println();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
