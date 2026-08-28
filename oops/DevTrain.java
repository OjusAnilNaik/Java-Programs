package oops;
interface Developer {
    void writeCode();
}

interface Trainer {
    void conductTraining();
}

class TechnicalEmployee implements Developer, Trainer {
    public void writeCode() {
        System.out.println("Writing code");
    }

    public void conductTraining() {
        System.out.println("Conducting training");
    }
}

public class DevTrain {
    public static void main(String[] args) {
        TechnicalEmployee emp = new TechnicalEmployee();
        emp.writeCode();
        emp.conductTraining();
    }
}
