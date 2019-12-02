package core.objects;

//изменение объектов и переменных с помощью методов


class MethodChangeVaribalse {

  private static void Summ(Emploer z){
        z.x++;
    }
  static void SummIng(int z){
        z++;
    }
  static void main(String[] args) {
        int x = 10;
        Emploer emploer = new Emploer();
        Summ(emploer);
        SummIng(x);

        System.out.println("object add varibles "+emploer.x);
        System.out.println("int add "+ x);
    }
}
