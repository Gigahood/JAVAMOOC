public class Person implements Comparable{

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return name + " " + salary;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;
        
        if(this.salary < p.salary){
            return 1;
        }else if(this.salary == p.salary){
            return 0;
        }else{
            return -1;
        }
    }
    
    public int compareTo(Person other){
        //Person p = (Person)o;
        
        if(this.salary < other.salary){
            return 1;
        }else if(this.salary == other.salary){
            return 0;
        }else{
            return -1;
        }
    }
}
