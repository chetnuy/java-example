package l1;

/**
 * @date: 30.12.17
 * @author: nevernew
 * ищем количество високосных кодов от рхс до указанной даты
 */


public class GregoryCal {
    public static int summYear (int year){
        year = (year/4)+(year/400)-(year/100);
        return year;
    }
    public static void main(String[] args) {
        GregoryCal gregoryCal = new GregoryCal();
        System.out.println(gregoryCal.summYear(100));
    }
}
