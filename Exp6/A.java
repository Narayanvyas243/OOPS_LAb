package p;

public class A {
    public void publicMethod(){
        System.out.println(" this is a public method");
    }
    private void privateMethod(){
        System.out.print(" this is a private method");
    }
    void defaultMethod(){
    System.out.print(" this is a default method");
    }
    protected void protectedMethod(){
        System.out.print(" this is a protected method ");
    }
    public static void main(String [] args){
        A a = new A();
        a.publicMethod();
        a.privateMethod();
        a.protectedMethod();
        a.defaultMethod();
    }
}