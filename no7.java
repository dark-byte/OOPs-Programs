interface Resume{
    void biodata();
}

class Teacher implements Resume{
    String name, qual;
    int age;

    public Teacher(String name, String qual, int age){
        this.name = name;
        this.qual = qual;
        this.age = age;
    }

    public void biodata(){
        System.out.printf("Name = %s\nQualifications = %s\nAge = %d\n", name, qual, age);
    }
}

class Student implements Resume{

    String name, branch;
    double cgpa;

    public Student(String name, String branch, double cgpa){
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public void biodata(){
        System.out.printf("Name = %s\nBranch = %s\nCGPA = %f\n", name, branch, cgpa);
    }
}

public class no7{

    public static void main(String args[]){
        Teacher t = new Teacher("Arun Kumar","Phd", 54);
        t.biodata();

        Student s = new Student("Aryan","CSE",8.9);
        s.biodata();
    }
}