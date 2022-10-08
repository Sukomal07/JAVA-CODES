public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sukomal";
        s1.roll = 12;
        s1.password = "jnjk";
        s1.marks[0]=100;
        s1.marks[1]=60;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s2.password = "mbbk";
        s1.marks[1]=90;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks= s1.marks;
    }

    // Shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks= s1.marks;
    // }

    //deep copy constructor
    // Student(Student s1){
    //     this.name= s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[2];
    //     for(int i=0; i<marks.length; i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }
    Student() {
        System.out.println("constructor is called....");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
