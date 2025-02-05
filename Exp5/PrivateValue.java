class Baseclass {
    private int PrivateVal = 25; 

    public void BaseclassMethod() {
        System.out.println("Baseclass method: " + PrivateVal); 
    }
}

class Deriveclass extends Baseclass {
    
    public void DeriveclassMethod() {
         System.out.println("Deriveclass method: " + PrivateVal); 
    }
}

public class PrivateValue {
    public static void main(String[] args) {
        Deriveclass der = new Deriveclass();
        der.DeriveclassMethod(); 
    }
}