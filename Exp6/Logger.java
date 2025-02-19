final public class Logger {
    public void logMessage(){
        System.out.print(" I am a logger method");
    }
    
}
class ExtendedLogger extends Logger{

}
class Main{
    public static void main(String [] args){
        Logger l = new Logger();
        l.logMessage();
    }
}
