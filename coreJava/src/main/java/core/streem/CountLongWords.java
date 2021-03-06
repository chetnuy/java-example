package core.streem;
/**
 * Программа считывает файл как поток байт
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import java.io.IOException;

public class CountLongWords {
    public static void main(String[] args) throws IOException {

         String contents = new String (Files.readAllBytes (Paths .get (
        "/home/nevernew/hello.c")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long count = 0;
        for (String w : words)
        {
        if (w.length() > 4) count++;
         }
        System.out.println(count);
        System.out.println(words);
        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);

        count =
        words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);
         }
}