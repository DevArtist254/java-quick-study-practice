package Worker;

public class Worker {
    protected String name;
    protected String endDate;
    protected int birthDate;

    public Worker(){}

    public Worker(String name, String endDate, int birthDate){
        this.name = name;
        this.endDate = endDate;
        this.birthDate = birthDate;
    }

    public int getAge(){
        return 2024 - birthDate;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
