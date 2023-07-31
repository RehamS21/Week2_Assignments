public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(){

    }

    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        setSalary(salary);
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        if(salary >= 1000)
            this.salary = salary;
        else
            System.out.println("Invalied salary");
    }

    public int getSalary(){
        return salary;
    }

    public double getAnnualSalary(){
        // 12 means the months of the year
        return 12 * getSalary();
    }
    public int raisedSalary(int percent){
        if(percent > 0) {
            double bouns = percent / 100.0;
            int newSalary = (int) Math.round((this.getSalary() * bouns)); // round the bouns to nearest number and casting it to integer
            setSalary((this.getSalary() + newSalary));
            return this.getSalary();
        }else {
            System.out.println("Invalied percentage");
            return getSalary();
        }

    }

    public String toString(){

        return "Employee : "+getName()+" with id : "+ getId()+" has a salary : "+getSalary();
    }



}
