package core.reflection;

import java.util.Scanner;
import java.lang.reflect.*;

/**
 * data: 02.12.17
 * @author: nevernew
 * * работа с рефлекшеном и доступ к полям класса
 */


public class ReflectionTest {

    public static void main(String[] args) {

        String name;

        if (args.length > 0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Input class name java.util.Date ");
            name = in.next();

        }
        try {
            Class c1 = Class.forName(name);
            Class supercl = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class)
                System.out.print(" extends " + supercl.getName());

            System.out.print("\n{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printFields(c1);
            System.out.println("}");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        System.exit(0);
    }

    static void printConstructors(Class c1)
    {
        Constructor[] constructors = c1.getDeclaredConstructors();

        for (Constructor c: constructors){
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length()>0)
                System.out.println(modifiers+ " ");
            System.out.println(name + ")");
            // вывести типы параметров
            Class [] paramTypes = c .getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                if (j > 0 ) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");

    }
}
    static void printMethods(Class c1){
        Method [] methods = c1.getDeclaredMethods();
        for(Method m: methods){
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");


            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0 ; j < paramTypes.length; j++)
            {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    /**
     * Выводит все
     поля класса
     * @param cl
    a class
     */
    static void printFields(Class cl)
    {
        Field[] fields = cl .getDeclaredFields();
        for (Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");

        }
    }
}