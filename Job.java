public abstract class Job {

    protected String nameCompany;
    protected double salary;
    protected String position;

    public Job(String nameCompany, double maxSalary, String position) {
        this.nameCompany = nameCompany;
        this.salary = maxSalary;
        this.position = position;
    }

    public abstract String getNameCompany();
    public abstract double getSalary();
    public abstract String getPosition();
    
    
}