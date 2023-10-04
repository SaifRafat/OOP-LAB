//Java program for demonstrate multiple inheritance

interface Parent1{
    void method1();
}

interface Parent2{
    void method2();
}

class Child implements Parent1,Parent2{
    public void method1(){
        System.out.println("Method 1 from Parent1");
    }

    public void method2(){
        System.out.println("Method 2 from Parent2");
    }
}

public class Multiple_Inheritance{
    public static void main(String[] args){
        Child child = new Child();
        child.method1();
        child.method2();
    }
}

