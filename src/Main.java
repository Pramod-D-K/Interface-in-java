/*
Interface in java
 */


interface Animal{
    public abstract void sound();//implicitly public abstract
    //protective is not allowed in the interface
    //public by default is the abstract
    public void run();
    //non default also abstract
    void walk();
    int x = 0;

    //private implicitly not abstract [java 8]   must have body
    private void read(){
        System.out.println("private in interface");
    }
    //static and default are not implicitly abstract and must have body
    default  void see(){
        System.out.println("default in interface");
    }
    static void write(){
        System.out.println("static in interface");
    }
}

abstract class A implements Animal{

}
class B extends A{
    public void sound(){

    }

    @Override
    public void run() {

    }

    public void walk(){

    }
}
public class Main {
    public static void main(String[] args) {

    }
}
