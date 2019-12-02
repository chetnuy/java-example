package l2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @date: 01.01.18
 * author: nevernew
 * упорядочиваем данные в пьесе
 *
 */
public class PlayRoll {
        static  String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder result = new StringBuilder();

        for (int i =0; i<roles.length; i++){   // для каждой роли
            result.append(roles[i]+":"+"\n");
            for (int y=0; y<textLines.length; y++){ // перибираем текст

                StringBuilder text = new StringBuilder(textLines[y]); // билдер для текста
                StringBuilder rol = new StringBuilder(roles[i]); // билдер для роли

                int pp = (text.indexOf(String.valueOf(rol)+":"));
                if (pp==0){
                    result.append(y+1+") ");
                    result.append(text.delete(pp, rol.length()+2));
                    result.append("\n");
                }

                }
                result.append("\n");
            }
            return String.valueOf(result);

        }

    public static void main(String[] args) {
        String [] roles= {
                "Городничий",
                "Акакий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор Городничий?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};


        System.out.println(printTextPerRole(roles,textLines));

    }

}
