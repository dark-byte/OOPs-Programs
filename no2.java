class Student {
    String usn;
    String name;
    String branch;
    String phoneNumber;

    public Student(String usn, String name, String branch, String phoneNumber) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                " usn = " + usn +
                ", name = " + name +
                ", branch=" + branch +
                ", phoneNumber=" + phoneNumber +
                " }";
    }
}


public class no2 {
    public static void main(String[] args) {
        Student one = new Student("01", "Arun", "CSE", "89898989");
        Student two = new Student("02", "Banu", "CSE", "89898989");
        Student three = new Student("03", "Chandu", "CSE", "89898989");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
