package l3;

/**
 * date:             02.01.18
 * author:         nevernew
 */
public class DemoBox {
    public static void main(String[] args) {

        Object object1 = new Object();
        Object object2 = new Object();

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());

        ComplexNumber  complexNumber1 = new ComplexNumber(1,2);
        ComplexNumber complexNumber2 = new ComplexNumber(1,2);
        System.out.println(complexNumber1.hashCode());
        System.out.println(complexNumber2.hashCode());
        System.out.println(complexNumber1.equals(complexNumber2));
        System.out.println(object1.equals(object2));
    }

}
