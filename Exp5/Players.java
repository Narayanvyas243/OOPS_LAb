// using override using same function in subclass thaat are in superclass
class Player {
    String name;
    int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player {
    public Cricket_Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing cricket.");
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing hockey.");
    }
}

class Football_Player extends Player {
    public Football_Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing football.");
    }
}

public class Players {
    public static void main(String[] args) {
        Cricket_Player crick = new Cricket_Player("Narayan", 20);
        crick.play();
        crick.train();

        Hockey_Player hock = new Hockey_Player("Sarthak", 21);
        hock.play();
        hock.train();

        Football_Player foot = new Football_Player("Kushal", 12);
        foot.play();
        foot.train();
    }
}