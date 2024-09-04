public class CopyConst {
    public static void main(String args[]){
        Students s1 = new Students();
        s1.name = "Tanmay";
        s1.rollno = 33;
        s1.password = "abcd";
        s1.marks[0] = 79;
        s1.marks[1] = 70;
        s1.marks[2] = 90;

        Students s2 = new Students(s1);
        s2.password = "xyz";
        s1.marks[2]=99;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
            System.out.println(s2.name);
            System.out.println(s2.password);
            System.out.println(s1.password);

        }
    }
}

class Students{
    String name;
    int rollno;
    int marks[];
    String password;

    //Copy Constructor
    Students(Students s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = new int[3];
        this.marks = s1.marks;
    }

    Students(){
        marks = new int[3];
        System.out.println("Tanmay");
    }
    
    Students(String name){
        marks = new int[3];
        this.name = name;
    }
    
    Students(int rollno){
        marks = new int[3];
        this.rollno = rollno;
    }
}


