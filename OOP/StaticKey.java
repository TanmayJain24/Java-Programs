public class StaticKey {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname = "Garud";

        Student s2 = new Student();
        System.out.println(s2.schoolname);

        Student s3 = new Student();
        s3.schoolname = "Skn";
        
        System.out.println(s2.schoolname);

        System.out.println(s2.percentage(59,67,86));
        System.out.println(s3.percentage(20, 60, 50));
    }
}

class Student{
    String name;
    int rollno;

    static int percentage(int math, int phy, int chem){
        return (math + phy + chem)/3;
    }

    static String schoolname;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}


