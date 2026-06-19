class GrandFather {
    String name = "Oli";
    void company() 
  {
        System.out.println(name + " Owns a company");
    }
}
class Father extends GrandFather {
    public Father()
  {
        this.name = "S Alam";
    }
    void car() 
  {
        System.out.println(name + " Owns a car");
    }
}
class Son  extends Father 
{
    public Son(String n ) 
  {
        this.name = n;
    }
    void doesNothing() {
        System.out.println("Eat sleep, Repeat");
    }
}
public class TaskOne {
    public static void main(String[] args) {
        Son son = new Son("Raiyanul");
        son.company();
        son.car();
        son.doesNothing();
    }
}
