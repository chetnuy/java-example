package core.arraylist;

import java.util.ArrayList;

/**
 * date: 02.12.17
 * author: nevernew
 */


public class Main {


    public static void main(String[] args) {
        ArrayList<Employee> one = new ArrayList<Employee>();
        //add добавить элемент
        one.add(new Employee("jesica",  24));
        one.add(new Employee("johtn", 32));

        //size - количество элементов в массиве
        System.out.println(one.size());
    }
}
