package l2;

/**
 * @date: 31.12.17
 * author: nevernew
 * палиндром
 * перевернуть строку и сравнить ее
 */


public class ReverseEqualsString {
    static boolean polinomEquals(String text){
        // регулярное выражение удаляющее знаки
        String res = text.replaceAll("[^a-zA-Z0-9]","");
        // переводим в нижний регистр
        res = res.toLowerCase();
        // подключаем билдер и реверсим строку
        StringBuilder stringBuilder = new StringBuilder(res);
        String rivres = stringBuilder.reverse().toString();
        // сравниваем два объекта по содержимому
        boolean x = rivres.equals(res);
        return x;
    }

    public static void main(String[] args) {
        System.out.println(polinomEquals("Madam, I'm Adam!"));


    }

}
