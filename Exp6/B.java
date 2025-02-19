package Q;

import p.A;

public class B extends A{
    public static void main(String [] args){
        A a = new A();
        a.publicMethod();
        // error:  accessing protected method without extending A
        B b = new B();
        b.protectedMethod();
        
    }
    
}
