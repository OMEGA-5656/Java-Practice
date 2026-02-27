class Teacher{
    String Name;
    Teacher(String Name){
        this.Name = Name;
    }
}
class Student{
    String Name;
    Student(String Name){
        this.Name = Name;
    }
}

class Department{

}

class College{
    String collName;
    Department department;
    College(String collName,Department department){
        this.collName = collName;
        this.department = department;
    }
    void display(){
        System.out.println(collName+" has dept "+department);
    }
}

public class AssociationDemo {
    public static void main(String args[]){
        Teacher t = new Teacher("xyz");
        Student s = new Student("abc");
        System.out.println(s.Name+" is taught by "+t.Name);
    }
}
