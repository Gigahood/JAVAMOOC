public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    
//    public int compareTo(Object o) {
//        Student newType = (Student)o;
//        
//        return this.name.compareToIgnoreCase(newType.name);
//    }
    @Override
    public int compareTo(Student other){
        return this.getName().compareToIgnoreCase(other.getName()); 
    }

}
