class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return 0;  
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8;
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate;
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Alice", 100);
        Worker salariedWorker = new SalariedWorker("Bob", 200);

        System.out.println("Weekly pay for " + dailyWorker.name + ": ₹" + dailyWorker.computePay(48));
        System.out.println("Weekly pay for " + salariedWorker.name + ": ₹" + salariedWorker.computePay(50));
    }
}
