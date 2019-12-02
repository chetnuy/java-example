package core.input;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @date: 01.12.17
 * @author: nevernew
 * @root: чтение и запись в файл
 */
public class InputOutputFile {
    public static void main(String[] args) throws IOException {

        //Запись и создание файла
        //Cодержимое перезаписывается
        PrintWriter file = new PrintWriter("/mnt/file.txt");
        file.println("new string");
        file.close();

        // чтение файла
        Scanner in = new Scanner(Paths.get("/mnt/file.txt"), "UTF-8");
        System.out.println(in.nextLine());



    }

}
