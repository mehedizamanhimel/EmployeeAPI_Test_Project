package models;

public class createEmployee {

    private String name;
    private String salary;
    private String age;
    private String id;

    public createEmployee(){}

    // used for post request
    public createEmployee(String name, String salary, String age){
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public createEmployee(String id, String name, String salary, String age){
        setId(id);
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
