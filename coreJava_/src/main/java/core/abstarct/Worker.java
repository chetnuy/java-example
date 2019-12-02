package core.abstarct;

/**
 * date: 02.12.17
 * author: nevernew
 */


public class Worker extends Person {
    public String avalibly() {
        return "Yap";
    }


    public static void main(String[] args) {

        Person person = new Person() {
            @Override
            public String avalibly() {
                return null;
            }
        };
        System.out.println(person.toString());

    }


}
